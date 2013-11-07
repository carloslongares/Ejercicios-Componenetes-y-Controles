package com.example.controlesbasicosyavanzados;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class PRadioLogica  extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantallaradio);
		
		final TextView identificador= (TextView)findViewById(R.id.identificador);
		final RadioGroup grupo = (RadioGroup)findViewById(R.id.grpbtn);
		
		grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				if (checkedId==R.id.btnR1)
				identificador.setText("Opcion 2");
				
				if(checkedId== R.id.btnR2)
					identificador.setText("Opcion 1");
				
			}
		});
		
	}
}