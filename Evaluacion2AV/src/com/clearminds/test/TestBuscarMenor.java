package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenor {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();

		maquina.agregarCelda("A1");
		maquina.agregarCelda("B1");
		maquina.agregarCelda("CX1");
		maquina.agregarCelda("D1");
		maquina.agregarCelda("E1");
		maquina.agregarCelda("F1");

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "B1", 133);
		Producto producto2 = new Producto("D456", "Doritos", 0.70);
		maquina.cargarProducto(producto2, "A1", 3);
		
		Producto producto8 = new Producto("D4536", "Doritos VERDES", 0.20);
		maquina.cargarProducto(producto8, "CX1", 1);
		
		Producto producto4 = new Producto("D23sf6", "Tquitos", 0.23);
		maquina.cargarProducto(producto4, "D1", 5);
		Producto producto5 = new Producto("D23sf6", "Ruffles", 0.100);
		maquina.cargarProducto(producto5, "E1", 3);
		Producto producto6 = new Producto("D23sf6", "Ruffles", 0.50);
		maquina.cargarProducto(producto6, "F1", 13);
		
		
		Celda  c=maquina.buscarMenor();
		//maquina.mostrarProductos();
		System.out.println("La celda con menor stock tiene el codigo:"+c.getCodigo()+"  y tuvo un stock de:"+c.getStock());


	}

}
