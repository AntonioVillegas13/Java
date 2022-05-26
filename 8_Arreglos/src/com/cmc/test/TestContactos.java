
package com.cmc.test;

import com.cmc.entidades.Contactos;

public class TestContactos {
public static void main(String[] args) {
	Contactos []contactos= new Contactos[5];
	
	contactos[0]=new Contactos("123","Jerom");
	contactos[1]=new Contactos("456","Jake");
	
	for(int i=0;i<contactos.length;i++){
		System.out.println(contactos[i]);
	}
	
	
	
}
}
