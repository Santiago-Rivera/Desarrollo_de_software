package Practica;

public class Productos {

    // Atributos

        private int idProductos;

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

    //Getter y Setter

    public int getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
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

    public double getResena() {
        return resena;
    }

    public void setResena(double resena) {
        this.resena = resena;
    }

    //Constructor

    public Productos(int idProductos, String nombre, String descripcion, double precio, int stock, double resena) {
        this.idProductos = idProductos;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.resena = resena;
    }
}
