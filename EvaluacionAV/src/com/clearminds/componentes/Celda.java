package com.clearminds.componentes;

public class Celda {

	private Producto producto;
	private int stock;
	private String Codigo="";

	public Celda(String codigo) {
		this.Codigo=codigo;
		
	}

	public void ingresarProducto(Producto p,int stockini){
		this.producto=p;
		this.stock=stockini;
	
	}
	
	//Constructors
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// gETTER Y sETTER

	public Producto getProducto() {
		return producto;
	}



	

	public Celda() {
		super();
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

}
