package ar.edu.uno.poo1.utilidades;

class CuentaBancaria {
	
	long numero;
	Cliente titular;
	long saldo;
	Color colorDeLaCuenta;
	
	CuentaBancaria(long num, Cliente clt, long s) {
		numero = num;
		titular = clt;
		saldo = s;
		// no lo pasamos por parámteros porque lo definimos por default porque cuando creamos una cuenta siempre va a estar 
		// en verde
		colorDeLaCuenta = new Color("verde"); 
	}
}
