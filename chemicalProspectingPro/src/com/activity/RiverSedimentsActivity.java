package com.activity;

import com.kanyuan.circleloader.R;
import com.fragment.ChemicalFragment;
import com.fragment.ChemicalFragment.btnListener;
import com.fragment.DetailFragment;
import com.fragment.DetailFragment.detailBtnListener;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;

public class RiverSedimentsActivity extends Activity implements btnListener, detailBtnListener {

	FragmentManager fragmentManager = getFragmentManager();

	public final static String LISTID = "LISTID";

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.river_sediments);
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		ChemicalFragment chemicalFragment = new ChemicalFragment();
		fragmentTransaction.add(R.id.RivSediContainer, chemicalFragment, "ChemicalFragment");
		fragmentTransaction.commit();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onBackPressed()
	 */
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		overridePendingTransition(R.anim.animation_enterfromleft, R.anim.animation_fadefromright);
	}

	@Override
	public void lookMore(int index) {
		// TODO Auto-generated method stub
		// 根据index 决定加载的列表
		DetailFragment newFragment = new DetailFragment();
		Bundle args = new Bundle();
		args.putInt(DetailFragment.ARG_POSITION, index);
		newFragment.setArguments(args);
		FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
		fragmentTransaction1.replace(R.id.RivSediContainer, newFragment, "DetailFragment");
		fragmentTransaction1.setCustomAnimations(R.anim.animation_enterfromright, R.anim.animation_fadefromleft);
		fragmentTransaction1.addToBackStack(null);
		fragmentTransaction1.commit();
	}

	@Override
	public void exitListener() {
		// TODO Auto-generated method stub
		FragmentTransaction ftDelete = fragmentManager.beginTransaction();
		ChemicalFragment chemicalFragment = (ChemicalFragment) fragmentManager.findFragmentByTag("ChemicalFragment");
		ftDelete.replace(R.id.RivSediContainer, chemicalFragment);
		ftDelete.setCustomAnimations(R.anim.animation_enterfromright, R.anim.animation_fadefromleft);
		ftDelete.commit();
	}

	@Override
	public void lookListener(int id) {
		// TODO Auto-generated method stub
		// 记录表查看按钮,查看id对应的列表项
		Intent intent = new Intent(RiverSedimentsActivity.this, RivSedDtlLvActivity.class);
		intent.putExtra(LISTID, id);
		startActivity(intent);
		overridePendingTransition(R.anim.animation_enterfromright, R.anim.animation_fadefromleft);
	}

}
