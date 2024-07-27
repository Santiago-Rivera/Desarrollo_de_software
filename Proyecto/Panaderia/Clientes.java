package Proyecto.Panaderia;

import java.util.ArrayList;
import java.util.List;

public class Clientes implements Mercaderia {

    //Atributos

    private int idClientes;

    private String nombre;

    private String direccion;

    private String telefono;

    private String correo;

    private int edad; 

    //Métodos

    public void agregarPedido(){
        System.out.println("Se ha agregado el pedido");
    }

    public void elimiarPedido(){
        System.out.println("Se ha elimino el pedido");
    }

    public void actualizarDatos(){
        System.out.println("Actualizar el pedido");
    }

    public void verHistorial(){
        System.out.println("Ver el historial del pedido");
    }

    // Interfaz

    @Override
    public void entregarMercaderia() {
        System.out.println("Entregar mercaderia al cliente");
        
    }

    @Override
    public List<String> hacerInventario() {
        List<String> inventario = new ArrayList<>();
        inventario.add("Producto: Pan enrrollado, Cantidad: 5");
        inventario.add("Producto: Pan salado, Cantidad: 5");
        inventario.add("Productos: Arepas, Cantidad: 6");
        inventario.add("Productos: Arepas de queso, Cantidad: 8");
        inventario.add("productos; Roscas de reyes, Cantidad: 3");
        return inventario;
    }

    @Override
    public List<String> seleccionarRuta() {
        List<String> rutas = new ArrayList<>();
        rutas.add("Sector norte alborada 5ta etapa");
        rutas.add("Sector sur Trinitarias");
        rutas.add("Sector norte Samanes");
        rutas.add("Sector norte sauses");
        return rutas;
    }

    //Getter y Setter

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo; 
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Constructor

    public Clientes(int idClientes, String nombre, String direccion, String telefono, String correo, int edad, int i) {
        this.idClientes = idClientes;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
    }
}