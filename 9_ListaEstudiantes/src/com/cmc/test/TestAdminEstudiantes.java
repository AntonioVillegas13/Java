package com.cmc.test;

import com.cmc.entidades.Estudiante;
import com.cmc.servicios.AdminEstudiantes;

public class TestAdminEstudiantes {

	
	public static void main(String[] args) {
		AdminEstudiantes admin= new AdminEstudiantes();
		admin.agregar(new Estudiante("1212", "lose", 3));
		admin.agregar(new Estudiante("121122", "marco", 12));
		admin.agregar(new Estudiante("1214342", "marcorossi", 30));
		admin.buscarMenor(444);
	}
	
}
