package com.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.chemicalprospectingpro.R;
import com.zdp.aseo.content.AseoZdpAseo;

public class RivSedDtlLvActivity extends Activity implements OnClickListener {

	// 界面底部的菜单按钮
	private ImageView[] bt_menu = new ImageView[5];
	// 界面底部的菜单按钮id
	private int[] bt_menu_id = { R.id.iv_menu_0, R.id.iv_menu_1,
			R.id.iv_menu_2, R.id.iv_menu_3, R.id.iv_menu_4 };

	// 界面底部的选中菜单按钮资源
	private int[] select_on = { R.drawable.guide_home_on,
			R.drawable.guide_tfaccount_on, R.drawable.guide_discover_on,
			R.drawable.guide_cart_on, R.drawable.guide_account_on };
	// 界面底部的未选中菜单按钮资源
	private int[] select_off = { R.drawable.bt_menu_0_select,
			R.drawable.bt_menu_1_select, R.drawable.bt_menu_2_select,
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
			bt_menu[i].setOnClickListener(this);
		}
		// 设置默认首页为点击时的图片
		bt_menu[0].setImageResource(select_on[0]);
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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.iv_menu_0:

			break;
		case R.id.iv_menu_1:
			// 微淘界面

			break;
		case R.id.iv_menu_2:
			// 发现界面

			break;
		case R.id.iv_menu_3:
			// 购物车界面

			break;
		case R.id.iv_menu_4:
			// 我的淘宝界面

			break;
		}

		// 设置按钮的选中和未选中资源
		for (int i = 0; i < bt_menu.length; i++) {
			bt_menu[i].setImageResource(select_off[i]);
			if (v.getId() == bt_menu_id[i]) {
				bt_menu[i].setImageResource(select_on[i]);
			}
		}
	}

}
