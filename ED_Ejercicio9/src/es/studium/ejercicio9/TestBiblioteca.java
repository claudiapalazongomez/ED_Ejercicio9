package es.studium.ejercicio9;

public class TestBiblioteca
{

	public static void main(String[] args)
	{
		Autor autor1 = new Autor("Nombre Autor 1", "Apellidos Autor 1", "Nacionalidad Autor 1"); //para crear un objeto libro debemos crear primero un objeto autor para pasarle luego ese mismo objeto y coja esos valores
		Libro libro1 = new Libro("Título 1", autor1, 1999, "Editorial 1", 520);
		System.out.println(libro1.getTitulo() + " " + libro1.getAutor().getNombre() + " " + libro1.getAutor().getApellidos()); //si ponemos SOLO libro1.getAutor() te imprime el objeto entero (es.studium.biblioteca...)
		
		Autor autor2 = new Autor(); //igual que antes, primero creamos el objeto Autor antes que el Libro
		autor2.setNombre("Nombre Autor 2");
		autor2.setApellidos("Apellidos Autor 2");
		autor2.setNacionalidad("Nacionalidad Autor 2");
		Libro libro2 = new Libro();
		libro2.setTitulo("Título 2");
		libro2.setAutor(autor2);
		libro2.setAnioPublicacion(2010);
		libro2.setEditorial("Editorial 2");
		libro2.setNumPaginas(280);
		System.out.println(libro2.getTitulo() + " " + libro2.getAutor().getNombre() + " " + libro2.getAutor().getApellidos());
	}

}
