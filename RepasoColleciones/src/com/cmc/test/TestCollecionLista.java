package com.cmc.test;

import com.cmc.colecciones.DirectorioLista;
import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestCollecionLista {
	public static void main(String[] args) {

		Contacto cont = new Contacto("1751587393", "Antonio", "Villegas");
		Contacto cont3 = new Contacto("1751587393", "f", "Villegas");
		Contacto cont4 = new Contacto("17515387393", "Antonio2", "Villegas");
		cont.agregarTelefono(new Telefono("Claro", "92342453"));
		cont4.agregarTelefono(new Telefono("Claro", "92342453"));
		DirectorioLista dirl = new DirectorioLista();

		dirl.agregarContacto(cont);
		dirl.Imprimir();
		dirl.agregarContacto(cont3);
		dirl.agregarContacto(cont4);
		
		  Contacto cont2 =dirl.buscarContacto("17515387393");
		  System.out.println(cont2);
		

		Contacto cont24 = dirl.eliminarContacto("1751587393");
		System.out.println(cont24);

		
		dirl.Imprimir();
		
	}

}
