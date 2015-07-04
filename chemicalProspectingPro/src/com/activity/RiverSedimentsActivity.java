package com.activity;

import com.chemicalprospectingpro.R;
import com.fragment.ChemicalFragment;
import com.fragment.ChemicalFragment.btnListener;
import com.fragment.detailFragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class RiverSedimentsActivity extends Activity implements btnListener {

	FragmentManager fragmentManager = getFragmentManager();

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
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction();
		ChemicalFragment chemicalFragment = new ChemicalFragment();
		fragmentTransaction.add(R.id.RivSediContainer, chemicalFragment,
				"ChemicalFragment");
		fragmentTransaction.commit();

	}

	@Override
	public void lookMore(int index) {
		// TODO Auto-generated method stub
		// 根据index 决定加载的列表
		FragmentTransaction fragmentTransaction1 = fragmentManager
				.beginTransaction();
		fragmentTransaction1.replace(R.id.RivSediContainer,
				new detailFragment());
		fragmentTransaction1
				.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
		fragmentTransaction1.addToBackStack(null);
		fragmentTransaction1.commit();
	}

}
