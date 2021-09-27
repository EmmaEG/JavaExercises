package ar.edu.uno.poo1.monedero;

/*
Defina una clase 'Monedero' que permita gestionar la cantidad de dinero de que una persona dispone en un momento dado.
La clase deber� tener un constructor que permitir� crear un monedero con una cantidad de dinero inicial y deber� definir
un m�todo para meter dinero en el monedero, otro para sacarlo y finalmente, otro para consultar el disponible; 
solo podr� conocerse la cantidad de dinero del monedero a trav�s de este �ltimo m�todo. Por supuesto, no se podr� sacar m�s dinero del que
haya en un momento dado en el monedero. Para probar el funcionamiento de la clase, escriba un m�todo 'main' con una serie de instrucciones 
que hagan uso de los m�todos definidos.
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
