package com.example.controlesbasicosyavanzados;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class PantallaPrincipal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);
		final ImageView portada = (ImageView)findViewById(R.id.fotoPortada);
		portada.setImageResource(R.drawable.portada);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId())
			{
			case R.id.controlesBasicos:
				Intent intentBasicos =new Intent(PantallaPrincipal.this,PantallaControlesBasicos.class);
				startActivity(intentBasicos);
				return true;
			case R.id.controlesAvanzados:
				Intent  intentAvanzados = new Intent (PantallaPrincipal.this,PantallaControlesAvanzados.class);
				startActivity(intentAvanzados);
				return true;
			case R.id.acercaDe:
				Intent intentAcercaDe = new Intent (PantallaPrincipal.this,PantallaAcercaDe.class);
				startActivity(intentAcercaDe);
				return true;
			default:
				return super.onOptionsItemSelected(item);

		
			}
		}

}
