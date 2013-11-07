package com.example.controlesbasicosyavanzados;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class PantallaResultadoHolaUsuario extends Activity {

	
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.pantalla_mensaje);
			TextView txtsaludo =(TextView)findViewById(R.id.TextoMensaje);
			Bundle bundle = getIntent().getExtras();
			txtsaludo.setText("HOLA " + bundle.getString("NOMBRE"));
			
			//txtsaludo.sette
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}
	}


