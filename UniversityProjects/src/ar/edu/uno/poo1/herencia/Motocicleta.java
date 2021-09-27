package ar.edu.uno.poo1.herencia;

public class Motocicleta extends Vehiculo {
	private Persona acompanante;
	
	// con uso de super podemos inicializar los atribuitos del Vehivulo
	public Motocicleta(Persona chofer, int kilometrosRecorridos, Persona acompanante) { 
		super(chofer, kilometrosRecorridos);
		this.setAcompanante(acompanante);
	}
	
	// hago la sobrecarga de constructores para poder instanciar por ejemplo una moto pero sin acompañante por ejemplo
	public Motocicleta(Persona chofer, int kilometrosRecorridos) {
		this(chofer, kilometrosRecorridos, null); 
	}
	
	public Persona getAcompanante() {
		return acompanante;
	}
	
	public void setAcompanante (Persona acompanante) {
		this.acompanante = acompanante;
	}
	
	// asignar chofer
	public void setChofer(Persona chofer) { // es void porque no me devuelve nada, es para asignar un valor a un atributo solamente
		if (getAcompanante() == null)
			super.setChofer(chofer);
	}
	
	// agregar acompañante
	public void addAcompanante(Persona acompanante) {
		if (getAcompanante() == null)
			setAcompanante(acompanante);
	}
	
}
