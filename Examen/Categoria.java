package Examen;

public class Categoria {

    // Atributos

    private int idCategoria;

    private String nombre;

    // Métodos

    public String ingresarelnombredelacategoria(){
        return nombre;
    }

    // Getter y Setter

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Constructor

    public Categoria(int idCategoria, String nombre) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
    }

}

