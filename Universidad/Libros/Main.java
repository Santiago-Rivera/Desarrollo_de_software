package Universidad.Libros;

public class Main {
    public static void main(String[] args) {
        Libros libros = new Libros("El codigo da Vinci", "Dan Brown", 4, 2);

        libros.getAutor();

        libros.devolucion();

        libros.getCantidadDeLibros();

        libros.getCantidadDeLibrosPrestados();
    }
}

