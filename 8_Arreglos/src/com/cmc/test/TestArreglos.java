package com.cmc.test;

import com.cmc.arreglos.AminContactos;
import com.cmc.entidades.Contactos;

public class TestArreglos {
	public static void main(String[] args) {
		int [] enteros= new int[ 3];
		
		enteros[0]=10;
		enteros[1]=20;
		enteros[2]=20;
		
		int res=enteros[1];
		System.out.println(res);
		
		

		AminContactos admin= new AminContactos(); 
		
		admin.agregar(new Contactos("12123","juan"));
		System.out.println(admin);
	}

	
	
}
