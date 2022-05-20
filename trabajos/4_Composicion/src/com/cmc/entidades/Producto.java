package com.cmc.entidades;

public class Producto {

	
	
	
	private String Nombre;
	private double precio;
	
	
	
	
	public String getNombre() {
		return Nombre;
	}




	public double getPrecio() {
		return precio;
	}




	public Producto(String nombre, double precio) {
		//super();
		Nombre = nombre;
		this.precio = precio;
	}
	
	
	
	
	
	
	
}
