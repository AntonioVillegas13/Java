package com.cmc.admin;

import com.cmc.entidades.Producto;

public class AdminProducto {

	// Comparar

	public Producto comparar(Producto a, Producto b) {
		if (a.getPrecio() < b.getPrecio()) {

			return a;
		} else if (a.getPrecio() > b.getPrecio()) {
			return b;
		} else {
			return null;
		}

	}
}
