package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private ArrayList<Celda> Celdas = new ArrayList<Celda>();
	private double Saldo;

	public void agregarCelda(String codcell) {

		Celda cel = new Celda(codcell);

		Celdas.add(cel);

	}

	public void mostarConfiguracion() {
		for (int i = 0; i < Celdas.size(); i++) {
			System.out.println(Celdas.get(i).getCodigo());

		}
	}

	public Celda BuscarCelda(String codcell) {
		for (int i = 0; i < Celdas.size(); i++) {
			Celda cel = Celdas.get(i);

			if (cel.getCodigo() == codcell) {
				return cel;
			}

		}

		return null;

	}

	public void cargarProducto(Producto p, String codcell, int stock) {
		Celda celdaRecuperada = BuscarCelda(codcell);
		celdaRecuperada.ingresarProducto(p, stock);

	}

	public void mostrarProductos() {

		for (int i = 0; i < Celdas.size(); i++) {

			if (this.Celdas.get(i).getStock() != 0) {
				System.out.println("********************Celda " + this.Celdas.get(i).getCodigo());
				System.out.println("Stock Actual:" + this.Celdas.get(i).getStock() + "\nNombre  Producto:"
						+ this.Celdas.get(i).getProducto().getNombre() + "\nPrecio  producto:"
						+ this.Celdas.get(i).getProducto().getPrecio() + "\nCodigo Producto:"
						+ this.Celdas.get(i).getProducto().getCodigo());
			} else {
				System.out.println("********************Celda " + this.Celdas.get(i).getCodigo());
				System.out.println("Stock:" + this.Celdas.get(i).getStock());
				System.out.println("La celda no tiene producto!!!!!");

			}
		}

	}

	public Producto buscarProductoEnCelda(String codcell) {

		for (int i = 0; i < Celdas.size(); i++) {
			Celda cel = Celdas.get(i);

			if (cel.getCodigo() == codcell) {
				return cel.getProducto();
			}

		}
		return null;

	}

	public double consultarPrecio(String codcell) {

		for (int i = 0; i < Celdas.size(); i++) {
			Celda cel = Celdas.get(i);

			if (cel.getCodigo() == codcell) {
				return cel.getProducto().getPrecio();
			}

		}
		return 0;
	}

	public Celda buscarCeldaProducto(String codprod) {
		for (int i = 0; i < Celdas.size(); i++) {
			Celda cel = Celdas.get(i);

			if (cel.getProducto() != null) {
				if (cel.getProducto().getCodigo() == codprod) {
					return cel;

				}
			}

		}
		return null;

	}
	
	public void incrementarProducto(String codprod, int incrementos) {
		Celda celdaEncontrada = buscarCeldaProducto(codprod);
		celdaEncontrada.setStock(incrementos + celdaEncontrada.getStock());

	}
	
	public void vender(String codcell) {
		Celda cell1 = BuscarCelda(codcell);
		cell1.setStock(cell1.getStock() - 1);

		this.Saldo = this.Saldo + cell1.getProducto().getPrecio();
		mostrarProductos();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
