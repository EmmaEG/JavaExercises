package ar.edu.uno.poo1.herencia;

public abstract class Vehiculo {
	private Persona chofer;
	private int kilometrosRecorridos;
	
	public Vehiculo(Persona chofer, int kilometrosRecorridos) {
		this.setChofer(chofer);
		this.setKilometrosRecorridos(kilometrosRecorridos);		
	}
	
	public Persona getChofer() {
		return chofer;
	}
	
	public void setChofer(Persona chofer) {
		this.chofer = chofer;
	}
	
	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}
	
	public void setKilometrosRecorridos(int kilometros) {
		this.kilometrosRecorridos = kilometros;
	}
	
}
