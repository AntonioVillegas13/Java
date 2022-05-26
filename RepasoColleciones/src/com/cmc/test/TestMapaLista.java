package com.cmc.test;

import com.cmc.colecciones.DirectorioLista;
import com.cmc.colecciones.DirectorioMapa;
import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestMapaLista {

	public static void main(String[] args) {
		Contacto cont = new Contacto("1751587393", "Antonio", "Villegas");
		Contacto cont3 = new Contacto("1751587393", "f", "Villegas");
		Contacto cont4 = new Contacto("17515387393", "Antonio2", "Villegas");
		cont.agregarTelefono(new Telefono("Claro", "92342453"));
		cont4.agregarTelefono(new Telefono("Claro", "92342453"));
		DirectorioMapa dirM = new DirectorioMapa();
		
		dirM.agregarContacto(cont);
		dirM.Imprimir();
		dirM.agregarContacto(cont3);
		
		dirM.agregarContacto(cont4);
		
		  Contacto cont2 =dirM.buscarContacto("17515387393");
		  System.out.println(cont2);
		

		Contacto cont24 = dirM.eliminarContacto("1751587393");
		System.out.println(cont24);

		
		dirM.Imprimir();
		
		
		
		
		

	}

}
