package ar.edu.uno.poo1.fizzbuzz;

public class FizzBuzzMejorado {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if(esDivisiblePorTres(i) && esDivisiblePorCinco(i)) {
				mostrarEnConsola("FizzBuzz");
			}else if(esDivisiblePorTres(i)) {
				mostrarEnConsola("Fizz");
			}else if(esDivisiblePorCinco(i)) {
				mostrarEnConsola("Buzz");
			} else {
				mostrarEnConsola(String.valueOf(i));
			}
		}

	}
	
	public static boolean esDivisiblePorTres(int numero) {
		return esDivisible(numero, 3);
	}
	
	public static boolean esDivisiblePorCinco(int numero) {
		return esDivisible(numero, 5);
	}
	
	public static boolean esDivisible(int numero, int divisor) {
		return numero % divisor == 0;
	}
	
	public static void mostrarEnConsola(String mensaje) {
		System.out.println(mensaje);
	}

}
