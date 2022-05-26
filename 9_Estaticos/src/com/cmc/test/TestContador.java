package com.cmc.test;

import com.cmc.estaticos.Contador;

public class TestContador {

	public static void main(String[] args) {
		
		Contador obj1= new Contador("objeto1");
		obj1.incrementar();
		obj1.imprimir();
		
		Contador obj2= new Contador("objeto2");
		
		obj2.incrementar();
		obj2.imprimir();
		
	}

}
