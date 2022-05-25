package com.cmc.mapas;

import java.util.HashMap;

import com.cmc.entidades.Clientes;

public class AdminClientes {
private HashMap <String,Clientes> clientes;

public AdminClientes(){
	clientes= new HashMap<String,Clientes>();
}


public void agregarCliente(Clientes cliente){
	if(!clientes.containsKey(cliente.getCedula())){
	clientes.put(cliente.getCedula(), cliente);
	}
}

public Clientes recuperar(String cedula){
	return clientes.get(cedula);
	
}
}

