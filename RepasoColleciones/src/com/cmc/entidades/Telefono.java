package com.cmc.entidades;

public class Telefono {
	
	String Operadora;
	String Numero;
	public Telefono(String operadora, String numero) {
		super();
		Operadora = operadora;
		Numero = numero;
	}
	public String getOperadora() {
		return Operadora;
	}
	public void setOperadora(String operadora) {
		Operadora = operadora;
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}
	@Override
	public String toString() {
		return "Telefono [Operadora=" + Operadora + ", Numero=" + Numero + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
