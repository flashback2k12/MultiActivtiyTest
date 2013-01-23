package com.flashback.multiactivitytest;

import android.app.Application;

public class MyData extends Application {

	private String myDataString;

	public String getMyDataString() {
		return myDataString;
	}

	public void setMyDataString(String myDataString) {
		this.myDataString = myDataString;
	}
}
