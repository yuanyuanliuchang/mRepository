package com.activity;

import com.chemicalprospectingpro.R;

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
				if (isEmpty(sDepartName) || isEmpty(sMiningArea) || isEmpty(sNumber) || isEmpty(sRecordPerson)
						|| isEmpty(sChiefPerson)) {
					Toast.makeText(getApplicationContext(), "输入信息有误！", Toast.LENGTH_LONG).show();
					return;
				} else {
					// 存信息进入数据库

				}
			}
		});

	}

	private static boolean isEmpty(String input) {
		if (input == null || "".equals(input))
			return true;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c != ' ' && c != '\t' && c != '\r' && c != '\n') {
				return false;
			}
		}
		return true;
	}
}
