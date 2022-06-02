package com.clearminds.componentes;

public class Producto {

	private String Nombre;
	private double Precio;
	private String Codigo=" ";
	
	public void incrementarPrecio(double i){
		double p=(i*this.Precio)/100;
		this.Precio=this.Precio+p;
		
		
		
	}
	public void disminuirPrecio(double d){
	
		this.Precio=this.Precio-d;
		
		
		
	}
	
	//Constructor
	public Producto(String codigo,String nombre, double precio ) {
		//super();
		Nombre = nombre;
		Precio = precio;
		Codigo = codigo;
	}
	
	
	
	//gETTER Y sETTER

	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public String  getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	
	
	
	
	
	
}