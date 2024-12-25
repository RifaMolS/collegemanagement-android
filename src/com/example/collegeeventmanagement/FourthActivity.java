package com.example.collegeeventmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class FourthActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fourth, menu);
		return true;
	}
	public void event(View v) {
		Intent i=new Intent(FourthActivity.this,SixthActivity.class);
		startActivity(i);
	}
	public void register(View v) {
		Intent i=new Intent(FourthActivity.this,FifthActivity.class);
		startActivity(i);
	}
	public void view(View v) {
		Intent i=new Intent(FourthActivity.this,SeventhActivity.class);
		startActivity(i);
	}
	public void logout(View v) {
		Intent i=new Intent(FourthActivity.this,MainActivity.class);
		startActivity(i);
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
