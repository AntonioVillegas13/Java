package com.cmc.test;

import com.cmc.estaticos.Util;
public class TestValidad {
	public static void main(String[] args) {
		
		Util util =new Util();

		System.out.println(util.validarRango(0));
		
		System.out.println(Util.validarPositivo(-3));
		System.out.println(Math.random());
		System.out.println(Integer.parseInt("33"));
		
		
		
	}
	
}
