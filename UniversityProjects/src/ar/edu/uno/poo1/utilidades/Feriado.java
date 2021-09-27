package ar.edu.uno.poo1.utilidades;

// clase sin constructor, actúa el constructor por defecto o contructor de oficio

public class Feriado {

	private int numero;
	private boolean feriado;
	private Date objeto;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isFeriado() {
		return feriado;
	}
	public void setFeriado(boolean feriado) {
		this.feriado = feriado;
	}
	public Date getObjeto() {
		return objeto;
	}
	public void setObjeto(Date objeto) {
		this.objeto = objeto;
	}
	
}
