package com.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.chemicalprospectingpro.R;

public class RivSediDtlLvFragment extends Fragment implements OnClickListener {

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onCreateView(android.view.LayoutInflater,
	 * android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.main_fa, container, false);
		ImageView proList = (ImageView) view.findViewById(R.id.iv_menu_0);
		ImageView picList = (ImageView) view.findViewById(R.id.iv_menu_1);
		ImageView errorList = (ImageView) view.findViewById(R.id.iv_menu_2);
		ImageView quit = (ImageView) view.findViewById(R.id.iv_menu_3);
		ImageView lookBtn = (ImageView) view.findViewById(R.id.iv_menu_4);
		proList.setOnClickListener(this);
		picList.setOnClickListener(this);
		errorList.setOnClickListener(this);
		quit.setOnClickListener(this);
		lookBtn.setOnClickListener(this);
		return view;
	}

	/**
	 * Create a new instance of RivSediDtlLvFragment, providing "num" as an
	 * argument.
	 */
	static RivSediDtlLvFragment newInstance(int num) {
		RivSediDtlLvFragment f = new RivSediDtlLvFragment();

		// Supply num input as an argument.
		Bundle args = new Bundle();
		args.putInt("num", num);
		f.setArguments(args);
		return f;
	}

	public interface RivSedBtnLitsener {
		public void lookPic();

		public void quit();

		public void errorRec();

		public void projList();

		public void addRec();
	}

	private RivSedBtnLitsener rivSedBtnLitsener;

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onAttach(android.app.Activity)
	 */
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		System.out.println("ChemicalFragment--->onAttach");
		rivSedBtnLitsener = (RivSedBtnLitsener) activity;
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
		// for (int i = 0; i < bt_menu.length; i++) {
		// bt_menu[i].setImageResource(select_off[i]);
		// if (v.getId() == bt_menu_id[i]) {
		// bt_menu[i].setImageResource(select_on[i]);
		// }
		// }
	}

}
