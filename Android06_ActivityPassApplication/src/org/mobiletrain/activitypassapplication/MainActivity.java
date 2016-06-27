package org.mobiletrain.activitypassapplication;

import com.qianfeng.activitypassapp.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
/**
 * 演示application的使用
 * application与应用程序的生命周期一致  随着应用程序的退出而销毁
 * 一般如果多个Activity需要进行传值或者是两个没有直接进行跳转的activity进行传值时需要使用application
 * 
 * 需求:将String字符串类型和int整型数据传递到ResultActivity界面
 *
 * application的传值的步骤:
 * 1.创建类继承application  将需要传递的数据作为该类的属性
 * 2.在需要传递的activity中获取application对象  然后将需要存储的数据调用setXX()方法进行存储
 * 3.在需要接收数据的Activity中获取application对象  然后调用getX()方法获取存储的数据值
 * 4.在manifest文件中注册application
 *  <application
        android:name="com.qianfeng.activitypassapp.MyApplication">
    </application>
 */
public class MainActivity extends Activity {
	private Button button;
	private MyApplication app;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button=(Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//获取application的对象
				app=(MyApplication) getApplication();
				app.setStr("凤姐");
				app.setIn(30);
				
				startActivity(new Intent(MainActivity.this, ResultActivity.class));
			}
		});
	}
}










