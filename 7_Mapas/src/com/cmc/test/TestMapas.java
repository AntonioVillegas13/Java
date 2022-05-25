package com.cmc.test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList< String> listas=new ArrayList<String>();
		HashMap<String,String> mapas = new HashMap<String,String>();	
		
		mapas.put("a", "MARIO");
		mapas.put("b", "Beto");
		mapas.put("c", "MArcIO");
		
		System.out.println(mapas.get("a"));
	}

}
