package proyecto1;

import proyecto1.figuras.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Rectangulo rectangulo = new Rectangulo ();


	int rec1=rectangulo.perimetro();
	System.out.println("perimetro ="+rec1);
	rectangulo.altura=3;
			rectangulo.base=12;

			int rec2=rectangulo.perimetro();
			System.out.println("perimetro ="+rec2);

	
	}

}
