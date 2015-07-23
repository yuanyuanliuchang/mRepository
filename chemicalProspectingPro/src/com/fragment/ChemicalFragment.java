package com.fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chemicalprospectingpro.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class ChemicalFragment extends Fragment implements OnClickListener {

	private ListView listView;
	public static String title[] = new String[] { "菜名0", "菜名1", "菜名2", "菜名3",
			"菜名4", "菜名5", "菜名6", "菜名7", "菜名8", "菜名9" };
	public static String info[] = new String[] { "￥：28", "￥：28", "￥：28",
			"￥：28", "￥：28", "￥：28", "￥：28", "￥：28", "￥：28", "￥：28", };

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

	private btnListener myListener;

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		System.out.println("ChemicalFragment--->onAttach");

		myListener = (btnListener) activity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onCreateView(android.view.LayoutInflater,
	 * android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.user_opinion, container, false);
		TextView titleTv = (TextView) view.findViewById(R.id.list_title);
		listView = (ListView) view.findViewById(R.id.listView);
		Button exitBtn = (Button) view.findViewById(R.id.riv_sedi_exit);
		Button addBtn = (Button) view.findViewById(R.id.riv_sedi_add);

		exitBtn.setOnClickListener(this);
		addBtn.setOnClickListener(this);
		// 下面是数据映射关系,mFrom和mTo按顺序一一对应
		String[] mFrom = new String[] { "child_id", "child_content" };
		int[] mTo = new int[] { R.id.child_id, R.id.child_content };
		// 获取数据,这里随便加了10条数据,实际开发中可能需要从数据库或网络读取
		List<Map<String, Object>> mList = new ArrayList<Map<String, Object>>();
		Map<String, Object> mMap = null;
		for (int i = 0; i < 30; i++) {
			mMap = new HashMap<String, Object>();

			mMap.put("child_id", "标题");
			mMap.put("child_content", "副标题");

			mList.add(mMap);
		}
		// 创建适配器
		mySimpleAdapter mAdapter = new mySimpleAdapter(getActivity(), mList,
				R.layout.vlist, mFrom, mTo);
		listView.setAdapter(mAdapter);

		titleTv.setText("方法登记表");
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
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				@SuppressWarnings("unchecked")
				// 获取被点击的item所对应的数据
				HashMap<String, Object> map = (HashMap<String, Object>) parent
						.getItemAtPosition(position);
				// 下面是你的其他事务逻辑
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onStart()
	 */
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onStop()
	 */
	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onDestroy()
	 */
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();

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
		getActivity().overridePendingTransition(R.anim.animation_enterfromleft,
				R.anim.animation_fadefromright);
		super.onDetach();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.riv_sedi_exit:
			// 退出activity
			getActivity().finish();
			getActivity().overridePendingTransition(
					R.anim.animation_enterfromleft,
					R.anim.animation_fadefromright);
			break;
		case R.id.riv_sedi_add:
			// 添加新的项目
			break;
		default:
			break;
		}
	}

	private class mySimpleAdapter extends SimpleAdapter {

		private LayoutInflater mInflater;

		public mySimpleAdapter(Context context,
				List<? extends Map<String, ?>> data, int resource,
				String[] from, int[] to) {
			super(context, data, resource, from, to);
			this.mInflater = LayoutInflater.from(context);
			// TODO Auto-generated constructor stub
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see android.widget.SimpleAdapter#getView(int, android.view.View,
		 * android.view.ViewGroup)
		 */
		@Override
		public View getView(final int position, View convertView,
				ViewGroup parent) {
			// TODO Auto-generated method stub
			ViewHolder holder = null;
			if (convertView == null) {

				holder = new ViewHolder();

				// 可以理解为从vlist获取view 之后把view返回给ListView

				convertView = mInflater.inflate(R.layout.vlist, null);

				holder.viewBtn = (Button) convertView
						.findViewById(R.id.vlist_btn);
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}

			holder.viewBtn.setTag(position);
			// 给Button添加单击事件 添加Button之后ListView将失去焦点 需要的直接把Button的焦点去掉
			holder.viewBtn.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// 查看的点击事件
					myListener.lookMore(1);
					// showInfo(position);
				}
			});

			// holder.viewBtn.setOnClickListener(MyListener(position));

			return convertView;
		}

		// 提取出来方便点
		public final class ViewHolder {
			public TextView title;
			public TextView info;
			public Button viewBtn;
		}
	}

	public void showInfo(int position) {

		ImageView img = new ImageView(getActivity());
		img.setImageResource(R.drawable.ic_menu_compass);
		new AlertDialog.Builder(getActivity()).setView(img)
				.setTitle("详情" + position)
				.setMessage("菜名：" + title[position] + "价格:" + info[position])
				.setPositiveButton("确定", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
					}
				}).show();
	}
}
