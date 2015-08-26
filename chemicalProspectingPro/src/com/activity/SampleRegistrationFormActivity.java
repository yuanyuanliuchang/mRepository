package com.activity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.kymjs.kjframe.database.OneToManyLazyLoader;
import org.kymjs.kjframe.ui.ViewInject;

import com.android.util.DateUtils;
import com.chemicalprospecting.DKHtsxItemData;
import com.chemicalprospecting.DKHtsxSample;
import com.common.method.MyMethod;
import com.kanyuan.circleloader.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import bigkoo.pickerview.TimePopupWindow;
import bigkoo.pickerview.TimePopupWindow.OnTimeSelectListener;
import bigkoo.pickerview.TimePopupWindow.Type;

public class SampleRegistrationFormActivity extends Activity {

	private EditText mDepartName, mMiningArea, mNumber, mRecordPerson, mChiefPerson, mStartTime, mEndTime;
	private TextView mSubmit;
	private String sDepartName, sMiningArea, sNumber, sRecordPerson, sChiefPerson, sStartTime, sEndTime;
	private MyMethod mMyMethod;
	TimePopupWindow pwTime;
	TimePopupWindow endpwTime;
	private OneToManyLazyLoader<DKHtsxItemData, DKHtsxSample> oneToManyLazyLoader;
	private DKHtsxItemData dkhtsxitemdata;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.sample_registration_form);

		mDepartName = (EditText) findViewById(R.id.departName);
		mMiningArea = (EditText) findViewById(R.id.miningArea);
		mNumber = (EditText) findViewById(R.id.project_Num);
		mRecordPerson = (EditText) findViewById(R.id.recordPerson);
		mChiefPerson = (EditText) findViewById(R.id.chiefPerson);
		String strDate = DateUtils.getCurrentDate();
		mStartTime = (EditText) findViewById(R.id.start_time);
		mEndTime = (EditText) findViewById(R.id.end_time);
		mStartTime.setText(strDate);
		mEndTime.setText(strDate);

		mStartTime.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				pwTime.showAtLocation(mStartTime, Gravity.BOTTOM, 0, 0, new Date());
			}
		});
		mEndTime.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				endpwTime.showAtLocation(mStartTime, Gravity.BOTTOM, 0, 0, new Date());
			}
		});
		// 时间选择器
		pwTime = new TimePopupWindow(this, Type.YEAR_MONTH_DAY);
		endpwTime = new TimePopupWindow(this, Type.YEAR_MONTH_DAY);
		// 时间选择后回调
		pwTime.setOnTimeSelectListener(new OnTimeSelectListener() {

			@Override
			public void onTimeSelect(Date date) {
				mStartTime.setText(DateUtils.getTime(date));
			}
		});
		endpwTime.setOnTimeSelectListener(new OnTimeSelectListener() {

			@Override
			public void onTimeSelect(Date date) {
				mEndTime.setText(DateUtils.getTime(date));
			}
		});
		mMyMethod = new MyMethod();
		mSubmit = (TextView) findViewById(R.id.submit);

		mSubmit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				sDepartName = mDepartName.getText().toString();
				sMiningArea = mMiningArea.getText().toString();
				sNumber = mNumber.getText().toString();
				sRecordPerson = mRecordPerson.getText().toString();
				sChiefPerson = mChiefPerson.getText().toString();
				sStartTime = mStartTime.getText().toString();
				sEndTime = mEndTime.getText().toString();
				// TODO Auto-generated method stub
				if (mMyMethod.isEmpty(sDepartName) || mMyMethod.isEmpty(sMiningArea) || mMyMethod.isEmpty(sNumber)
						|| mMyMethod.isEmpty(sRecordPerson) || mMyMethod.isEmpty(sChiefPerson)) {
					Toast.makeText(getApplicationContext(), "输入信息有误！", Toast.LENGTH_SHORT).show();
					return;
				} else {
					// 存信息进入数据库

					dkhtsxitemdata = new DKHtsxItemData();
					oneToManyLazyLoader = new OneToManyLazyLoader<DKHtsxItemData, DKHtsxSample>(dkhtsxitemdata,
							DKHtsxItemData.class, DKHtsxSample.class, ProjectActivity.kjdb);
					List<DKHtsxSample> dkHtsxSample = new ArrayList<DKHtsxSample>();
					oneToManyLazyLoader.setList(dkHtsxSample);
					dkhtsxitemdata.setDkhtsxSample(oneToManyLazyLoader);
					dkhtsxitemdata.setExploratoryLine(sMiningArea);
					dkhtsxitemdata.setItemCode(sNumber);
					dkhtsxitemdata.setRecordPerson(sRecordPerson);
					dkhtsxitemdata.setEngineer(sChiefPerson);
					dkhtsxitemdata.setDepartment(sDepartName);
					try {
						dkhtsxitemdata.setRealStarttime(DateUtils.ConverToDate(sStartTime));
						dkhtsxitemdata.setRealEndtime(DateUtils.ConverToDate(sEndTime));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ProjectActivity.kjdb.save(dkhtsxitemdata);
					ViewInject.toast("已添加，请查看");
					mDepartName.setText(null);
					mMiningArea.setText(null);
					mNumber.setText(null);
					mRecordPerson.setText(null);
					mChiefPerson.setText(null);
					mStartTime.setText(null);
					mEndTime.setText(null);
				}
			}
		});

	}

}
