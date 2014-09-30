package com.example.tp1;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button custom = (Button) findViewById(R.id.button1);
		custom.setBackgroundColor(Color.RED);
		custom.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				String reponse="";
				TextView t = (TextView)findViewById(R.id.editText1);
				reponse += t.getText()+"\n";
				t = (TextView)findViewById(R.id.editText3);
				reponse += t.getText()+"\n";
				t = (TextView)findViewById(R.id.editText2);
				reponse += t.getText()+"\n";
				t = (TextView)findViewById(R.id.editText4);
				reponse += t.getText();
				Toast.makeText(getApplicationContext(), reponse, Toast.LENGTH_LONG).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
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
