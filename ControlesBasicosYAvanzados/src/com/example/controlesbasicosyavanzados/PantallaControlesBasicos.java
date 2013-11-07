package com.example.controlesbasicosyavanzados;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PantallaControlesBasicos extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantallacontrolesbasicos);
		final Button botonHola = (Button)findViewById(R.id.btnSaludo);
		final Button botonRadio = (Button)findViewById(R.id.btnRadioButton);
		final Button botonCheck = (Button)findViewById(R.id.btnCheckbox);
		
		botonHola.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent = new Intent (PantallaControlesBasicos.this,PantallaHolaUsuario.class);
				startActivity(intent);
			}
		});
		
		
		
		botonRadio.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent = new Intent (PantallaControlesBasicos.this,PRadioLogica.class);
				startActivity(intent);
			}
		});
		
		
		
		botonCheck.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent = new Intent (PantallaControlesBasicos.this,PCheckLogica.class);
				startActivity(intent);
			}
		});
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}
}
