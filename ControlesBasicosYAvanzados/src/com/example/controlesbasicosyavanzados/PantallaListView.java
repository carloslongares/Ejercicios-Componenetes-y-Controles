package com.example.controlesbasicosyavanzados;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class PantallaListView extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.milista);
		
		ListView miLista = (ListView)findViewById(R.id.lista);
		AdaptadorPersona miAdaptador = new AdaptadorPersona (this);
		miLista.setAdapter(miAdaptador);
		
		final TextView resultadoMen =(TextView)findViewById(R.id.seleccionado);
		miLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent,  android.view.View v, int position, long id){
				String nombre=((Persona)parent.getAdapter().getItem(position)).getNombre();
				String apellido =((Persona)parent.getAdapter().getItem(position)).getApellido();
				String edad = ((Persona)parent.getAdapter().getItem(position)).pasaEdad();
				int foto = ((Persona)parent.getAdapter().getItem(position)).getFoto();
				resultadoMen.setText("Seleccionado "+nombre+" "+apellido+" "+ edad);
				
				Intent intent= new Intent (PantallaListView.this,PantallaResultadoLista.class);
				
				Bundle b = new Bundle();
				b.putInt("FOTO", foto);
				b.putString("NOMBRE", nombre);
				b.putString("APELLIDO", apellido);
				b.putString("EDAD", edad);
				
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

}



class AdaptadorPersona extends ArrayAdapter<Persona>{
	
	static class ViewHolder {
		TextView lblnombre;
		TextView lblApellido;
		TextView lblEdad;
		ImageView lblFotoLista;
	}
	
	
	
	Activity miActividad;
	AdaptadorPersona (Activity miActividad){
		super(miActividad,R.layout.desmilista,personas);
		this.miActividad=miActividad;
	}
	



	public  View getView (int position,View convertView,ViewGroup Parent){
		View item=convertView;
		ViewHolder holder;
		
		if(item==null){
			
			LayoutInflater inflater= miActividad.getLayoutInflater();
			item= inflater.inflate(R.layout.desmilista,null);
			
			holder = new ViewHolder();
			holder.lblnombre=(TextView)item.findViewById(R.id.campoNombre);
			holder.lblApellido= (TextView)item.findViewById(R.id.campoApellido);
			holder.lblEdad = (TextView)item.findViewById(R.id.campoEdad);
			holder.lblFotoLista=(ImageView)item.findViewById(R.id.fotoLista);
			item.setTag(holder);
			
		}else
			holder= (ViewHolder)item.getTag();
		
		holder.lblnombre.setText(personas[position].getNombre());
		holder.lblApellido.setText(personas[position].getApellido());
		holder.lblEdad.setText(Integer.toString(personas[position].getEdad()));
		holder.lblFotoLista.setImageResource(personas[position].getFoto());
		
		return item;
		}	
	
		private static Persona[] personas = new Persona[]{
				new Persona("Carlos","Longares",21,R.drawable.hom),
				new Persona("Consuelo","Martin",20,R.drawable.muj),
				new Persona ("Fernando","Molina",26,R.drawable.hom)
		};
	
		
}





