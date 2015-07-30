package com.activity;

import com.chemicalprospectingpro.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;

public class SampleRegistrationFormActivity extends Activity {

	private EditText userName, password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.sample_registration_form);
		// userName = (EditText) findViewById(R.id.et_zh);
		// password = (EditText) findViewById(R.id.et_mima);
	}

}
