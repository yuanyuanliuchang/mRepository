package com.activity;

import com.chemicalprospectingpro.R;
import com.common.method.MyMethod;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SampleRegistrationFormActivity extends Activity {

	private EditText mDepartName, mMiningArea, mNumber, mRecordPerson, mChiefPerson;
	private TextView mSubmit;
	private String sDepartName, sMiningArea, sNumber, sRecordPerson, sChiefPerson;
	private MyMethod mMyMethod;

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
		mMyMethod = new MyMethod();
		mSubmit = (TextView) findViewById(R.id.submit);
		sDepartName = mDepartName.getText().toString();
		sMiningArea = mMiningArea.getText().toString();
		sNumber = mNumber.getText().toString();
		sRecordPerson = mRecordPerson.getText().toString();
		sChiefPerson = mChiefPerson.getText().toString();
		mSubmit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (mMyMethod.isEmpty(sDepartName) || mMyMethod.isEmpty(sMiningArea) || mMyMethod.isEmpty(sNumber)
						|| mMyMethod.isEmpty(sRecordPerson) || mMyMethod.isEmpty(sChiefPerson)) {
					Toast.makeText(getApplicationContext(), "输入信息有误！", Toast.LENGTH_SHORT).show();
					return;
				} else {
					// 存信息进入数据库

				}
			}
		});

	}

}
