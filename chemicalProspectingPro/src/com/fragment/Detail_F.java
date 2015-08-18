package com.fragment;

import java.util.ArrayList;
import java.util.List;

import com.activity.AddDetail;
import com.chemicalprospectingpro.R;
import com.chimecal.ui.ListViewCompat;
import com.chimecal.ui.ListViewCompat.OnLoadListener;
import com.chimecal.ui.ListViewCompat.OnRefreshListener;
import com.chimecal.ui.SlideView;
import com.chimecal.ui.SlideView.OnSlideListener;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Detail_F extends Fragment
		implements OnItemClickListener, OnSlideListener, OnRefreshListener, OnLoadListener {

	private static final String TAG = "Detail_F";

	private ListViewCompat mListView;
	private List<MessageItem> mMessageItems = new ArrayList<MessageItem>();

	private SlideView mLastSlideViewWithStatusOn;

	private SlideAdapter adapter;
	private int allCount = 40;

	private ImageView addDetailBtn;
	String data[] = new String[] { "1", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data1[] = new String[] { "SX_AS_001", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data2[] = new String[] { "浑浊偏黄", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data3[] = new String[] { "12124", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data4[] = new String[] { "21421", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data5[] = new String[] { "否", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data6[] = new String[] { "地表水", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data7[] = new String[] { "122", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data8[] = new String[] { "微地形", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data9[] = new String[] { "11", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data10[] = new String[] { "无", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };
	String data11[] = new String[] { "China", "UK", "USA", "Japan", "German", "Canada", "ET", "Narotu" };

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
				startActivity(new Intent(getActivity(), AddDetail.class));
				getActivity().overridePendingTransition(R.anim.animation_enterfromright, R.anim.animation_fadefromleft);
			}
		});
		mListView = (ListViewCompat) view.findViewById(R.id.list);
		adapter = new SlideAdapter();
		mListView.setAdapter(adapter);
		mListView.setOnItemClickListener(this);
		mListView.setOnRefreshListener(this);
		mListView.setOnLoadListener(this);
		loadData(ListViewCompat.REFRESH);
		return view;
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
		for (int i = 0; i < 10; i++) {
			MessageItem item = new MessageItem();
			if (i % 3 == 0) {
				item.title = "腾讯新闻";
				item.msg = "深圳西站增开两趟临客";
				item.time = "下午14:15";
			} else {
				item.title = "微信团队";
				item.msg = "欢迎你使用微信";
				item.time = "12:28";
			}
			result.add(item);
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
				slideView.setOnSlideListener(Detail_F.this);
				slideView.setTag(holder);
			} else {
				holder = (ViewHolder) slideView.getTag();
			}
			MessageItem item = mMessageItems.get(position);
			item.slideView = slideView;
			item.slideView.shrink();

			holder.title.setText(item.title);
			holder.msg.setText(item.msg);
			holder.time.setText(item.time);
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
		public TextView title;
		public TextView msg;
		public TextView time;
		public TextView deleteHolder;
		public TextView edit;

		ViewHolder(View view) {
			title = (TextView) view.findViewById(R.id.color_text);
			msg = (TextView) view.findViewById(R.id.serial_number_text);
			time = (TextView) view.findViewById(R.id.Sample_number_text);
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
		public String title;
		public String msg;
		public String time;
		public SlideView slideView;
	}

	@Override
	public void onRefresh() {
		// TODO Auto-generated method stub
		loadData(ListViewCompat.REFRESH);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Toast.makeText(getActivity(), "onItemClick position=" + arg2, 0).show();
	}
}
