package com.cmc.test;

import com.cmc.admin.AdminProducto;
import com.cmc.entidades.Producto;

public class testProducto {

	public static void main(String[] args) {

		AdminProducto admin = new AdminProducto();
		Producto uno = new Producto("papas", 0.80);
		Producto dos = new Producto("dorilocos", 0.80);
		Producto finalP = admin.comparar(uno, dos);

		if (finalP != null) {
			System.out.println(finalP.getNombre());
		} else {
			System.out.println("Precio igualado");
		}
	}

}
