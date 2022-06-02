package com.cmc.excepciones;

public class Ejercicio1 {
	
public static void main(String[] args) {
	
	System.out.println("Inicio");
	
	try{
	String a=null;

	a.substring(1,3);
	}catch(Exception e){
		System.out.println("entro al catch");
		
	}finally{
		System.out.println("entro al finally");
	}

	
	System.out.println("fin");
}

}
