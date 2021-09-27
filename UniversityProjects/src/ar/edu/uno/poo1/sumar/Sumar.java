package ar.edu.uno.poo1.sumar;

public class Sumar {

	public static void main(String[] args) {
		int n1 = 4;
		int n2 = 5;
		int resultado = n1+n2;
		
		// System.out.println(resultado);
		// System.out.println(sumar(2,3));
		consola(resultado);
		consola(sumar(1, 2));
		consola(sumar(n1, n2));
	}
	
	public static int sumar(int n1,int n2) {
		return n1 + n2;
	}
	
	public static void consola(int n) {
		System.out.println(n);
	}

}
