package com.activity;

import java.util.Date;
import java.util.List;

import org.kymjs.kjframe.KJActivity;
import org.kymjs.kjframe.database.OneToManyLazyLoader;
import org.kymjs.kjframe.ui.BindView;
import org.kymjs.kjframe.ui.ViewInject;

import com.android.util.DateUtils;
import com.chemicalprospecting.DKHtsxItemData;
import com.chemicalprospecting.DKHtsxSample;
import com.common.method.MyMethod;
import com.kanyuan.circleloader.R;

import android.content.Intent;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import bigkoo.pickerview.TimePopupWindow;
import bigkoo.pickerview.TimePopupWindow.OnTimeSelectListener;
import bigkoo.pickerview.TimePopupWindow.Type;

public class AddDetail extends KJActivity {

	private MyMethod mMyMethod;
	private String sSampNo, sCol, sHoriCoord, sLongituCoord, sReSamp, sWaterProp, sSampWei, sMicroTopog, sSizeOrNum,
			sSampleCollector, sRecorder, sExaminer, sSampleDate, sRemarks;
	private int projectID;
	private DKHtsxItemData dkHtsxItemData;
	private DKHtsxSample dkHtsxSampleData;

	@BindView(id = R.id.inputSampNo)
	private EditText mSampNo;
	@BindView(id = R.id.inputCol)
	private EditText mCol;
	@BindView(id = R.id.inputHoriCoord)
	private EditText mHoriCoord;
	@BindView(id = R.id.inputLongituCoord)
	private EditText mLongituCoord;
	@BindView(id = R.id.inputReSamp)
	private EditText mReSamp;
	@BindView(id = R.id.inputWaterProp)
	private EditText mWaterProp;
	@BindView(id = R.id.inputSampWei)
	private EditText mSampWei;
	@BindView(id = R.id.inputMicroTopog)
	private EditText mMicroTopog;
	@BindView(id = R.id.inputSizeOrNUm)
	private EditText mSizeOrNum;
	@BindView(id = R.id.inputSampleCollector)
	private EditText mSampleCollector;
	@BindView(id = R.id.inputRecorder)
	private EditText mRecorder;
	@BindView(id = R.id.inputExaminer)
	private EditText mExaminer;
	@BindView(id = R.id.inputSampleDate)
	private EditText mSampleDate;
	@BindView(id = R.id.inputRemarks)
	private EditText mRemarks;

	@BindView(id = R.id.submitDetail, click = true)
	private Button addDetail;
	@BindView(id = R.id.cancelDetail, click = true)
	private Button cancelDetail;

	TimePopupWindow recordTime;

