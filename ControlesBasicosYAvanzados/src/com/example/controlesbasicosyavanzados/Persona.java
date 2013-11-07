package com.example.controlesbasicosyavanzados;



public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private int foto;
	
	Persona (String nombre,String apellido,int edad,int foto){
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.foto=foto;
	}
	
	
	
	public String getNombre (){
		return nombre;
	}
	
	
	public String getApellido(){
		return apellido;
	}
	
	
	public int getEdad(){
		return edad;
	}
	
	public int getFoto (){
		return foto;
	}
	
	public String pasaEdad(){
		String edadPasada= Integer.toString(getEdad());
		return edadPasada;
	}

	
	public void setNombre(String nuevoNom){
		nombre=nuevoNom;
	}
	
	
	public void setApellido(String nuevoApe){
		apellido= nuevoApe;
	}
	
	
	public void setEdad (int num){
		edad=num;
	}
}
