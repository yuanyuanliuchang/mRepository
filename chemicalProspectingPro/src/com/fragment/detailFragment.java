package com.fragment;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.activity.ProjectActivity;
import com.chemicalprospecting.DKHtsxItemData;
import com.kanyuan.circleloader.R;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFragment extends Fragment implements OnClickListener {

	public static String ARG_POSITION;
	private TextView mDepartment;
	private TextView mMiningAear;
	private TextView mItemCode;
	private TextView mRecordPerson;
	private TextView mEngineer;
	private TextView startTime;
	private TextView endTime;
	private Date date;
	private String startDate;
	private String endDate;
	private int position;
	private ImageView exitBtn;
	private ImageView lookBtn;
	private View view;

	public interface detailBtnListener {
		public void exitListener();

		public void lookListener(int id);

		void lookMore(int index);
	}

	private detailBtnListener btnListener;

	/**
	 * Create a new instance of DetailFragment, providing "num" as an argument.
	 */
	static DetailFragment newInstance(int num) {
		DetailFragment f = new DetailFragment();
		// Supply num input as an argument.
		Bundle args = new Bundle();
		args.putInt("num", num);
		f.setArguments(args);
		return f;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onActivityCreated(android.os.Bundle)
	 */
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		super.onActivityCreated(savedInstanceState);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onCreate(android.os.Bundle)
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onCreateView(android.view.LayoutInflater,
	 * android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.record_list, container, false);
		init(view);
		position = getFragmentManager().findFragmentByTag("DetailFragment").getArguments()
				.getInt(DetailFragment.ARG_POSITION);
		initData();
		return view;
	}

	private void init(View view) {
		exitBtn = (ImageView) view.findViewById(R.id.lv_iv_back);
		lookBtn = (ImageView) view.findViewById(R.id.lv_iv_look);
		mDepartment = (TextView) view.findViewById(R.id.depart);
		mMiningAear = (TextView) view.findViewById(R.id.miningAear);
		mItemCode = (TextView) view.findViewById(R.id.indexNum);
		mRecordPerson = (TextView) view.findViewById(R.id.recoder);
		mEngineer = (TextView) view.findViewById(R.id.chief);
		startTime = (TextView) view.findViewById(R.id.dateStart);
		endTime = (TextView) view.findViewById(R.id.dateEnd);
		exitBtn.setOnClickListener(this);
		lookBtn.setOnClickListener(this);
	}

	private void initData() {
		DKHtsxItemData itemData = ProjectActivity.kjdb.findById(position, DKHtsxItemData.class);
		mDepartment.setText(itemData.getDepartment());
		mItemCode.setText(itemData.getItemCode());
		mMiningAear.setText(itemData.getExploratoryLine());
		mRecordPerson.setText(itemData.getRecordPerson());
		mEngineer.setText(itemData.getEngineer());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		date = itemData.getRealStarttime();
		startDate = sdf.format(date);
		startTime.setText(startDate);
		date = itemData.getRealEndtime();
		endDate = sdf.format(date);
		endTime.setText(endDate);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Fragment#onCreate(android.os.Bundle)
	 */

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			btnListener = (detailBtnListener) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString() + " must implement OnHeadlineSelectedListener");
		}

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		// 退出当前fragment
		case R.id.lv_iv_back:
			btnListener.exitListener();
			break;
		// 查看详细
		case R.id.lv_iv_look:
			btnListener.lookListener(position);
			break;
		default:
			break;
		}
	}

}
