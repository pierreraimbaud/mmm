package com.example.tp1;

import android.support.v7.app.ActionBarActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		Intent intent = getIntent();
		
		String nom;
		String prenom;
		String date; 
		String ville; 
		
		/*nom = intent.getStringExtra("nom");
		prenom = intent.getStringExtra("prenom");
		date =intent.getStringExtra("date");
		ville =intent.getStringExtra("ville");
		*/
		
		Repertoire r = intent.getExtras().getParcelable("key");
		
		nom = r.getNom();
		prenom = r.getPrenom();
		date = r.getDate();
		ville = r.getVille();
		
		TextView t = (TextView)findViewById(R.id.Nom2);
		t.setText(nom);
		t = (TextView)findViewById(R.id.Prenom2);
		t.setText(prenom);
		t = (TextView)findViewById(R.id.Date2);
		t.setText(date);
		t = (TextView)findViewById(R.id.Ville2);
		t.setText(ville);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		//int id = item.getItemId();

		return true;
		//default : return super.onOptionsItemSelected(item);

	}
}

