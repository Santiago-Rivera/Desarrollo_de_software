package Examen;

import java.util.ArrayList;
import java.util.List;

public class Producto extends Categoria implements Feedback {

    // Atributos

    private int idProducto;

    private String nombre;

    private String descripcion;

    private double precio;

    private int stock;

    private double resena;

    // Métodos

    public String ingresarelnombredelproducto(){
        return nombre;
    }

    public double calcularelpreciodelproducto(){
        return precio;
    }

    //Interfaz 

        @Override
    public List<String> Productos() {
        List<String> productos = new ArrayList<>();
        productos.add("Camisa, tipo: polo");
        productos.add("Pantalon, tipo: cargo");
        productos.add("Zapatos, tipo: mokasines");
        return productos;
    }

    @Override
    public boolean resenaDelProducto() {
        if (resena <= 8) {
            System.out.println("los productos tienen una excelente calidad");
            return true;
        } else {
            System.out.println("Los productos son malos y tienen una pesima calidad");
            return false;
        }
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

    public Producto(int idProducto, String nombre, String descripcion, double precio, int stock, int idCategoria, String nombres) {
        super(idCategoria, nombres);
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
}
