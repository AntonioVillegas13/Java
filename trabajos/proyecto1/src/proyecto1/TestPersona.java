package proyecto1;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1;
		p1= new Persona();
		Persona p2= new Persona("marco");
		System.out.println("nombre "+p2.getNombre());
		System.out.println("--------------------------------------");
		System.out.println("nombre "+p1.getNombre());
		System.out.println("edad:"+p1.getEdad());
		System.out.println("estatura:"+p1.getEstatura());
		
		p1.setEdad(12);
		p1.setEstatura(12.3);
		
		p1.setNombre("Jose");

		System.out.println("nombre "+p1.getNombre());
		System.out.println("edad:"+p1.getEdad());
		System.out.println("estatura:"+p1.getEstatura());
		
		System.out.println("--------------------------------------");
		
		Calculadora calculadora =new Calculadora();
		calculadora.imprimir();
		double numero = calculadora.restar(3.4,4);
		System.out.println(numero);
		
		
	}

}
