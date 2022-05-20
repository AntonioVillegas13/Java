package cuentas;

public class Cuenta {

	private String Id;
	private String Tipo="A";
	private int Saldo;
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public int getSaldo() {
		return Saldo;
	}
	public void setSaldo(int saldo) {
		Saldo = saldo;
	}
	public String getId() {
		return Id;
	}
	public Cuenta(String id) {
		//super();
		Id = id;
	}
	
	
	
	public Cuenta(String id, String tipo, int saldo) {
		//super();
		Id = id;
		Tipo = tipo;
		Saldo = saldo;
	}
	
	public void mostrarCuenta (Cuenta C){
		System.out.println("*********************");
		System.out.println("CUENTA");
		System.out.println("Numero de Cuenta:"+C.Id);
		System.out.println("Tipo:"+C.Tipo);
		System.out.println("Saldo:"+C.Saldo);
		System.out.println("*********************");
		
	}
	

	public void mostrarCuentaMiEstilo (){
		System.out.println("*********************");
		System.out.println("CUENTA");
		System.out.println("Numero de Cuenta:"+Id);
		System.out.println("Tipo:"+Tipo);
		System.out.println("Saldo:"+Saldo);
		System.out.println("*********************");
		
	}
	
	
}
	
	
	


