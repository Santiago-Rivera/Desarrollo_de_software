package Practica;

import java.util.ArrayList;

import java.util.List;

public class Inventario extends Productos implements Mercancia {

    //Atributos

    private int idInventario;

    private String nombreDelProducto;

    private int cantidadDelProducto;

    //Metodos

    public void revisionDeProductos() {
        System.out.println("Hacer el inventario");
    }

    //Interfaz 

    @Override
    public List<String> hacerInventario() {
        List<String> inventario = new ArrayList<>();
        inventario.add("Salsa de tomate, Cantidad: 20");
        inventario.add("Cebolla, Cantidad: 30");
        inventario.add("Pimientos, Cantidad: 10");
        inventario.add("Cilantro, Cantidad: 5");
        inventario.add("Carne, Cantidad: 50");
        inventario.add("Mariscos, Cantidad: 10");
        return inventario;
    }

    @Override
    public List<String> productos() {
        List<String> productos = new ArrayList<>();
        productos.add("Arroz");
        productos.add("Azucar");
        productos.add("Sal");
        productos.add("Especias");
        productos.add("Gaseosas");
        productos.add("Dulces");
        return productos;
    }

    @Override
    public void venderProductos() {
        System.out.println("Los productos se estan vendiendo");
    }

    //Getter y Setter

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getNombreDelProducto() {
        return nombreDelProducto;
    }

    public void setNombreDelProducto(String nombreDelProducto) {
        this.nombreDelProducto = nombreDelProducto;
    }

    public int getCantidadDelProducto() {
        return cantidadDelProducto;
    }

    public void setCantidadDelProducto(int cantidadDelProducto) {
        this.cantidadDelProducto = cantidadDelProducto;
    }

    //Constructor 

    public Inventario (int idInventario, String nombreDelProducto, int cantidadDelProducto, int idProductos, String nombre, String descripcion, double precio, int stock, int resena) {
        super(idProductos, nombre, descripcion, precio, stock, resena);
        this.idInventario = idInventario;
        this.nombreDelProducto = nombreDelProducto;
        this.cantidadDelProducto = cantidadDelProducto;
    }
}
