package com.fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.activity.ProjectActivity;
import com.activity.SampleRegistrationFormActivity;
import com.chemicalprospecting.DKHtsxItemData;
import com.chimecal.ui.ListViewCompat;
import com.chimecal.ui.SlideView;
import com.chimecal.ui.SlideView.OnSlideListener;
import com.gumei.ui.ListViewCompatChamecal;
import com.gumei.ui.ListViewCompatChamecal.OnLoadListener;
import com.gumei.ui.ListViewCompatChamecal.OnRefreshListener;
import com.kanyuan.circleloader.CircleLoader;
import com.kanyuan.circleloader.R;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ChemicalFragment extends Fragment
		implements OnClickListener, OnSlideListener, OnRefreshListener, OnLoadListener {

	private final static String TAG = ChemicalFragment.class.getName();
	private ListViewCompatChamecal mListView;
	private List<MessageItem> mChemicalMessageItems = new ArrayList<MessageItem>();
	private CircleLoader circleLoader;
	private SlideView mLastSlideViewWithStatusOn;
	private String deleteItemCode;
	private String lookItmeCode;
	private DKHtsxItemData tempDKHtsxItemData;
	private SlideAdapter adapter;
	private btnListener mylookListener;
	private Boolean isFirstLoad = true;

	/**
	 * Create a new instance of ChemicalFragment, providing "num" as an
	 * argument.
	 */
	static ChemicalFragment newInstance(int num) {
		ChemicalFragment f = new ChemicalFragment();
		// Supply num input as an argument.
		Bundle args = new Bundle();
		args.putInt("num", num);
		f.setArguments(args);
		return f;
	}

	// 查看的回调接口
	public interface btnListener {
		public void lookMore(int index);
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			mylookListener = (btnListener) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString() + " must implement OnHeadlineSelectedListener");
		}
		System.out.println("ChemicalFragment--->onAttach");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onCreateView(android.view.LayoutInflater,
	 * android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.user_opinion, container, false);
		TextView titleTv = (TextView) view.findViewById(R.id.list_title);
		titleTv.setText("方法登记表");
		ImageView exitImage = (ImageView) view.findViewById(R.id.iv_back);
		ImageView addImage = (ImageView) view.findViewById(R.id.iv_refresh);
		circleLoader = (CircleLoader) view.findViewById(R.id.circle_view_loader);
		exitImage.setOnClickListener(this);
		addImage.setOnClickListener(this);
		mListView = (ListViewCompatChamecal) view.findViewById(R.id.listView);
		loadData(ListViewCompat.REFRESH);
		if (!isFirstLoad) {
			circleLoader.setVisibility(View.INVISIBLE);
		} else {
			isFirstLoad = false;
		}
		adapter = new SlideAdapter();
		mListView.setAdapter(adapter);
		mListView.setOnRefreshListener(this);
		mListView.setOnLoadListener(this);
		mListView.setLoadEnable(false);

		// mData = queryAll();
		return view;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onResume()
	 */
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		// circleLoader.setVisibility(View.INVISIBLE);
		loadData(ListViewCompat.REFRESH);
		System.out.print("onresue");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onDetach()
	 */
	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		// 退出activity
		getActivity().finish();
		getActivity().overridePendingTransition(R.anim.animation_enterfromleft, R.anim.animation_fadefromright);
		super.onDetach();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.iv_back:
			// 退出activity
			getActivity().finish();
			getActivity().overridePendingTransition(R.anim.animation_enterfromleft, R.anim.animation_fadefromright);
			break;
		case R.id.iv_refresh:
			// 添加新的项目
			startActivity(new Intent(getActivity(), SampleRegistrationFormActivity.class));
			break;
		default:
			break;
		}
	}

	// 提取出来方便点
	// public final class ViewHolder {
	// public TextView title;
	// public TextView info;
	// public Button viewBtn;
	// }

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
		List<DKHtsxItemData> datas = ProjectActivity.kjdb.findAll(DKHtsxItemData.class);
		List<MessageItem> result = new ArrayList<MessageItem>();
		for (DKHtsxItemData u : datas) {
			MessageItem item = new MessageItem();
			item.title = u.getItemCode();
			item.msg = u.getExploratoryLine();
			result.add(item);
		}
		return result;
	}

	// 获取本地数据库中的数据
	private List<Map<String, Object>> queryAll() {
		// 这里是查找全部数据的
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		List<DKHtsxItemData> datas = ProjectActivity.kjdb.findAll(DKHtsxItemData.class);
		System.out.print(datas.size());
		Map<String, Object> map = new HashMap<String, Object>();
		StringBuilder str = new StringBuilder();
		for (DKHtsxItemData u : datas) {
			str.append(u.getItemCode());
			Log.e(TAG, str.toString());
			map.put("title", u.getItemCode());
			map.put("info", u.getExploratoryLine());
			list.add(map);
		}
		return list;
	}

	private Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			@SuppressWarnings("unchecked")
			List<MessageItem> result = (List<MessageItem>) msg.obj;
			switch (msg.what) {
			case ListViewCompat.REFRESH:
				mListView.onRefreshComplete();
				mChemicalMessageItems.clear();
				mChemicalMessageItems.addAll(result);
				break;
			case ListViewCompat.LOAD:
				mListView.onLoadComplete();
				mChemicalMessageItems.addAll(result);
				break;
			case 2:
				mListView.onLoadComplete();
				Toast.makeText(getActivity(), "已加载全部！", Toast.LENGTH_SHORT).show();
				break;
			}
			mListView.setResultSize(result.size());
			adapter.notifyDataSetChanged();
			circleLoader.setVisibility(View.INVISIBLE);
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
			return mChemicalMessageItems.size();
		}

		@Override
		public Object getItem(int position) {
			return mChemicalMessageItems.get(position);
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
				View itemView = mInflater.inflate(R.layout.item_listview_delete_chemical, null);
				slideView = new SlideView(getActivity());
				slideView.setContentView(itemView);
				holder = new ViewHolder(slideView);
				slideView.setOnSlideListener(ChemicalFragment.this);
				slideView.setTag(holder);
			} else {
				holder = (ViewHolder) slideView.getTag();
			}
			MessageItem item = mChemicalMessageItems.get(position);
			item.slideView = slideView;
			item.slideView.shrink();
			holder.title.setText(item.title);
			holder.msg.setText(item.msg);
			holder.deleteHolder.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// delete the item
					MessageItem deleteItem = mChemicalMessageItems.get(position);
					deleteItemCode = "itemCode=" + "'" + deleteItem.title + "'";
					ProjectActivity.kjdb.deleteByWhere(DKHtsxItemData.class, deleteItemCode);
					mChemicalMessageItems.remove(position);
					adapter.notifyDataSetChanged();
				}
			});
			holder.edit.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// 查看详细列表
					MessageItem lookItem = mChemicalMessageItems.get(position);
					lookItmeCode = "itemCode=" + "'" + lookItem.title + "'";
					List<DKHtsxItemData> datas = ProjectActivity.kjdb.findAllByWhere(DKHtsxItemData.class,
							lookItmeCode);

					if (!datas.isEmpty()) {
						tempDKHtsxItemData = datas.get(0);
						int myId = tempDKHtsxItemData.getId();
						mylookListener.lookMore(myId);
					}
					adapter.notifyDataSetChanged();
				}
			});
			return slideView;
		}
	}

	public class MessageItem {
		public String title;
		public String msg;
		public SlideView slideView;
	}

	private static class ViewHolder {
		public TextView title;
		public TextView msg;
		public TextView deleteHolder;
		public TextView edit;

		ViewHolder(View view) {
			title = (TextView) view.findViewById(R.id.child_id);
			msg = (TextView) view.findViewById(R.id.child_content);
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
		Message msg = handler.obtainMessage();
		msg.what = 2;
		msg.obj = mChemicalMessageItems;
		handler.sendMessage(msg);
	}

	@Override
	public void onRefresh() {
		// TODO Auto-generated method stub
		loadData(ListViewCompat.REFRESH);
	}

}
