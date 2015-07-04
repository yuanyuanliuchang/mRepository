package com.activity;

import com.chemicalprospectingpro.R;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;

/**
 * 主界�?
 * 
 * @author zihao 2013-11-12
 * 
 */
public class ProjectActivity extends Activity {

	// 这个数组是用来存储一级item的点击次数的，根据点击次数设置一级标签的选中、为选中状�?
	private int[] group_checked = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	// 用来标识是否设置二級item背景色为绿色,初始值为-1既为选中状�?
	private int child_groupId = -1;
	private int child_childId = -1;
	private Activity mContext;

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onStart()
	 */
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		mContext = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_layout);

		ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.list);
		// 设置默认图标为不显示状�?
		expandableListView.setGroupIndicator(null);
		// 为列表绑定数据源
		expandableListView.setAdapter(adapter);
		// 设置�?��item点击的监听器
		expandableListView.setOnGroupClickListener(new OnGroupClickListener() {

			@Override
			public boolean onGroupClick(ExpandableListView parent, View v,
					int groupPosition, long id) {
				if (groupPosition == 3) {
					return true;
				} else {
					group_checked[groupPosition] = group_checked[groupPosition] + 1;
					// 刷新界面
					((BaseExpandableListAdapter) adapter)
							.notifyDataSetChanged();
					return false;
				}

			}
		});

		// 设置二级item点击的监听器
		expandableListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// 将被点击的一丶二级标签的位置记录下来
				child_groupId = groupPosition;
				child_childId = childPosition;
				// 刷新界面
				((BaseExpandableListAdapter) adapter).notifyDataSetChanged();
				startActivity(groupPosition, childPosition);
				return false;
			}
		});
	}

	private void startActivity(int group_id, int child_id) {
		if (group_id == 1 && child_id == 0) {
			Intent intent = new Intent(ProjectActivity.this,
					RiverSedimentsActivity.class);
			startActivity(intent);
			overridePendingTransition(R.anim.animation_fadefromright,
					R.anim.animation_fadefromleft);
		}
	}

	final ExpandableListAdapter adapter = new BaseExpandableListAdapter() {
		// �?��标签上的logo图片数据�?
		// �?��标签上的标题数据�?
		private String[] group_title_arry = new String[] { "物探工程", "化探工程",
				"山地工程", "钻探工程" };
		// 子视图显示文�?
		private String[][] child_text_array = new String[][] { { "电法", "磁法" },
				{ "水系沉积物", "土壤测量", "剖面测量", "岩石测量" }, { "槽探", "坑探", "浅井", },
				{ "" } };
		// �?��标签上的状�?图片数据�?
		int[] group_state_array = new int[] { R.drawable.group_down,
				R.drawable.group_up };
		// 一级菜单显示的图片
		int[] group_image = new int[] { R.drawable.geophysical_exploration,
				R.drawable.geochemical_exploration,
				R.drawable.mountain_project, R.drawable.drilling,
				R.drawable.child_right };

		// 重写ExpandableListAdapter中的各个方法
		/**
		 * 获取�?��标签总数
		 */
		@Override
		public int getGroupCount() {
			return group_title_arry.length;
		}

		/**
		 * 获取�?��标签内容
		 */
		@Override
		public Object getGroup(int groupPosition) {
			return group_title_arry[groupPosition];
		}

		/**
		 * 获取�?��标签的ID
		 */
		@Override
		public long getGroupId(int groupPosition) {
			return groupPosition;
		}

		/**
		 * 获取�?��标签下二级标签的总数
		 */
		@Override
		public int getChildrenCount(int groupPosition) {
			return child_text_array[groupPosition].length;
		}

		/**
		 * 获取�?��标签下二级标签的内容
		 */
		@Override
		public Object getChild(int groupPosition, int childPosition) {
			return child_text_array[groupPosition][childPosition];
		}

		/**
		 * 获取二级标签的ID
		 */
		@Override
		public long getChildId(int groupPosition, int childPosition) {
			return childPosition;
		}

		/**
		 * 指定位置相应的组视图
		 */
		@Override
		public boolean hasStableIds() {
			return true;
		}

		/**
		 * 对一级标签进行设�?
		 */
		@Override
		public View getGroupView(int groupPosition, boolean isExpanded,
				View convertView, ViewGroup parent) {
			// 为视图对象指定布�?
			convertView = (LinearLayout) LinearLayout.inflate(getBaseContext(),
					R.layout.group_layout, null);

			RelativeLayout myLayout = (RelativeLayout) convertView
					.findViewById(R.id.group_layout);
			// 组标示控件
			ImageView group_indicate = (ImageView) convertView
					.findViewById(R.id.group_indicate);
			/**
			 * 声明视图上要显示的控�?
			 */
			// 新建�?��TextView对象，用来显示一级标签上的标题信�?
			TextView group_title = (TextView) convertView
					.findViewById(R.id.group_title);
			// 新建�?��TextView对象，用来显示一级标签上的大体描述的信息
			ImageView group_state = (ImageView) convertView
					.findViewById(R.id.group_state);

			/**
			 * 设置相应控件的内�?
			 */
			// 设置标题上的文本信息
			group_title.setText(group_title_arry[groupPosition]);
			group_indicate.setBackgroundResource(group_image[groupPosition]);
			// 设置整体描述上的文本信息
			if (groupPosition == 3) {
				return convertView;
			} else if (group_checked[groupPosition] % 2 == 1) {
				// 设置默认的图片是选中状�?
				group_state.setBackgroundResource(group_state_array[1]);
				myLayout.setBackgroundResource(R.drawable.text_item_top_bg);
			} else {
				for (int test : group_checked) {
					if (test == 0 || test % 2 == 0) {
						myLayout.setBackgroundResource(R.drawable.text_item_bg);
						// 设置默认的图片是未�?中状�?
						group_state.setBackgroundResource(group_state_array[0]);
					}
				}
			}
			// 返回�?��布局对象
			return convertView;
		}

		/**
		 * 对一级标签下的二级标签进行设�?
		 */
		@Override
		public View getChildView(int groupPosition, int childPosition,
				boolean isLastChild, View convertView, ViewGroup parent) {

			convertView = (RelativeLayout) RelativeLayout.inflate(
					getBaseContext(), R.layout.child_layout, null);

			/**
			 * 声明视图上要显示的控�?
			 */
			// 新建�?��TextView对象，用来显示具体内�?
			TextView child_text = (TextView) convertView
					.findViewById(R.id.child_text);
			// ImageView child_indicate = (ImageView) convertView
			// .findViewById(R.id.child_indicate);
			/**
			 * 设置相应控件的内�?
			 */
			// 设置要显示的文本信息
			child_text.setText(child_text_array[groupPosition][childPosition]);
			// child_indicate.setBackgroundResource(group_image[4]);
			// 判断item的位置是否相同，如相同，则表示为选中状�?，更改其背景颜色，如不相同，则设置背景色为白�?
			if (child_groupId == groupPosition
					&& child_childId == childPosition) {
				// 设置背景色为绿色
				// convertView.setBackgroundColor(Color.GRAY);
			} else {
				// 设置背景色为白色
				// convertView.setBackgroundColor(Color.WHITE);
			}
			// 返回�?��布局对象
			return convertView;
		}

		/**
		 * 当�?择子节点的时候，调用该方�?
		 */
		@Override
		public boolean isChildSelectable(int groupPosition, int childPosition) {
			return true;
		}

	};

}