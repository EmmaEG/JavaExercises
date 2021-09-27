package ar.edu.uno.poo1.utilidades;

public class Test {

	public static void main(String[] args) {
		Date midate = new Date(31, 8, 2021);
		Date midatestr = new Date("31-08-2021");
		System.out.println(midate.getDia());
		System.out.println(midate.getMes());
		System.out.println(midate.getAno());
		System.out.println("-----------");
		System.out.println(midatestr.getDia());
		System.out.println(midatestr.getMes());
		System.out.println(midatestr.getAno());
		
		Date midatecopia = new Date(midate);
		
		System.out.println("-------------");
		// this, ac� abajo es midatecopia, que es el objeti llamador, ¿quien llama al metodo comparacion?... y midatecopia.
		System.out.println(midatecopia.comparacion(midate)); // false => compara dirección de memoria
		System.out.println(midatecopia.comparacion(midatecopia)); // true
		
		Date pepe = midatecopia;
		System.out.println(pepe.comparacion(midatecopia)); // true
		
		System.out.println("---------");
		
		// el constructor sin parámetros
		Date dateSinParametros = new Date();
		System.out.println(dateSinParametros.getAno());
		
		
		System.out.println("-----Sin constructor se inician los atributos en 0 para números, null para obj o false para boolean----");
		Feriado feriado = new Feriado();
		System.out.println(feriado.getNumero());
		System.out.println(feriado.getObjeto());
		System.out.println(feriado.isFeriado());
		

	}

}
