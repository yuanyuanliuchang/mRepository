package com.activity;

import org.kymjs.kjframe.KJActivity;
import org.kymjs.kjframe.ui.BindView;

import com.chemicalprospectingpro.R;
import com.common.method.MyMethod;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddDetail extends KJActivity {

	private MyMethod mMyMethod;
	private String sSeq, sSampNo, sCol, sHoriCoord, sLongituCoord, sReSamp, sWaterProp, sSampWei, sMicroTopog,
			sSizeOrNUm;

	@BindView(id = R.id.inputSeq)
	private EditText mSeq;
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
	private EditText mSizeOrNUm;

	@BindView(id = R.id.submitDetail, click = true)
	private Button addDetail;
	@BindView(id = R.id.cancelDetail, click = true)
	private Button cancelDetail;

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
		sSeq = mSeq.getText().toString();
		sSampNo = mSampNo.getText().toString();
		sCol = mCol.getText().toString();
		sHoriCoord = mHoriCoord.getText().toString();
		sLongituCoord = mLongituCoord.getText().toString();
		sReSamp = mReSamp.getText().toString();
		sWaterProp = mWaterProp.getText().toString();
		sSampWei = mSampWei.getText().toString();
		sMicroTopog = mMicroTopog.getText().toString();
		sSizeOrNUm = mSizeOrNUm.getText().toString();
		mMyMethod = new MyMethod();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.kymjs.kjframe.ui.FrameActivity#initWidget()
	 */
	@Override
	public void initWidget() {
		// TODO Auto-generated method stub
		super.initWidget();
	}

	/* 
	 * (non-Javadoc)
	 * 
	 * @see org.kymjs.kjframe.ui.FrameActivity#onClick(android.view.View)
	 */
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		super.onClick(v);
		switch (v.getId()) {
		case R.id.submitDetail:
			// 提交数据指标数据库
			if (mMyMethod.isEmpty(sSeq) || mMyMethod.isEmpty(sSampNo) || mMyMethod.isEmpty(sCol)
					|| mMyMethod.isEmpty(sHoriCoord) || mMyMethod.isEmpty(sLongituCoord) || mMyMethod.isEmpty(sReSamp)
					|| mMyMethod.isEmpty(sWaterProp) || mMyMethod.isEmpty(sSampWei) || mMyMethod.isEmpty(sMicroTopog)
					|| mMyMethod.isEmpty(sSizeOrNUm)) {
				Toast.makeText(getApplicationContext(), "输入信息有误！", Toast.LENGTH_SHORT).show();
				return;
			} else {
				// 存信息进入数据库

			}
			break;
		case R.id.cancelDetail:
			finish();
			overridePendingTransition(R.anim.animation_enterfromleft, R.anim.animation_fadefromright);
			break;
		default:
			break;
		}

	}

}
