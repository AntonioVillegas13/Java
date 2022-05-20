package test;

import cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------Valores Originales--------------------");
		Cuenta cuenta1= new Cuenta("03476");
		cuenta1.setSaldo(675);
		
		
		
		Cuenta cuenta2= new Cuenta("03476","C",98);
		
	
		
		
		
		
		Cuenta cuenta3= new Cuenta("03476");
		cuenta3.setTipo("C");
	
		System.out.println("CUENTA 2:"+cuenta3.getId()+cuenta3.getSaldo()+cuenta3.getTipo());
		
		cuenta1.mostrarCuentaMiEstilo();
		
		cuenta2.mostrarCuentaMiEstilo();
		cuenta3.mostrarCuentaMiEstilo();
		
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		System.out.println("------------------Valores Modificados--------------------");
		cuenta1.mostrarCuenta(cuenta1);
		cuenta2.mostrarCuenta(cuenta2);
		cuenta3.mostrarCuenta(cuenta3);
		
		System.out.println("------------------Valores Nuevos--------------------");
		Cuenta cuenta4= new Cuenta("0987","A",10);
		Cuenta cuenta5= new Cuenta("0557","C",10);
		Cuenta cuenta6= new Cuenta("0666","A",0);
		cuenta4.mostrarCuentaMiEstilo();
		cuenta5.mostrarCuentaMiEstilo();
		cuenta6.mostrarCuentaMiEstilo();
		
	}
    

	
	
	
	
	
	
	
}
