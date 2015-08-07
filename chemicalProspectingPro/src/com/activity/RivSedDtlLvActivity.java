package com.activity;

import com.chemicalprospectingpro.R;
import com.fragment.Cart_F;
import com.fragment.Detail_F;
import com.fragment.Discover_F;
import com.fragment.Picture_F;
import com.fragment.User_F;
import com.myInterface.IBtnCallListener;
import com.zdp.aseo.content.AseoZdpAseo;

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

	/** 详细界面 */
	private Detail_F detail_F;
	/** 照片界面 */
	private Picture_F Picture_F;
	/** 异常界面 */
	private Discover_F error_F;
	/** 退出界面 */
	private Cart_F cart_F;
	/** 我的淘宝界面 */
	private User_F user_F;
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
		initView();
	}

	private void initView() {
		// 找到底部菜单的按钮并设置监听
		for (int i = 0; i < bt_menu.length; i++) {
			bt_menu[i] = (ImageView) findViewById(bt_menu_id[i]);
			tv_menu[i] = (TextView) findViewById(bt_text_id[i]);
			bt_menu[i].setOnClickListener(this);
		}

		// 初始化默认显示的界面
		if (detail_F == null) {
			detail_F = new Detail_F();
			addFragment(detail_F);
			showFragment(detail_F);
		} else {
			showFragment(detail_F);
		}
		// 设置默认首页为点击时的图片
		bt_menu[0].setImageResource(select_on[0]);
		tv_menu[0].setTextColor(getResources().getColor(R.color.green));
		AseoZdpAseo.init(this, AseoZdpAseo.SCREEN_TYPE);
		// ImageView proList = (ImageView) findViewById(R.id.iv_menu_0);
		// ImageView picList = (ImageView) findViewById(R.id.iv_menu_1);
		// ImageView errorList = (ImageView) findViewById(R.id.iv_menu_2);
		// ImageView quit = (ImageView) findViewById(R.id.iv_menu_3);
		// ImageView lookBtn = (ImageView) findViewById(R.id.iv_menu_4);
		// proList.setOnClickListener(this);
		// picList.setOnClickListener(this);
		// errorList.setOnClickListener(this);
		// quit.setOnClickListener(this);
		// lookBtn.setOnClickListener(this);
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

	/** 显示Fragment **/
	public void showFragment(Fragment fragment) {
		FragmentTransaction ft = this.getSupportFragmentManager().beginTransaction();
		// 设置Fragment的切换动画
		ft.setCustomAnimations(R.anim.animation_enterfromright, R.anim.animation_fadefromleft);

		// 判断页面是否已经创建，如果已经创建，那么就隐藏掉
		if (detail_F != null) {
			ft.hide(detail_F);
		}
		if (Picture_F != null) {
			ft.hide(Picture_F);
		}
		if (error_F != null) {
			ft.hide(error_F);
		}
		if (cart_F != null) {
			ft.hide(cart_F);
		}
		if (user_F != null) {
			ft.hide(user_F);
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
			if (detail_F == null) {
				detail_F = new Detail_F();
				// 判断当前界面是否隐藏，如果隐藏就进行添加显示，false表示显示，true表示当前界面隐藏
				addFragment(detail_F);
				showFragment(detail_F);
			} else {
				if (detail_F.isHidden()) {
					showFragment(detail_F);
				}
			}
			break;
		case R.id.iv_menu_1:
			// 微淘界面
			if (Picture_F == null) {
				Picture_F = new Picture_F();
				// 判断当前界面是否隐藏，如果隐藏就进行添加显示，false表示显示，true表示当前界面隐藏
				if (!Picture_F.isHidden()) {
					addFragment(Picture_F);
					showFragment(Picture_F);
				}
			} else {
				if (Picture_F.isHidden()) {
					showFragment(Picture_F);
				}
			}
			break;
		case R.id.iv_menu_2:
			// 发现界面
			if (error_F == null) {
				error_F = new Discover_F();
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
			if (cart_F != null) {
				removeFragment(cart_F);
				cart_F = null;
			}
			cart_F = new Cart_F();
			// 判断当前界面是否隐藏，如果隐藏就进行添加显示，false表示显示，true表示当前界面隐藏
			addFragment(cart_F);
			showFragment(cart_F);

			break;
		case R.id.iv_menu_4:
			// 我的淘宝界面
			if (user_F == null) {
				user_F = new User_F();
				// 判断当前界面是否隐藏，如果隐藏就进行添加显示，false表示显示，true表示当前界面隐藏
				if (!user_F.isHidden()) {
					addFragment(user_F);
					showFragment(user_F);
				}
			} else {
				if (user_F.isHidden()) {
					showFragment(user_F);
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

	/**
	 * 响应从Fragment中传过来的消息
	 */
	@Override
	public void transferMsg() {
		if (detail_F == null) {
			detail_F = new Detail_F();
			addFragment(detail_F);
			showFragment(detail_F);
		} else {
			showFragment(detail_F);
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.support.v4.app.FragmentActivity#onKeyDown(int,
	 * android.view.KeyEvent)
	 */

}