	@Override
	public void setRootView() {
		// TODO Auto-generated method stub
		setContentView(R.layout.add_detail);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.kymjs.kjframe.ui.FrameActivity#initData()
	 */
	@Override
	public void initData() {
		// TODO Auto-generated method stub
		super.initData();
		Intent intent = getIntent();
		projectID = intent.getIntExtra("projectID", 0);
	}

	@Override
	public void initWidget() {
		// TODO Auto-generated method stub
		super.initWidget();
		// mSampleDate = (EditText) findViewById(R.id.inputSampleDate);
		mMyMethod = new MyMethod();
		recordTime = new TimePopupWindow(this, Type.YEAR_MONTH_DAY);
		recordTime.setOnTimeSelectListener(new OnTimeSelectListener() {

			@Override
			public void onTimeSelect(Date date) {
				mSampleDate.setText(DateUtils.getTime(date));
			}
		});
		String currentDate = DateUtils.getCurrentDate();
		mSampleDate.setText(currentDate);
		mSampleDate.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				recordTime.showAtLocation(mSampleDate, Gravity.BOTTOM, 0, 0, new Date());
				return true;
			}
		});
	}

	@Override
	public void widgetClick(View v) {
		// TODO Auto-generated method stub
		// super.widgetClick(v);
		switch (v.getId()) {
		case R.id.submitDetail:
			textToString();
			// 提交数据指标数据库
			Boolean isTextEmpty = isTextEmpty();
			if (isTextEmpty) {
				ViewInject.toast(getApplicationContext(), "请输入完整信息！");
			} else {
				// 存信息进入数据库,清空数据
				saveDKHtsxSampleData();
				emptyText();
			}
			break;
		case R.id.cancelDetail:
			finishActivity();
			break;
		case R.id.inputSampleDate:
			recordTime.showAtLocation(mSampleDate, Gravity.BOTTOM, 0, 0, new Date());
			break;
		default:
			break;
		}
	}

	private void textToString() {
		sSampNo = mSampNo.getText().toString();
		sCol = mCol.getText().toString();
		sHoriCoord = mHoriCoord.getText().toString();
		sLongituCoord = mLongituCoord.getText().toString();
		sReSamp = mReSamp.getText().toString();
		sWaterProp = mWaterProp.getText().toString();
		sSampWei = mSampWei.getText().toString();
		sMicroTopog = mMicroTopog.getText().toString();
		sSizeOrNum = mSizeOrNum.getText().toString();
		sSampleCollector = mSampleCollector.getText().toString();
		sRecorder = mRecorder.getText().toString();
		sExaminer = mExaminer.getText().toString();
		sSampleDate = mSampleDate.getText().toString();
		sRemarks = mRemarks.getText().toString();
	}

	private void saveDKHtsxSampleData() {
		dkHtsxSampleData = new DKHtsxSample();
		dkHtsxItemData = ProjectActivity.kjdb.findById(projectID, DKHtsxItemData.class);
		dkHtsxSampleData.setSampleCode(sSampNo);
		dkHtsxSampleData.setDataSources((short) 2);
		dkHtsxSampleData.setSamplColor(sCol);
		dkHtsxSampleData.setRepeFlag(sReSamp);
		dkHtsxSampleData.setPosX(Float.parseFloat(sHoriCoord));
		dkHtsxSampleData.setPosY(Float.parseFloat(sLongituCoord));
		dkHtsxSampleData.setWaterProp(sWaterProp);
		dkHtsxSampleData.setSampleWeight(Float.parseFloat(sSampWei));
		dkHtsxSampleData.setMicroTopography(sMicroTopog);
		dkHtsxSampleData.setSampleParticle(Float.parseFloat(sSizeOrNum));
		dkHtsxSampleData.setSampler(sSampleCollector);
		dkHtsxSampleData.setRecordPerson(sRecorder);
		dkHtsxSampleData.setCheckPerson(sExaminer);
		dkHtsxSampleData.setRemarks(sRemarks);
		dkHtsxSampleData.setItemID(projectID);
		dkHtsxSampleData.setDkHtsxItemdata(dkHtsxItemData);
		// 将child放入parent中
		OneToManyLazyLoader<DKHtsxItemData, DKHtsxSample> loader = dkHtsxItemData.getDkhtsxSample();
		List<DKHtsxSample> sample = loader.getList();
		sample.add(dkHtsxSampleData);
		ProjectActivity.kjdb.update(dkHtsxItemData);
		ProjectActivity.kjdb.save(dkHtsxSampleData);
	}

	private void emptyText() {
		mSampNo.setText(null);
		mCol.setText(null);
		mHoriCoord.setText(null);
		mLongituCoord.setText(null);
		mReSamp.setText(null);
		mWaterProp.setText(null);
		mSampWei.setText(null);
		mMicroTopog.setText(null);
		mSizeOrNum.setText(null);
		mSampleCollector.setText(null);
		mRecorder.setText(null);
		mExaminer.setText(null);
		mSampleCollector.setText(null);
		mRecorder.setText(null);
		mRecorder.setText(null);
		mSampleDate.setText(null);
		mRemarks.setText(null);
	}

	private Boolean isTextEmpty() {
		if (mMyMethod.isEmpty(sSampNo) || mMyMethod.isEmpty(sCol) || mMyMethod.isEmpty(sHoriCoord)
				|| mMyMethod.isEmpty(sLongituCoord) || mMyMethod.isEmpty(sReSamp) || mMyMethod.isEmpty(sWaterProp)
				|| mMyMethod.isEmpty(sSampWei) || mMyMethod.isEmpty(sMicroTopog) || mMyMethod.isEmpty(sSizeOrNum)
				|| mMyMethod.isEmpty(sSampleCollector) || mMyMethod.isEmpty(sRecorder) || mMyMethod.isEmpty(sExaminer)
				|| mMyMethod.isEmpty(sSampleDate) || mMyMethod.isEmpty(sRemarks)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			finishActivity();
		}
		return true;
	}

	private void finishActivity() {
		finish();
		overridePendingTransition(R.anim.animation_enterfromleft, R.anim.animation_fadefromright);
	}

}
