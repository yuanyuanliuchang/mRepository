package com.fragment;

import com.chemicalprospectingpro.R;
import com.fragment.ChemicalFragment.btnListener;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class detailFragment extends Fragment implements OnClickListener {

	public interface detailBtnListener {
		public void exitListener();

		public void lookListener();
	}

	private detailBtnListener btnListener;

	/**
	 * Create a new instance of detailFragment, providing "num" as an argument.
	 */
	static detailFragment newInstance(int num) {
		detailFragment f = new detailFragment();

		// Supply num input as an argument.
		Bundle args = new Bundle();
		args.putInt("num", num);
		f.setArguments(args);
		return f;
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
		View view = inflater.inflate(R.layout.record_list, container, false);
		Button exitBtn = (Button) view.findViewById(R.id.riv_sedi_exit);
		Button lookBtn = (Button) view.findViewById(R.id.riv_sedi_look);
		exitBtn.setOnClickListener(this);
		lookBtn.setOnClickListener(this);
		return view;
	}
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		System.out.println("detailFragment--->onAttach");

		btnListener = (detailBtnListener) activity;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		// 退出当前fragment
		case R.id.riv_sedi_exit:
			btnListener.exitListener();
			break;
		// 查看详细
		case R.id.riv_sedi_look:
			btnListener.lookListener();
			break;

		default:
			break;
		}
	}

}
