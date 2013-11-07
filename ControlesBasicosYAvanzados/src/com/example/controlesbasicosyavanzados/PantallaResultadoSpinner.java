package com.example.controlesbasicosyavanzados;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PantallaResultadoSpinner extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantallaresultadospinner);
		final TextView resultado= (TextView)findViewById(R.id.resultadoSpinner);
		final ImageView resultadoFotoS =(ImageView)findViewById(R.id.fotoResultadoSpinner);
		Bundle bundle= getIntent().getExtras();
		
		resultado.setText(bundle.getString("NOMBREsp")+" "+ bundle.getString("APELLIDOsp")+" " +bundle.getString("EDADsp"));
		resultadoFotoS.setImageResource(bundle.getInt("FOTOSPINNER"));
		
		
	}
}
