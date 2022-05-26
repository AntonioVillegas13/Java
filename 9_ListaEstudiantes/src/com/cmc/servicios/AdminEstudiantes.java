package com.cmc.servicios;

import java.util.ArrayList;

import com.cmc.entidades.Estudiante;

public class AdminEstudiantes {
	private ArrayList <Estudiante> estudiantes;
	
	
	
	
	
	
	
	
	
	public AdminEstudiantes() {
		super();
		
	estudiantes = new ArrayList<Estudiante>();	
	}
	
	
	public void agregar(Estudiante estudiante){
		estudiantes.add(estudiante);
	}
	public Estudiante buscar(String cedula){
		
		/* Estudiante est=null;
		for(int i=0;i<estudiantes.size();i++){
			est=estudiantes.get(i);
			if(cedula.equals(est.getCedula())){
				return est;
			}
			
		}*/
		
		
		for(Estudiante est2:estudiantes){
			
			if(cedula.equals(est2.getCedula())){
				return est2;
			}}
		return null;
	
		
	}
	public ArrayList<Estudiante> buscarMenor(int edad){
		ArrayList<Estudiante>menores=new ArrayList<Estudiante>();
		for( Estudiante estu:estudiantes ){
			if(estu.getEdad()<edad){
				menores.add(estu);
			}
		}
		
		for (Estudiante est:menores){
			System.out.println(est);
		}
		
		
		return estudiantes;
		
		
		
	}

}
