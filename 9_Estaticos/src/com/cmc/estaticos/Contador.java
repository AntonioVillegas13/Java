package com.cmc.estaticos;

public class Contador {

	
	private int contadorNormal;
	private static int contadorEstatico;
	private String nombre;
	
	public Contador (String nombre){
		this.nombre=nombre;
	}
	
	
	
	public void incrementar(){
		contadorNormal++;
		contadorEstatico++;
	}
	
	
	public void imprimir(){
		System.out.println(nombre+"Contador Normal:"+contadorNormal);
		System.out.println(nombre+"Contador Estatico:"+contadorEstatico);
		
		
	}
	
}
