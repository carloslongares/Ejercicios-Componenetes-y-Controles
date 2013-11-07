package com.example.controlesbasicosyavanzados;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class PCheckLogica  extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantallacheck);
		
		final CheckBox botonCheck1 = (CheckBox)findViewById(R.id.btnC1);
		final CheckBox botonCheck2 = (CheckBox)findViewById(R.id.btnC2);
		final Button btnConfirmar = (Button)findViewById(R.id.btnConfirma);
		final TextView resultadoCheck = (TextView)findViewById(R.id.resultadoCheck);
	
		btnConfirmar.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String resultado ="";
				if (botonCheck1.isChecked()==true)
					resultado += "opcion1 marcada ";

				if(botonCheck2.isChecked()==true)
					resultado+="opcion2 marcada ";
				
				if (botonCheck1.isChecked()==false && botonCheck2.isChecked()==false)
					resultado ="Nada marcado";
				resultadoCheck.setText(resultado);
			}
		});
	
	
	}
		
}
