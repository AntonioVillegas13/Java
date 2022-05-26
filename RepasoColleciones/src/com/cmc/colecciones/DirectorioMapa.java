package com.cmc.colecciones;

import java.util.ArrayList;
import java.util.HashMap;

import com.cmc.entidades.Contacto;

public class DirectorioMapa  extends Directorio{

	HashMap<String,Contacto> contactos;
	
	public DirectorioMapa() {
		// super();

		contactos = new HashMap<String,Contacto>();
	
	}
	
	
	
	@Override
	public void agregarContacto(Contacto contacto) {
		// TODO Auto-generated method stub
	//	super.agregarContacto(contacto);
		
		
		
		contactos.put(contacto.getCedula(), contacto);
		
		
		
		for (int i=0;i<contactos.size();i++) {
			Contacto c=contactos.get(i);
			
			
			if (contactos.containsKey(contacto.getCedula()) && c!=contacto ) {
			contactos.remove(contacto);
			}
		}
		
		
		
		
		
		
		
		
		
	}

	@Override
	public Contacto buscarContacto(String ced) {
		// TODO Auto-generated method stub
		System.out.println("buscar Contacto");
		for (Contacto c : contactos.values()) {
			if (c.getCedula().equals(ced)) {
				return c;
			}
		}

		return null;
	}

	@Override
	public Contacto eliminarContacto(String ced) {
		// TODO Auto-generated method stub
		System.out.println("Eliminar Contacto");
		for (Contacto c : contactos.values()) {
			if (c.getCedula().equals(ced)) {
				contactos.remove(c);
				return c;
			}
		}
		
		
		
		return null;
	}

	@Override
	public void Imprimir() {
		// TODO Auto-generated method stub
		//super.Imprimir();
		System.out.println("Imprimir");
		for (Contacto i : contactos.values()){
			  System.out.println(i);
			}
	
	}
	

}
