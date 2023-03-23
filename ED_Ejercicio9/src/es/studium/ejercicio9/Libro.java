package es.studium.ejercicio9;

public class Libro
{
	private String titulo;
	private Autor autor; //aquí el tipo de dato te lo da la clase que hemos creado anteriormente, es similar a la FK en BBDD ya que guarda todo lo que hay dentro de esa clase ya realizada
	private int anioPublicacion;
	private String editorial;
	private int numPaginas;
	
	public Libro()
	{
		titulo = "";
		autor = new Autor(); //hacemos una llamada al constructor vacío de la clase para inicializarlo
		anioPublicacion = 0;
		editorial = "";
		numPaginas = 0;
	}

	public Libro(String titulo, Autor autor, int anioPublicacion, String editorial, int numPaginas)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.editorial = editorial;
		this.numPaginas = numPaginas;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public Autor getAutor()
	{
		return autor;
	}

	public void setAutor(Autor autor)
	{
		this.autor = autor;
	}

	public int getAnioPublicacion()
	{
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion)
	{
		this.anioPublicacion = anioPublicacion;
	}

	public String getEditorial()
	{
		return editorial;
	}

	public void setEditorial(String editorial)
	{
		this.editorial = editorial;
	}

	public int getNumPaginas()
	{
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas)
	{
		this.numPaginas = numPaginas;
	}
	
	
}
