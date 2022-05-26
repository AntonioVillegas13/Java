package com.cmc.arreglos;

import com.cmc.entidades.Contactos;

public class AminContactos {
private Contactos[] contactos;
private int elementosagregados;


public AminContactos(){
	contactos=new Contactos[10];
}



public void agregar(Contactos conta){
	if(elementosagregados<contactos.length){
	contactos[elementosagregados]=conta;
	elementosagregados++;
	}
	
}



}
