package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Contacto;

public class DirectorioLista extends Directorio {

	ArrayList<Contacto> contactos;

	public DirectorioLista() {
		// super();

		contactos = new ArrayList<Contacto>();
	
	}

	@Override
	public void agregarContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		// super.agregarContacto(contacto);
		contactos.add(contacto);
		
		
		
		
		
		
		for (int i=0;i<contactos.size();i++) {
			Contacto c=contactos.get(i);
			
			System.out.println("---------");
			System.out.println(c);
			
			if (c.getCedula().equals(contacto.getCedula()) && c!=contacto) {
				System.out.println("******************");
			System.out.println(c);
			contactos.remove(contacto);
			}
		}
	
		
		

		

	}

	@Override
	public Contacto buscarContacto(String ced) {
		// TODO Auto-generated method stub
		// return super.buscarContacto(ced);
		
		System.out.println("buscar Contacto");
		for (Contacto c : contactos) {
			if (c.getCedula().equals(ced)) {
				return c;
			}
		}

		return null;
	}

	@Override
	public Contacto eliminarContacto(String ced) {
		// TODO Auto-generated method stub
		//return super.eliminarContacto(ced);
		System.out.println("Eliminar Contacto");
		for (Contacto c : contactos) {
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
		// super.Imprimir();
		System.out.println("Imprimir");
		for (Contacto c : contactos) {
			System.out.println(c);
		}

	}

}
