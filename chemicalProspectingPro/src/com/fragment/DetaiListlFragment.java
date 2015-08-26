package com.fragment;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.kymjs.kjframe.database.OneToManyLazyLoader;

import com.activity.AddDetail;
import com.activity.ProjectActivity;
import com.activity.RivSedDtlLvActivity;
import com.chemicalprospecting.DKHtsxItemData;
import com.chemicalprospecting.DKHtsxSample;
import com.chimecal.ui.ListViewCompat;
import com.chimecal.ui.ListViewCompat.OnLoadListener;
import com.chimecal.ui.ListViewCompat.OnRefreshListener;
import com.chimecal.ui.SlideView;
import com.chimecal.ui.SlideView.OnSlideListener;
import com.kanyuan.circleloader.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetaiListlFragment extends Fragment implements OnSlideListener, OnRefreshListener, OnLoadListener {

	private static final String TAG = "DetaiListlFragment";
	private int myListShowId;
	private ListViewCompat mListView;
	private List<MessageItem> mMessageItems = new ArrayList<MessageItem>();
	private SlideView mLastSlideViewWithStatusOn;
	private SlideAdapter adapter;
	private int allCount = 40;
	private ImageView addDetailBtn;
	private DecimalFormat df = new DecimalFormat("0.00");

	/**
	 * Create a new instance of DetailFragment, providing "num" as an argument.
	 */
	public static DetaiListlFragment newInstance(int num) {
		DetaiListlFragment f = new DetaiListlFragment();
		Bundle args = new Bundle();
		args.putInt("num", num);
		f.setArguments(args);
		return f;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater,
	 * android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.river_sediment_detail, container, false);
		addDetailBtn = (ImageView) view.findViewById(R.id.add_detail);
		addDetailBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.putExtra("projectID", myListShowId);
				startActivity(intent.setClass(getActivity(), AddDetail.class));
				getActivity().overridePendingTransition(R.anim.animation_enterfromright, R.anim.animation_fadefromleft);
			}
		});
		mListView = (ListViewCompat) view.findViewById(R.id.list);
		mListView.setLoadEnable(false);
		loadData(ListViewCompat.REFRESH);
		adapter = new SlideAdapter();
		mListView.setAdapter(adapter);
		mListView.setOnRefreshListener(this);
		mListView.setOnLoadListener(this);
		return view;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.support.v4.app.Fragment#onAttach(android.app.Activity)
	 */
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		myListShowId = ((RivSedDtlLvActivity) activity).getMyShowId();
		super.onAttach(activity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.support.v4.app.Fragment#onResume()
	 */
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		loadData(ListViewCompat.REFRESH);
		super.onResume();
	}

	private void loadData(final int what) {
		// 这里模拟从服务器获取数据
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Message msg = handler.obtainMessage();
				msg.what = what;
				msg.obj = getData();
				handler.sendMessage(msg);
			}
		}).start();
	}

	// 测试数据
	public List<MessageItem> getData() {
		List<MessageItem> result = new ArrayList<MessageItem>();
		if (myListShowId == 0) {

		} else {
			DKHtsxItemData dkHtsxItemdata = ProjectActivity.kjdb.findById(myListShowId, DKHtsxItemData.class);
			OneToManyLazyLoader<DKHtsxItemData, DKHtsxSample> dkhtsxSample = dkHtsxItemdata.getDkhtsxSample();
			List<DKHtsxSample> itemList = dkhtsxSample.getList();
			// 遍历itemList
			for (DKHtsxSample itemData : itemList) {
				MessageItem item = new MessageItem();
				item.sampleNo = itemData.getSampleCode();
				item.color = itemData.getSamplColor();
				item.isRepeat = itemData.getRepeFlag();
				item.horizontalCoordinates = itemData.getPosX();
				item.longitudinalCoordinate = itemData.getPosY();
				item.waterProperties = itemData.getWaterProp();
				item.sampleWeight = itemData.getSampleWeight();
				item.microTopography = itemData.getMicroTopography();
				item.sizeOrNum = itemData.getSampleParticle();
				item.remarks = itemData.getRemarks();
				result.add(item);
			}
		}
		return result;
	}

	private Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			@SuppressWarnings("unchecked")
			List<MessageItem> result = (List<MessageItem>) msg.obj;
			switch (msg.what) {
			case ListViewCompat.REFRESH:
				mListView.onRefreshComplete();
				mMessageItems.clear();
				mMessageItems.addAll(result);
				break;
			case ListViewCompat.LOAD:
				mListView.onLoadComplete();
				mMessageItems.addAll(result);
				break;
			case 2:
				mListView.onLoadComplete();
				Toast.makeText(getActivity(), "已加载全部！", Toast.LENGTH_SHORT).show();
				break;
			}
			mListView.setResultSize(result.size());
			adapter.notifyDataSetChanged();
		};
	};

	private class SlideAdapter extends BaseAdapter {
		private LayoutInflater mInflater;

		SlideAdapter() {
			super();
			mInflater = getActivity().getLayoutInflater();
		}

		@Override
		public int getCount() {
			return mMessageItems.size();
		}

		@Override
		public Object getItem(int position) {
			return mMessageItems.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(final int position, View convertView, ViewGroup parent) {
			ViewHolder holder;
			SlideView slideView = (SlideView) convertView;
			if (slideView == null) {
				View itemView = mInflater.inflate(R.layout.item_listview_delete, null);
				slideView = new SlideView(getActivity());
				slideView.setContentView(itemView);
				holder = new ViewHolder(slideView);
				slideView.setOnSlideListener(DetaiListlFragment.this);
				slideView.setTag(holder);
			} else {
				holder = (ViewHolder) slideView.getTag();
			}
			MessageItem item = mMessageItems.get(position);
			item.slideView = slideView;
			item.slideView.shrink();
			holder.sampleCode.setText(item.sampleNo);
			holder.remarks.setText(item.remarks);
			holder.samplColor.setText(item.color);
			holder.repeFlag.setText(item.isRepeat);
			holder.waterProp.setText(item.waterProperties);
			holder.sampleWeight.setText(df.format(item.sampleWeight));
			holder.MicroTopography.setText(item.microTopography);
			holder.sampleParticle.setText(df.format(item.sizeOrNum));
			holder.posX.setText(df.format(item.horizontalCoordinates));
			holder.posY.setText(df.format(item.longitudinalCoordinate));
			holder.deleteHolder.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					mMessageItems.remove(position);
					adapter.notifyDataSetChanged();
					Toast.makeText(getActivity(), "删除" + position + "个条", 0).show();
				}
			});
			holder.edit.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					adapter.notifyDataSetChanged();
					Toast.makeText(getActivity(), "编辑" + position + "个条", 0).show();
				}
			});

			return slideView;
		}

	}

	private static class ViewHolder {
		public TextView sampleCode;
		public TextView posX;
		public TextView posY;
		public TextView waterProp;
		public TextView repeFlag;
		public TextView samplColor;
		public TextView sampleParticle;
		public TextView sampleWeight;
		public TextView remarks;
		public TextView MicroTopography;
		public TextView deleteHolder;
		public TextView edit;

		ViewHolder(View view) {
			sampleCode = (TextView) view.findViewById(R.id.Sample_number_text);
			remarks = (TextView) view.findViewById(R.id.Remarks_text);
			samplColor = (TextView) view.findViewById(R.id.color_text);
			repeFlag = (TextView) view.findViewById(R.id.Repeat_sample_text);
			posX = (TextView) view.findViewById(R.id.Horizontal_coordinates_text);
			posY = (TextView) view.findViewById(R.id.Longitudinal_coordinate_text);
			waterProp = (TextView) view.findViewById(R.id.Water_properties_text);
			sampleWeight = (TextView) view.findViewById(R.id.Sample_weight_text);
			MicroTopography = (TextView) view.findViewById(R.id.Micro_topography_text);
			sampleParticle = (TextView) view.findViewById(R.id.Size_or_number_text);
			deleteHolder = (TextView) view.findViewById(R.id.delete);
			edit = (TextView) view.findViewById(R.id.edit);
		}
	}

	@Override
	public void onSlide(View view, int status) {
		if (mLastSlideViewWithStatusOn != null && mLastSlideViewWithStatusOn != view) {
			mLastSlideViewWithStatusOn.shrink();
		}
		if (status == SLIDE_STATUS_ON) {
			mLastSlideViewWithStatusOn = (SlideView) view;
		}
	}

	@Override
	public void onLoad() {
		// TODO Auto-generated method stub
		if (adapter.getCount() < allCount) {
			loadData(ListViewCompat.LOAD);
		} else {
			Message msg = handler.obtainMessage();
			msg.what = 2;
			msg.obj = mMessageItems;
			handler.sendMessage(msg);

		}
	}

	public class MessageItem {
		public String serialNo;
		public String sampleNo;
		public String color;
		public String isRepeat;
		public float horizontalCoordinates;
		public float longitudinalCoordinate;
		public String waterProperties;
		public float sampleWeight;
		public String microTopography;
		public float sizeOrNum;
		public String remarks;
		public SlideView slideView;
	}

	@Override
	public void onRefresh() {
		// TODO Auto-generated method stub
		loadData(ListViewCompat.REFRESH);
	}
}
