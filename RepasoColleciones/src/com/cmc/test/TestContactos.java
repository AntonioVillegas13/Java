package com.cmc.test;

import com.cmc.colecciones.Directorio;
import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestContactos {
public static void main(String[] args) {
Contacto cont= new Contacto("1751587393","Antonio","Villegas");
Directorio dir= new Directorio();
	cont.agregarTelefono(new Telefono("Claro","92342453"));
	
	System.out.println(cont);
	dir.agregarContacto(cont);
	dir.buscarContacto("12123423");
	
	dir.eliminarContacto("12123423");
	
	dir.Imprimir();
	
	
	
	
	
	
}
	
	
	
	
	
	
	
}
