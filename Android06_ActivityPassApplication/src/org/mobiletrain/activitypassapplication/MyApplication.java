package org.mobiletrain.activitypassapplication;

import android.app.Application;
/**
 * Application 描述整个应用程序状态的类
 */
public class MyApplication extends Application {
	 private String str;
	 private int in;
	 
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getIn() {
		return in;
	}
	public void setIn(int in) {
		this.in = in;
	}
	 
	 
}
