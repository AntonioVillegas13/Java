package com.cmc.flujo;

public class Validador {

	public void ValidarEdad(int edad) {

		if (edad > 18) {
			System.out.println("Mayor de Edad");

		} else if (edad < 18) {
			System.out.println("Es menor de Edad");
		} else {
			System.out.println("TIENE 18");
		}
		

	}
	
	public String ValidarEdadMsg(int edad) {

		if (edad > 18) {
			return "Es MAYOR ";

		}else if(edad <18) {
			return "Es MAYOR ";
		}else{
			return "TIENE 18";
		}
		
				
		
		}
	
	public boolean esmAYOR(int edad ){
		
		
		if (edad >= 18) {
			return true;

		}else{
			return false;
		}
		
		
		
	}

}
