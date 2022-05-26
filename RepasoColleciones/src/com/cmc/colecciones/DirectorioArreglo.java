package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Contacto;

public class DirectorioArreglo  extends Directorio{

	Contacto[] contactos;
	
	private int elementosagregados;
	
	public DirectorioArreglo() {
		// super();

		contactos = new Contacto[100];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void agregarContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		
		
		if(elementosagregados<contactos.length){
			contactos[elementosagregados]=contacto;
			elementosagregados++;
			}
		
		
		
		
		
		
		
		for (int i=0;i<contactos.length;i++) {
			Contacto c=contactos[i];
			
			System.out.println("---------");
			System.out.println(c);
			
			if (c.getCedula().equals(contacto.getCedula()) && c!=contacto) {
				System.out.println("******************");
			System.out.println(c);
			contactos[i]=null;
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	

	@Override
	public Contacto buscarContacto(String ced) {
		// TODO Auto-generated method stub
		return super.buscarContacto(ced);
	}

	@Override
	public Contacto eliminarContacto(String ced) {
		// TODO Auto-generated method stub
		return super.eliminarContacto(ced);
	}

	@Override
	public void Imprimir() {
		// TODO Auto-generated method stub
		super.Imprimir();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
