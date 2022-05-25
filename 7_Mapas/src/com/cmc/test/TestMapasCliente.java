package com.cmc.test;

import java.util.HashMap;

import com.cmc.entidades.Clientes;

public class TestMapasCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Clientes> mapa = new HashMap<String, Clientes>();
		mapa.put("122342", new Clientes("122342","Ramiro"));
		mapa.put("12345", new Clientes("12345","Jose"));
		
		
		
		
		System.out.println(mapa.get("12345"));
	}

}
