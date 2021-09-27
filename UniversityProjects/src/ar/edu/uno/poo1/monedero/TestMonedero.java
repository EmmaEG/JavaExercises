package ar.edu.uno.poo1.monedero;

public class TestMonedero {

	public static void main(String[] args) {
		Monedero wallet = new Monedero(500);
		System.out.println(wallet.consultarSaldo());
		wallet.meterDinero(500);
		System.out.println(wallet.consultarSaldo());
		wallet.sacarDinero(1100);
		System.out.println(wallet.consultarSaldo());		
	}

}
