package com.cmc.colecciones;

import com.cmc.entidades.Contacto;

public class Directorio {

	public void agregarContacto(Contacto contacto) {
		System.out.println("Metodo agregarContactono implementado" + contacto);
	}

	public Contacto buscarContacto(String ced) {

		System.out.println("metodo buscarContacto no implementado");
		return null;

	}
	
	public Contacto eliminarContacto(String ced){
		System.out.println("metodo  eliminarContacto no implementado");
		return null;
		
	}
	
	
	public void Imprimir(){
		
		System.out.println("imprimiendo");
	}

}
