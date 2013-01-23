package com.flashback.multiactivitytest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends BaseActivity {

	private TextView lbl02, lbl03, lbl04;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.secound_layout);
	
	lbl02 = (TextView)findViewById(R.id.lblTv02);
	lbl03 = (TextView)findViewById(R.id.lblTv03);
	lbl04 = (TextView)findViewById(R.id.lblTv04);
	
	Intent mIntent = getIntent();
	lbl04.setText(mIntent.getStringExtra("MyDataString"));
	/*
	 * Datenübergabe Variante 1
	 */
	MyData myData = (MyData)getApplication();
	
	if(!MainActivity.MyStaticString.equals(""))
		lbl02.setText(myData.getMyDataString());
	else
		lbl02.setText("MyData is empty");
	
	/*
	 * Datenübergabe Variante 2
	 */
	Intent myIntent = getIntent();
	lbl03.setText(myIntent.getStringExtra("MyDataString"));
	
	}
}
