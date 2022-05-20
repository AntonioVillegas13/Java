package com.cmc.colecciones;

import java.util.ArrayList;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> lista =new ArrayList <String>();
		lista.add("a");
		lista.add("b");
		lista.add("c");
		lista.add("d");
		lista.add("e");
		
		//Devuelve el elemento en la posicion que le pasemos 
		System.out.println((lista.get(1)));
		//devuelve el tamaño del arreglo
		System.out.println("tamaño:"+lista.size());
	}

}
