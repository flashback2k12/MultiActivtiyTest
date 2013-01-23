/*
 * Credits and big thanks: http://chrisrisner.com/31-Days-of-Android
 */

package com.flashback.multiactivitytest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends BaseActivity {

	public TextView lbl01;
	public EditText et01;
	Button btn01, btn02, btn03;
	
	public static String MyStaticString;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lbl01 = (TextView)findViewById(R.id.lblTv01);
		
		et01 = (EditText)findViewById(R.id.et01);
		et01.setText(R.string.tv01);
		
		btn01 = (Button)findViewById(R.id.btn01);
		btn01.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				lbl01.setText(et01.getText());
				
			}
		});
		/*
		 * Datenübergabe Variante 1
		 */
		
		btn02 = (Button)findViewById(R.id.btn02);
		btn02.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(getApplicationContext(), ActivityTwo.class));
				
				MyStaticString = et01.getText().toString();
				
				MyData myData = (MyData)getApplication();
				
				myData.setMyDataString(et01.getText().toString());
			}
		});
		
		/*
		 * Datenübergabe Variante 2
		 */
		
		btn03 = (Button)findViewById(R.id.btn03);
		btn03.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent myIntent = new Intent(getApplicationContext(), ActivityTwo.class);
				myIntent.putExtra("MyDataString", et01.getText().toString());
				startActivity(myIntent);						
			}
		});
	}
}

