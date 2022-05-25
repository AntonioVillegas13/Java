package com.cmc.entidades;

public class Clientes {

	
	private String Cedula;
	private String nombre;
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//Constructor
	public Clientes(String cedula, String nombre) {
		super();
		Cedula = cedula;
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Clientes [Cedula=" + Cedula + ", nombre=" + nombre + "]";
	}
	
	
}
