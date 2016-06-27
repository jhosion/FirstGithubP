package org.mobiletrain.activitypassapplication;

import com.qianfeng.activitypassapp.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {
	private TextView tv;
	private MyApplication app;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		tv=(TextView) findViewById(R.id.textView1);
		app=(MyApplication) getApplication();
		String str=app.getStr();
		int in=app.getIn();
		tv.setText("str="+str+",in="+in);
	}

}
