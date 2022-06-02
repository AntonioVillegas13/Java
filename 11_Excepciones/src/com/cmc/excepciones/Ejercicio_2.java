package com.cmc.excepciones;

import java.io.File;
//Checked exception-> ni bien se escribe a da problemas 
//unChecked exception-> no exigue nada hasta que se corra.
public class Ejercicio_2 {

	public static void main(String[] args) {
		File file =new File("archivo.txt");
		file.createNewFile();

	}

}
