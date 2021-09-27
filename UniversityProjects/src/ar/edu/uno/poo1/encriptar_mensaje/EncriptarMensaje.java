package ar.edu.uno.poo1.encriptar_mensaje;

public class EncriptarMensaje {

	public static void main(String[] args) {
		String mensaje = "HOLA";
		
		System.out.println(encriptarMensaje(mensaje, 2));
	}
	
	public static String encriptarMensaje(String mensaje, int corrimiento) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		abecedario = abecedario.toUpperCase();
		String mensajeEncriptado = "";
		
		for(int i=0; i < mensaje.length(); i++) {
			int indice = abecedario.indexOf(mensaje.charAt(i))+corrimiento;
			mensajeEncriptado += abecedario.charAt(indice);
		}
		
		return mensajeEncriptado;		
		
	}

}