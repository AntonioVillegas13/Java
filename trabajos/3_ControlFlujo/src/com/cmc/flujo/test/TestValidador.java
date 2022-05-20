package com.cmc.flujo.test;

import com.cmc.flujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		Validador validador = new Validador();
		validador.ValidarEdad(18);
		String msg = validador.ValidarEdadMsg(18);
		System.out.println(msg);
		
		
		
		boolean v=validador.esmAYOR(18);
		System.out.println(v);

	}

}
