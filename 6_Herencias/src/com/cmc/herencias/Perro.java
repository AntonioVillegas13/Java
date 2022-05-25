package com.cmc.herencias;

public class Perro extends Animal {
	public void Ladrar(){
		System.out.println("PERRO LADRANDO");
		
	
	}
	public void dormir() {
		super.dormir();
		System.out.println("PERRO durmiendo");
	}
	
	
	
	
}
