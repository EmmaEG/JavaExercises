package ar.edu.uno.poo1.cuentas;

public class Main {

	public static void main(String[] args) {
		Cuenta ca = new CajaDeAhorro("pepe");
		ca.depositar(1000);
		Cuenta cc = new CuentaCorriente("nilda", 2000);
		cc.depositar(500);

		// para poder hacer esta asignaci´on debo declarar las instancias de tipo Cuenta (padre)
		ca = cc; // polimorfismo, CajaDeAhorro se convierte en CuentaCorriente
		
		System.out.println(ca.obtenerTitular());
		System.out.println(ca.consultarSaldo());
		
		ca.extraer(1500);
		
		System.out.println(ca.consultarSaldo());
		
		/*
		 para obtener el descubierto no puedo, porque el tipo Cuenta no tiene obtener descubierto
 			System.out.println(ca.obtenerDescubierto());		 
		 */
		
		/*como yo se que ahora cajaDeAhorro es una cuentaCorriente lo casteo para que me deje usar el metodo
		  aux es de tipo CuentaCorriente
		*/
		CuentaCorriente aux = (CuentaCorriente) ca; // esto se llama conversion hacia abajo
		System.out.println(aux.obtenerDescubierto());
		

	}

}
