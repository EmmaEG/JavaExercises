package ar.edu.uno.poo1.utilidades;

public class TestCuenta {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Pepe Botella", 111111);
		CuentaBancaria cb = new CuentaBancaria(1234, cliente1, 9999); // como necesito un ciente antes necesito instanciar un client
		System.out.println(cb.saldo);
	}

}
