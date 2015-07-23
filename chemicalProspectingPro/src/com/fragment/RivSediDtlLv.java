package com.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RivSediDtlLv extends Fragment {

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
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	/**
	 * Create a new instance of RivSediDtlLv, providing "num" as an argument.
	 */
	static RivSediDtlLv newInstance(int num) {
		RivSediDtlLv f = new RivSediDtlLv();

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

}
