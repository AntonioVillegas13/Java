package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Persona persona = new Persona();
	
	System.out.println("nombre:"+persona.getApellido());
	
		Direccion dir = new Direccion();
		System.out.println("calle principal"+ dir.getCallePrincipal());
		dir.setCallePrincipal("AV mariscal");
		dir.setCalleSecundaria("allamenda");
		dir.setNumero("324223423432");
		persona.setDireccion(dir);
		
		System.out.println(persona.getDireccion().getCallePrincipal());
		
		Direccion dir2= persona.getDireccion();
		if (dir2!=null){
			System.out.println("calle principal:"+ dir2.getCallePrincipal());	
			
		} else{
			System.out.println("Direccion no asignada");
		}
		 
		
	}
	}


