package ar.edu.uno.poo1.monedero;

/*
Defina una clase 'Monedero' que permita gestionar la cantidad de dinero de que una persona dispone en un momento dado.
La clase deberá tener un constructor que permitirá crear un monedero con una cantidad de dinero inicial y deberá definir
un método para meter dinero en el monedero, otro para sacarlo y finalmente, otro para consultar el disponible; 
solo podrá conocerse la cantidad de dinero del monedero a través de este último método. Por supuesto, no se podrá sacar más dinero del que
haya en un momento dado en el monedero. Para probar el funcionamiento de la clase, escriba un método 'main' con una serie de instrucciones 
que hagan uso de los métodos definidos.
*/

public class Monedero {
	 private double dinero;
	 
	 public Monedero (double dinero) {
		 this.dinero = dinero;
	 }

	 public double consultarSaldo() {
		 return this.dinero;
	 }
	 
	public void meterDinero(double dinero) {
		this.dinero += dinero;
	 }
	
	public void sacarDinero(double dinero) {
		if (dinero <= this.dinero )
			this.dinero -= dinero;
		else
			System.out.println("No tiene saldo suficiente");
	}
	
}
