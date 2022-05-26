package com.cmc.entidades;

import java.util.ArrayList;

public class Contacto {
	
	
	String Cedula;
	String Nombre;
	String Apellido;
	
	ArrayList<Telefono> telefonos;
//Constructor
	public Contacto(String cedula, String nombre, String apellido) {
		super();
		telefonos= new ArrayList<Telefono>();
		Cedula = cedula;
		Nombre = nombre;
		Apellido = apellido;
	}
	//gettery setter
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	//to string 
	@Override
	public String toString() {
		return "Contacto [Cedula=" + Cedula + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", telefonos="
				+ telefonos + "]";
	}
	
	
	
	public void agregarTelefono(Telefono telf){
		telefonos.add(telf);
		
	}
	
	
	
	
	
	
	
	

}
