package ar.edu.uno.poo1.videoClub;

//Sus atributos son titulo, año, entregado, genero y director.
//Por defecto, el genero es “no definido” y entregado false. El
//resto de atributos serán valores por defecto según el tipo del
//atributo

public class Pelicula {

	// -------------- ATRIBUTOS -------------
	private String titulo;
	private int anio;
	private boolean entregado = false;
	private Genero genero; // genero era String pero lo hacemos enum para practicar
	private String director;

	// -------------- CONSTRUCTORES -------------
	// siempre empezamos por el constructor más completo que nos pide el ejercicio,
	// para despues poder invocarlo en los otros
	// Un constructor con todos los atributos, excepto de
	// entregado.
	public Pelicula(String titulo, int anio, Genero genero, String director) {
		super();
		// diga super o no lo diga, la primer linea de un constructor es una llamada al
		// constructor de la superclase
		setTitulo(titulo);
		setAnio(anio);
		setGenero(genero);
		setDirector(director);
	}

	// Un constructor con el titulo y director. El resto por
	// defecto
	public Pelicula(String titulo, String director) { // usamos el constructor anterior
		this(titulo, 0, Genero.NO_DEFINIDO, director); // el 0 es el anio del constructor que estoy invocando
	}

	// otro constructor más que solo le paso titulo (este llama al de arriba,
	// entonces director lo pongo vacío)
	public Pelicula(String titulo) {
		this(titulo, "");
	}

	// constructor por defecto (este llama al de arriba, entonces titulo lo pongo
	// vacío)
	public Pelicula() {
		this("");
	}

	// --------------- GETTERS -------------------
	// protected permite el acceso desde subclases y miembros del mismo paquete.
	protected String getTitulo() {
		return this.titulo;
	}

	protected int getAnio() {
		return this.anio;
	}

	protected Genero getGenero() {
		return this.genero;
	}

	protected String getDirector() {
		return this.director;
	}

	// ------------- SETTERS -----------------
	// protected permite el acceso desde subclases y miembros del mismo paquete.
	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	protected void setAnio(int anio) {
		this.anio = anio;
	}

	protected void setGenero(Genero genero) {
		this.genero = genero;
	}

	protected void setDirector(String director) {
		this.director = director;
	}

	
	// ---------- GENERAR TOSTRING ----------
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", anio=" + anio + ", entregado=" + entregado + ", genero=" + genero
				+ ", director=" + director + "]";
	}
	

}
