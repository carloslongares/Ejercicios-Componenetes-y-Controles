package com.example.controlesbasicosyavanzados;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class PantallaHolaUsuario extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantallaholausuario);
		final EditText txtNombre= (EditText)findViewById(R.id.TextoNombre);
		final Button btnHola = (Button)findViewById(R.id.BotonHola);
		
		btnHola.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent = new Intent (PantallaHolaUsuario.this,PantallaResultadoHolaUsuario.class);
			
				Bundle b = new Bundle();
				
				b.putString("NOMBRE",txtNombre.getText().toString());
				
				intent.putExtras(b);
				
				startActivity(intent);
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
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}

}
