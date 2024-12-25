
package com.example.collegeeventmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Animation slideIn = AnimationUtils.loadAnimation(this, R.anim.slide_in_top);
		TextView textView = (TextView) findViewById(R.id.textView1);
		textView.startAnimation(slideIn);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void login(View v)
	{
		Intent in=new Intent(MainActivity.this,ThirdActivity.class);
		startActivity(in);
	}
	public void register(View v)
	{
		Intent in=new Intent(MainActivity.this,SecondActivity.class);
		startActivity(in);
	}
	public void about(View v)
	{
		Intent in=new Intent(MainActivity.this,NinthActivity.class);
		startActivity(in);
	}
	public void contact(View v)
	{
		Intent in=new Intent(MainActivity.this,TenthActivity.class);
		startActivity(in);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}