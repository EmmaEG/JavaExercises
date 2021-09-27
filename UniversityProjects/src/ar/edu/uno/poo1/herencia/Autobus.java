package ar.edu.uno.poo1.herencia;

public class Autobus extends Vehiculo {
	private Persona [] pasajeros;
	public static final int CANTIDAD_MAXIMA_PASAJERO = 30;
	private int cantidadActualDePasajeros;
	
	
	public Autobus(Persona chofer, int kilometrosRecorridos, Persona[] pasajeros, int cantidadActualDePasajeros) {
		super(chofer, kilometrosRecorridos);
		this.setPasajeros(pasajeros);
		this.setCantidadActualDePasajeros(0);
	}


	public Persona[] getPasajeros() {
		return pasajeros;
	}


	public void setPasajeros(Persona[] pasajeros) {
		this.pasajeros = pasajeros;
	}


	public int getCantidadActualDePasajeros() {
		return cantidadActualDePasajeros;
	}


	public void setCantidadActualDePasajeros(int cantidadActualDePasajeros) {
		this.cantidadActualDePasajeros = cantidadActualDePasajeros;
	}
	
	public void setChofer(Persona chofer) {
		if (getPasajeros() == null)
			super.setChofer(chofer);
	}
	
	// Agregar pasajero
	public void addPasajero(Persona[] pasajero) {
			for(int i=0; i < CANTIDAD_MAXIMA_PASAJERO; i++) {
				
			}
			//			setPasajeros(pasajero);
			
	}
	
	// Quitar pasajero
	
	// Setear el chofer
	
}
