package com.activity;

import com.fragment.DetaiListlFragment;
import com.fragment.DiscoverFragment;
import com.fragment.PictureFragment;
import com.fragment.ProjectListFragment;
import com.fragment.QuitFragment;
import com.kanyuan.circleloader.R;
import com.myInterface.IBtnCallListener;
import com.zdp.aseo.content.AseoZdpAseo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class RivSedDtlLvActivity extends FragmentActivity implements OnClickListener, IBtnCallListener {

	private int myShowId;

	/** 详细界面 */
	private DetaiListlFragment detaiListlFragment;
	/** 照片界面 */
	private PictureFragment PictureFragment;
	/** 异常界面 */
	private DiscoverFragment error_F;
	/** 退出界面 */
	private QuitFragment quitFragment;
	/** 我的淘宝界面 */
	private ProjectListFragment projectListFragment;
	// 界面底部的菜单按钮
	private ImageView[] bt_menu = new ImageView[5];
	// 界面底面的文字
	private TextView[] tv_menu = new TextView[5];
	// 界面底部的菜单按钮id
	private int[] bt_menu_id = { R.id.iv_menu_0, R.id.iv_menu_1, R.id.iv_menu_2, R.id.iv_menu_3, R.id.iv_menu_4 };

	private int[] bt_text_id = { R.id.river_sediment_detail, R.id.river_sediment_pictrue, R.id.river_sediment_error,
			R.id.river_sediment_quit, R.id.river_sediment_list };

	// 界面底部的选中菜单按钮资源
	private int[] select_on = { R.drawable.guide_home_on, R.drawable.guide_tfaccount_on, R.drawable.guide_discover_on,
			R.drawable.guide_cart_on, R.drawable.guide_account_on };
	// 界面底部的未选中菜单按钮资源
	private int[] select_off = { R.drawable.bt_menu_0_select, R.drawable.bt_menu_1_select, R.drawable.bt_menu_2_select,
			R.drawable.bt_menu_3_select, R.drawable.bt_menu_4_select };

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_fa);
		Intent intent = getIntent();
		// 根据id查找数据库记录
		myShowId = intent.getIntExtra(RiverSedimentsActivity.LISTID, 0);
		initView();
	}

	private void initView() {
		for (int i = 0; i < bt_menu.length; i++) {
			bt_menu[i] = (ImageView) findViewById(bt_menu_id[i]);
			tv_menu[i] = (TextView) findViewById(bt_text_id[i]);
			bt_menu[i].setOnClickListener(this);
		}
		if (detaiListlFragment == null) {
			detaiListlFragment = new DetaiListlFragment();
			addFragment(detaiListlFragment);
			showFragment(detaiListlFragment);
		} else {
			showFragment(detaiListlFragment);
		}
		bt_menu[0].setImageResource(select_on[0]);
		tv_menu[0].setTextColor(getResources().getColor(R.color.green));
		AseoZdpAseo.init(this, AseoZdpAseo.SCREEN_TYPE);
	}

	/** 添加Fragment **/
	public void addFragment(Fragment fragment) {
		FragmentTransaction ft = this.getSupportFragmentManager().beginTransaction();
		ft.add(R.id.show_layout, fragment);
		ft.commit();
	}

	/** 删除Fragment **/
	public void removeFragment(Fragment fragment) {
		FragmentTransaction ft = this.getSupportFragmentManager().beginTransaction();
		ft.remove(fragment);
		ft.commit();
	}

	/**
	 * @return the myShowId
	 */
	public int getMyShowId() {
		return myShowId;
	}

	/**
	 * @param myShowId
	 *            the myShowId to set
	 */
	public void setMyShowId(int myShowId) {
		this.myShowId = myShowId;
	}

	/** 显示Fragment **/
	public void showFragment(Fragment fragment) {
		FragmentTransaction ft = this.getSupportFragmentManager().beginTransaction();
		// 设置Fragment的切换动画
		ft.setCustomAnimations(R.anim.animation_enterfromright, R.anim.animation_fadefromleft);

		// 判断页面是否已经创建，如果已经创建，那么就隐藏掉
		if (detaiListlFragment != null) {
			ft.hide(detaiListlFragment);
		}
		if (PictureFragment != null) {
			ft.hide(PictureFragment);
		}
		if (error_F != null) {
			ft.hide(error_F);
		}
		if (quitFragment != null) {
			ft.hide(quitFragment);
		}
		if (projectListFragment != null) {
			ft.hide(projectListFragment);
		}

		ft.show(fragment);
		ft.commitAllowingStateLoss();

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.iv_menu_0:
			// 主界面
			if (detaiListlFragment == null) {
				detaiListlFragment = new DetaiListlFragment();
				// 判断当前界面是否隐藏，如果隐藏就进行添加显示，false表示显示，true表示当前界面隐藏
				addFragment(detaiListlFragment);
				showFragment(detaiListlFragment);
			} else {
				if (detaiListlFragment.isHidden()) {
					showFragment(detaiListlFragment);
				}
			}
			break;
		case R.id.iv_menu_1:
			// 微淘界面
			if (PictureFragment == null) {
				PictureFragment = new PictureFragment();
				// 判断当前界面是否隐藏，如果隐藏就进行添加显示，false表示显示，true表示当前界面隐藏
				if (!PictureFragment.isHidden()) {
					addFragment(PictureFragment);
					showFragment(PictureFragment);
				}
			} else {
				if (PictureFragment.isHidden()) {
					showFragment(PictureFragment);
				}
			}
			break;
		case R.id.iv_menu_2:
			// 发现界面
			if (error_F == null) {
				error_F = new DiscoverFragment();
				// 判断当前界面是否隐藏，如果隐藏就进行添加显示，false表示显示，true表示当前界面隐藏
				if (!error_F.isHidden()) {
					addFragment(error_F);
					showFragment(error_F);
				}
			} else {
				if (error_F.isHidden()) {
					showFragment(error_F);
				}
			}

			break;
		case R.id.iv_menu_3:
			// 购物车界面
			if (quitFragment != null) {
				removeFragment(quitFragment);
				quitFragment = null;
			}
			quitFragment = new QuitFragment();
			// 判断当前界面是否隐藏，如果隐藏就进行添加显示，false表示显示，true表示当前界面隐藏
			addFragment(quitFragment);
			showFragment(quitFragment);

			break;
		case R.id.iv_menu_4:
			// 我的淘宝界面
			if (projectListFragment == null) {
				projectListFragment = new ProjectListFragment();
				// 判断当前界面是否隐藏，如果隐藏就进行添加显示，false表示显示，true表示当前界面隐藏
				if (!projectListFragment.isHidden()) {
					addFragment(projectListFragment);
					showFragment(projectListFragment);
				}
			} else {
				if (projectListFragment.isHidden()) {
					showFragment(projectListFragment);
				}
			}
			break;
		}
		// 设置按钮的选中和未选中资源
		for (int i = 0; i < bt_menu.length; i++) {
			bt_menu[i].setImageResource(select_off[i]);
			tv_menu[i].setTextColor(getResources().getColor(R.color.black));
			if (v.getId() == bt_menu_id[i]) {
				bt_menu[i].setImageResource(select_on[i]);
				tv_menu[i].setTextColor(getResources().getColor(R.color.green));
			}
		}
	}

	/** Fragment的回调函数 */
	@SuppressWarnings("unused")
	private IBtnCallListener btnCallListener;

	@Override
	public void onAttachFragment(Fragment fragment) {
		try {
			btnCallListener = (IBtnCallListener) fragment;
		} catch (Exception e) {
		}

		super.onAttachFragment(fragment);
	}

	/**
	 * 响应从Fragment中传过来的消息
	 */
	@Override
	public void transferMsg() {
		if (detaiListlFragment == null) {
			detaiListlFragment = new DetaiListlFragment();
			addFragment(detaiListlFragment);
			showFragment(detaiListlFragment);
		} else {
			showFragment(detaiListlFragment);
		}
		bt_menu[3].setImageResource(select_off[3]);
		bt_menu[0].setImageResource(select_on[0]);
		System.out.println("由Fragment中传送来的消息");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.support.v4.app.FragmentActivity#onKeyDown(int,
	 * android.view.KeyEvent)
	 */
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			finish();
			overridePendingTransition(R.anim.animation_enterfromleft, R.anim.animation_fadefromright);
		}
		return false;
	}

}
