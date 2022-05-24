package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda Celda1;
	private Celda Celda2;
	private Celda Celda3;
	private Celda Celda4;
	private double Saldo = 0;

	public void configurarMaquina(String cd1, String cd2, String cd3, String cd4) {

		this.Celda1 = new Celda(cd1);
		this.Celda2 = new Celda(cd2);
		this.Celda3 = new Celda(cd3);
		this.Celda4 = new Celda(cd4);
	}

	public void mostarConfiguracion() {
		System.out.println("Codigo1:" + this.Celda1.getCodigo());
		System.out.println("Codigo2:" + this.Celda2.getCodigo());
		System.out.println("Codigo3:" + this.Celda3.getCodigo());
		System.out.println("Codigo4:" + this.Celda4.getCodigo());
		System.out.println("Saldo actual:" + this.Saldo);

	}

	public Celda buscarCelda(String codcelbusq) {

		if (this.Celda1.getCodigo() == codcelbusq) {
			return Celda1;

		} else if (this.Celda2.getCodigo() == codcelbusq) {
			return this.Celda2;

		} else if (this.Celda3.getCodigo() == codcelbusq) {
			return this.Celda3;

		} else if (this.Celda4.getCodigo() == codcelbusq) {
			return this.Celda4;

		}

		return null;
	}

	public void cargarProducto(Producto p, String codcell, int stock) {
		Celda celdaRecuperada = buscarCelda(codcell);

		celdaRecuperada.ingresarProducto(p, stock);

	}

	public void mostrarProductos() {
		
		
		if (this.Celda1.getStock() != 0) {
			System.out.println("********************Celda " + this.Celda1.getCodigo());
			System.out.println("Stock Actual:" + this.Celda1.getStock() + "\nNombre  Producto:"
					+ this.Celda1.getProducto().getNombre() + "\nPrecio  producto:"
					+ this.Celda1.getProducto().getPrecio() + "\nCodigo Producto:"
					+ this.Celda1.getProducto().getCodigo());
		} else {
			System.out.println("********************Celda " + this.Celda1.getCodigo());
			System.out.println("Stock:" + this.Celda1.getStock());
			System.out.println("La celda no tiene producto!!!!!");

		}
		if (this.Celda2.getStock() != 0) {
			System.out.println("********************Celda  " + this.Celda2.getCodigo());
			System.out.println("Stock Actual:" + this.Celda2.getStock() + "\nNombre del producto:"
					+ this.Celda2.getProducto().getNombre() + "\nPrecio del producto:"
					+ this.Celda2.getProducto().getPrecio() + "\nCodigo Producto:"
					+ this.Celda1.getProducto().getCodigo());
		} else {
			System.out.println("********************Celda  " + this.Celda2.getCodigo());
			System.out.println("Stock:" + this.Celda2.getStock());
			System.out.println("La celda no tiene producto!!!!!");

		}
		if (this.Celda3.getProducto() != null) {
			System.out.println("********************Celda " + this.Celda3.getCodigo());
			System.out.println("Stock Actual:" + this.Celda3.getStock() + "\nNombre Producto:"
					+ this.Celda3.getProducto().getNombre() + "\nPrecio Producto:"
					+ this.Celda3.getProducto().getPrecio() + "\nCodigo Producto:"
					+ this.Celda3.getProducto().getCodigo());
			
		} else {
			System.out.println("********************Celda " + this.Celda3.getCodigo());
			System.out.println("Stock:" + this.Celda3.getStock());
			System.out.println("La celda no tiene producto!!!!!");

		}
		if (this.Celda4.getStock() != 0) {
			System.out.println("********************Celda " + this.Celda4.getCodigo());

			System.out.println("Stock Actual:" + this.Celda4.getStock() + "\nNombre Producto:"
					+ this.Celda4.getProducto().getNombre() + "\nPrecio Producto:"
					+ this.Celda4.getProducto().getPrecio() + "\nCodigo Producto:"
					+ this.Celda4.getProducto().getCodigo());
		} else {
			System.out.println("********************Celda " + this.Celda4.getCodigo());
			System.out.println("Stock:" + this.Celda4.getStock());
			System.out.println("La celda no tiene producto!!!!!");

		}

		System.out.println("Saldo:" + this.Saldo);

	}

	public Producto buscarProductoEnCelda(String codcell) {
		if (this.Celda1.getCodigo() == codcell) {
			return this.Celda1.getProducto();
		} else if (this.Celda2.getCodigo() == codcell) {
			return this.Celda2.getProducto();
		} else if (this.Celda3.getCodigo() == codcell) {
			return this.Celda3.getProducto();
		} else if (this.Celda4.getCodigo() == codcell) {
			return this.Celda4.getProducto();
		}

		return null;
	}

	public double consultarPrecio(String codcell) {

		if (this.Celda1.getCodigo() == codcell) {
			return this.Celda1.getProducto().getPrecio();

		} else if (this.Celda2.getCodigo() == codcell) {
			return this.Celda2.getProducto().getPrecio();
		} else if (this.Celda3.getCodigo() == codcell) {
			return this.Celda3.getProducto().getPrecio();
		} else if (this.Celda4.getCodigo() == codcell) {
			return this.Celda4.getProducto().getPrecio();
		}

		return 0;
	}

	public Celda buscarCeldaProducto(String codprod) {

		if (this.Celda1.getProducto() != null) {
			if (this.Celda1.getProducto().getCodigo() == codprod) {
				return this.Celda1;

			}
		}

		if (this.Celda2.getProducto() != null) {
			if (this.Celda2.getProducto().getCodigo() == codprod) {
				return this.Celda2;

			}
		}
		if (this.Celda3.getProducto() != null) {
		if (this.Celda3.getProducto().getCodigo() == codprod) {
			return this.Celda3;
		}}

		
		if (this.Celda3.getProducto() != null) {
		if (this.Celda4.getProducto().getCodigo() == codprod) {
			return this.Celda4;
		}}

		return null;
	}

	public void incrementarProducto(String codprod, int incrementos) {
		Celda celdaEncontrada = buscarCeldaProducto(codprod);
		celdaEncontrada.setStock(incrementos + celdaEncontrada.getStock());

	}

	public void vender(String codcell) {
		Celda cell1 = buscarCelda(codcell);
		cell1.setStock(cell1.getStock() - 1);

		this.Saldo = this.Saldo + cell1.getProducto().getPrecio();
		mostrarProductos();
	}

	public double venderConCambio(String codcell, int valoring) {
		Celda cell1 = buscarCelda(codcell);
		cell1.setStock(cell1.getStock() - 1);

		this.Saldo = this.Saldo + cell1.getProducto().getPrecio();
		double vuelto = valoring - cell1.getProducto().getPrecio();

		System.out.println("vUELTO:" + vuelto);
		mostrarProductos();
		return vuelto;
	}

}
