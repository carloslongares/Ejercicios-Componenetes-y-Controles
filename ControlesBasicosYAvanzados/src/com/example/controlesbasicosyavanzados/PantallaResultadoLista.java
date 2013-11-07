package com.example.controlesbasicosyavanzados;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class PantallaResultadoLista extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.segundapantalla);
		final TextView resultado= (TextView)findViewById(R.id.resultado);
		final ImageView resultadoFoto = (ImageView)findViewById(R.id.fotoResultadoLista);
		Bundle bundle= getIntent().getExtras();
		
		resultado.setText(bundle.getString("NOMBRE")+" "+ bundle.getString("APELLIDO")+" " +bundle.getString("EDAD"));
		resultadoFoto.setImageResource(bundle.getInt("FOTO"));
		
		
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
