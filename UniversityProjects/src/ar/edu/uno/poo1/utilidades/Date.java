package ar.edu.uno.poo1.utilidades;

public class Date {
	
	private int dia;
	private int mes;
	private int ano;
	
	// constructor sin parámetros
	public Date() {
		this(1, 1, 1970);
	}
	
	// Constructor
	public Date(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	// Sobrecarga de constructor, es decir tengo otro constructor
	public Date(Date otrafecha) {
		this(otrafecha.getDia(), otrafecha.getMes(), otrafecha.getAno());
	}
	
	// otro constructor
	public Date(String stringfecha) {
		// String [] fechasplit = stringfecha.split("-");
		/*
		this.dia = Integer.parseInt(fechasplit[0]);
		this.mes = Integer.parseInt(fechasplit[1]);
		this.ano = Integer.parseInt(fechasplit[2]);
		*/
		this(Integer.parseInt(stringfecha.split("-")[0]), Integer.parseInt(stringfecha.split("-")[1]), Integer.parseInt(stringfecha.split("-")[2]));
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public boolean comparacion(Date d) {
		return this == d;
	}
	

}
