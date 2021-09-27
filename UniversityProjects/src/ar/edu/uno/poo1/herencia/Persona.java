package ar.edu.uno.poo1.herencia;

public class Persona {
	private int DNI;
	private String nombre;
	
	public Persona(int DNI, String nombre) {
		this.setDNI(DNI);
		this.setNombre(nombre);
	}
	
	//Persona por defecto
	public Persona() {
		this(99999999, "NN"); //llamo al constructor y le paso los valores
	}
	
	public int getDNI() {
		return DNI;
	}
	
	public void setDNI(int dni) {
		this.DNI = dni; 
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
