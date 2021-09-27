package ar.edu.uno.poo1.fecha;

/* Static lo usamos para poder hacer uso de un método, por ejemplo separarFecha sin instanciar la case. de otro modo no lo
 * podríamos usar (por ahora) */

public class Fecha {

	public static void main(String[] args) {
		//separarFecha("20210817");
		separarFecha("2021 08 17");
	}
	
	public static void separarFecha(String fecha) {
		//System.out.println("El año es: " + fecha.substring(0, 4));
		//System.out.println("El mes es: " +fecha.substring(4, 6));
		//System.out.println("El día es: " +fecha.substring(6, 8));
		String fechaVector[];
		fechaVector = fecha.split(" ");
		for (int i=0; i < fechaVector.length; i++) {
			System.out.println(fechaVector[i]);
		}
	}

}
