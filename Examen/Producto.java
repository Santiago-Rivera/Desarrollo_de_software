package Examen;

public class Producto {

    // Atributos

    private int idProducto;

    private String nombre;

    private String descripcion;

    private double precio;

    private int stock;

    // Métodos

    public String ingresarelnombredelproducto(){
        return nombre;
    }

    public double calcularelpreciodelproducto(){
        return precio;
    }

    // Getter y Setter

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Constructor

    public Producto(int idProducto, String nombre, String descripcion, double precio, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
}
