package Universidad.Libros;


public class Libros {

    //Atributos

    private String titulo;

    private String autor;

    private int cantidadDeLibros;

    private int cantidadDeLibrosPrestados;

    //Métodos

    public boolean prestamo(){
        System.out.println("Prestamo de libros");
        if (this.cantidadDeLibrosPrestados < this.cantidadDeLibros) {
            cantidadDeLibrosPrestados ++;
            return true;
        }
        return false;
    }

    public void devolucion(){
        System.out.println("Devolucion del libro");
    }

    // Getter y Setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadDeLibros() {
        return cantidadDeLibros;
    }

    public void setCantidadDeLibros(int cantidadDeLibros) {
        this.cantidadDeLibros = cantidadDeLibros;
    }

    public int getCantidadDeLibrosPrestados() {
        return cantidadDeLibrosPrestados;
    }

    public void setCantidadDeLibrosPrestados(int cantidadDeLibrosPrestados) {
        this.cantidadDeLibrosPrestados = cantidadDeLibrosPrestados;
    }

    // Constructor

    public Libros(String titulo, String autor, int cantidadDeLibros, int cantidadDeLibrosPrestados){

        this.titulo = titulo;

        this.autor = autor;

        this.cantidadDeLibros = cantidadDeLibros;

        this.cantidadDeLibrosPrestados = cantidadDeLibrosPrestados;
    }
}

