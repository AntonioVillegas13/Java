package com.clearminds.componentes;

public class Celda {

	private Producto producto;
	private int stock;
	private String Codigo = "";

	public void ingresarProducto(Producto p, int stockini) {
		this.producto = p;
		this.stock = stockini;

	}

	// Constructors

	public Celda(String codigo) {
		this.Codigo = codigo;

	}

	// gETTER Y sETTER

	public Producto getProducto() {
		return producto;
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
