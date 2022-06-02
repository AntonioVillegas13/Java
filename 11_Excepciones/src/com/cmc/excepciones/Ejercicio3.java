package com.cmc.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio3 {

 
	public void metodo1(){
		try{
			File file =new File("archivo.txt");
			file.createNewFile();
		}catch(Exception e){
			
		}

	}
	//propaga excepciones 
public void metodo2() throws IOException{
	
		File file =new File("archivo.txt");
		file.createNewFile();

		
		
	}
	


}
