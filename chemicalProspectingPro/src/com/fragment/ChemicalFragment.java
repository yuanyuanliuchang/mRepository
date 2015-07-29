package com.fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chemicalprospectingpro.R;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ChemicalFragment extends Fragment implements OnClickListener {

	private ListView listView;
	private List<Map<String, Object>> mData;
	private int flag;
	public static String title[] = new String[] { "SX_001a", "SX_002a" };
	public static String info[] = new String[] { "西北第十四区", "西北第十三区" };

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

	private btnListener myDetailListener;

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		System.out.println("ChemicalFragment--->onAttach");
		myDetailListener = (btnListener) activity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onCreateView(android.view.LayoutInflater,
	 * android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.user_opinion, container, false);
		TextView titleTv = (TextView) view.findViewById(R.id.list_title);
		listView = (ListView) view.findViewById(R.id.listView);
		ImageView exitImage = (ImageView) view.findViewById(R.id.iv_back);
		ImageView addImage = (ImageView) view.findViewById(R.id.iv_refresh);
		exitImage.setOnClickListener(this);
		addImage.setOnClickListener(this);
		// 下面是数据映射关系,mFrom和mTo按顺序一一对应
		mData = getData();
		MyAdapter adapter = new MyAdapter(getActivity());
		listView.setAdapter(adapter);
		// String[] mFrom = new String[] { "child_id", "child_content" };
		// int[] mTo = new int[] { R.id.child_id, R.id.child_content };
		// // 获取数据,这里随便加了10条数据,实际开发中可能需要从数据库或网络读取
		// List<Map<String, Object>> mList = new ArrayList<Map<String,
		// Object>>();
		// Map<String, Object> mMap = null;
		// for (int i = 0; i < 2; i++) {
		// mMap = new HashMap<String, Object>();
		//
		// mMap.put("child_id", "SX_001a");
		// mMap.put("child_content", "西北地十三区");
		//
		// mList.add(mMap);
		// }
		// // 创建适配器
		// mySimpleAdapter mAdapter = new mySimpleAdapter(getActivity(), mList,
		// R.layout.vlist, mFrom, mTo);
		// listView.setAdapter(mAdapter);

		titleTv.setText("方法登记表");
		return view;
	}

	// 获取动态数组数据 可以由其他地方传来(json等)
	private List<Map<String, Object>> getData() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < title.length; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("title", title[i]);
			map.put("info", info[i]);
			list.add(map);
		}
		return list;
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
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				@SuppressWarnings("unchecked")
				// 获取被点击的item所对应的数据
				HashMap<String, Object> map = (HashMap<String, Object>) parent.getItemAtPosition(position);
				// 下面是你的其他事务逻辑
			}
		});
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
			Toast.makeText(getActivity(), " nihao ", 3000).show();
			break;
		default:
			break;
		}
	}

	public class MyAdapter extends BaseAdapter {

		private LayoutInflater mInflater;

		public MyAdapter(Context context) {
			this.mInflater = LayoutInflater.from(context);
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return mData.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		// ****************************************final方法
		// 注意原本getView方法中的int position变量是非final的，现在改为final
		@Override
		public View getView(final int position, View convertView, ViewGroup parent) {
			ViewHolder holder = null;
			if (convertView == null) {

				holder = new ViewHolder();

				// 可以理解为从vlist获取view 之后把view返回给ListView

				convertView = mInflater.inflate(R.layout.vlist, null);
				holder.viewBtn = (Button) convertView.findViewById(R.id.vlist_btn);
				holder.title = (TextView) convertView.findViewById(R.id.child_id);
				holder.info = (TextView) convertView.findViewById(R.id.child_content);
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}

			holder.title.setText((String) mData.get(position).get("title"));
			holder.info.setText((String) mData.get(position).get("info"));
			holder.viewBtn.setTag(position);
			// 给Button添加单击事件 添加Button之后ListView将失去焦点 需要的直接把Button的焦点去掉
			holder.viewBtn.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					myDetailListener.lookMore(position);
				}
			});

			// holder.viewBtn.setOnClickListener(MyListener(position));

			return convertView;
		}
	}

	// private class mySimpleAdapter extends SimpleAdapter {
	//
	// private LayoutInflater mInflater;
	//
	// public mySimpleAdapter(Context context, List<? extends Map<String, ?>>
	// data, int resource, String[] from,
	// int[] to) {
	// super(context, data, resource, from, to);
	// this.mInflater = LayoutInflater.from(context);
	// // TODO Auto-generated constructor stub
	// }
	//
	// /*
	// * (non-Javadoc)
	// *
	// * @see android.widget.SimpleAdapter#getView(int, android.view.View,
	// * android.view.ViewGroup)
	// */
	// @Override
	// public View getView(final int position, View convertView, ViewGroup
	// parent) {
	// // TODO Auto-generated method stub
	// ViewHolder holder = null;
	// if (convertView == null) {
	//
	// holder = new ViewHolder();
	//
	// // 可以理解为从vlist获取view 之后把view返回给ListView
	//
	// convertView = mInflater.inflate(R.layout.vlist, null);
	// holder.viewBtn = (Button) convertView.findViewById(R.id.vlist_btn);
	// holder.title = (TextView) convertView.findViewById(R.id.child_id);
	// holder.info = (TextView) convertView.findViewById(R.id.child_content);
	// convertView.setTag(holder);
	// } else {
	// holder = (ViewHolder) convertView.getTag();
	// }
	//
	// // holder.title.setText("SX_001a");
	// // holder.info.setText("西北地十三区");
	// holder.viewBtn.setTag(position);
	// // 给Button添加单击事件 添加Button之后ListView将失去焦点 需要的直接把Button的焦点去掉
	// holder.viewBtn.setOnClickListener(new View.OnClickListener() {
	//
	// @Override
	// public void onClick(View v) {
	// // 查看的点击事件
	// myListener.lookMore(1);
	//
	// }
	// });
	//
	// // holder.viewBtn.setOnClickListener(MyListener(position));
	//
	// return convertView;
	// }
	//
	// 提取出来方便点
	public final class ViewHolder {
		public TextView title;
		public TextView info;
		public Button viewBtn;
	}

}
