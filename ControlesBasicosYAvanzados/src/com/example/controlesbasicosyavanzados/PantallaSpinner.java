package com.example.controlesbasicosyavanzados;

import com.example.controlesbasicosyavanzados.*;
import com.example.controlesbasicosyavanzados.AdaptadorPersona.ViewHolder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class PantallaSpinner extends Activity {

	boolean flag =false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantallaspinner);
		final Spinner spinner= (Spinner)findViewById(R.id.ComboOpciones);
		
		AdaptadorPersonaSpinner miAdaptador= new AdaptadorPersonaSpinner (this);
		spinner.setAdapter(miAdaptador);
		
		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> parent,  android.view.View v, int position, long id){
				Intent intentSpinner = new Intent (PantallaSpinner.this,PantallaResultadoSpinner.class);
				
				if (flag==false){
					flag=true;
				
				}else
				{
				String nombre=((Persona)parent.getAdapter().getItem(position)).getNombre();
				String apellido =((Persona)parent.getAdapter().getItem(position)).getApellido();
				String edad = ((Persona)parent.getAdapter().getItem(position)).pasaEdad();
				int fotoSpinner = ((Persona)parent.getAdapter().getItem(position)).getFoto();
				Bundle b = new Bundle();
				
				b.putInt("FOTOSPINNER", fotoSpinner);
				b.putString("NOMBREsp", nombre);
				b.putString("APELLIDOsp", apellido);
				b.putString("EDADsp",edad);
				
				intentSpinner.putExtras(b);
	
				startActivity(intentSpinner);
				}
			}
			
			public void onNothingSelected(AdapterView<?> parent){
				//mensaje.setText("Nada seleccionado");
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
class AdaptadorPersonaSpinner extends ArrayAdapter<Persona>{
	
	static class ViewHolder {
		TextView lblnombre;
		TextView lblApellido;
		TextView lblEdad;
		ImageView lblfoto;
	}
	
	
	
	Activity miActividad;
	AdaptadorPersonaSpinner (Activity miActividad){
		super(miActividad,R.layout.desgloselista,personas);
		this.miActividad=miActividad;
	}
	

	public View getDropDownView(int position,View convertView,ViewGroup Parent){
		return getView( position,convertView,Parent);
	}

	public  View getView (int position,View convertView,ViewGroup Parent){
		View item=convertView;
		ViewHolder holder;
		
		if(item==null){
			
			LayoutInflater inflater= miActividad.getLayoutInflater();
			item= inflater.inflate(R.layout.desgloselista,null);
			
			holder = new ViewHolder();
			holder.lblnombre=(TextView)item.findViewById(R.id.campoNombre);
			holder.lblApellido= (TextView)item.findViewById(R.id.campoApellido);
			holder.lblEdad = (TextView)item.findViewById(R.id.campoEdad);
			holder.lblfoto = (ImageView)item.findViewById(R.id.foto);
			item.setTag(holder);
			
		}else
			holder= (ViewHolder)item.getTag();
		
		
		holder.lblnombre.setText(personas[position].getNombre());
		holder.lblApellido.setText(personas[position].getApellido());
		holder.lblEdad.setText(Integer.toString(personas[position].getEdad()));
		holder.lblfoto.setImageResource(personas[position].getFoto());
		
		return (item);
		}	
	
		private static Persona[] personas = new Persona[]{
				new Persona("Carlos","Longares",21,R.drawable.hom),
				new Persona("Consuelo","Martin",20,R.drawable.muj),
				new Persona ("Fernando","Molina",26,R.drawable.hom)
		};
	
		
}