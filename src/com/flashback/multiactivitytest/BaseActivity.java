package com.flashback.multiactivitytest;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public abstract class BaseActivity extends Activity {

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.options_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
 
		switch (item.getItemId()) {
		case R.id.item01:
			startActivity(new Intent(getApplicationContext(),MainActivity.class));
//			finish(); 
			return true;
		case R.id.item02:
			startActivity(new Intent(getApplicationContext(),ActivityTwo.class));
//			finish();
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
