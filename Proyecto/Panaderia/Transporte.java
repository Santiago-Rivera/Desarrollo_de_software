package Proyecto.Panaderia;

import java.util.ArrayList;
import java.util.List;

public class Transporte implements Mercaderia {

    //Atributos

    private int idTransporte; 

    private String ruta;

    private int numerodelaunidad;

    private String nombredelconductor;

    private String apellidodelconductor;

    private String telefonodelconductor;

    private String correoelectronicodelconductor;

    //Métodos

    public void agendarlaruta(){
        System.out.println("Agendar la ruta del pedido");
    }

    public void ingresarelnombredelconductor(){
        System.out.println("Ingresar el nombre del conductor");
    }

    public void agregarNumerodelaunidad(){
        System.out.println("Agregar el numero de la unidad");
    }

    // Interfaz

    
    @Override
    public void entregarMercaderia() {
        System.out.println("Entregar la mercaderia al conductor");
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

    public int getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getNumerodelaunidad() {
        return numerodelaunidad;
    }

    public void setNumerodelaunidad(int numerodelaunidad) {
        this.numerodelaunidad = numerodelaunidad;
    }

    public String getNombredelconductor() {
        return nombredelconductor;
    }

    public void setNombredelconductor(String nombredelconductor) {
        this.nombredelconductor = nombredelconductor;
    }

    public String getApellidodelconductor() {
        return apellidodelconductor;
    }

    public void setApellidodelconductor(String apellidodelconductor) {
        this.apellidodelconductor = apellidodelconductor;
    }

    public String getTelefonodelconductor() {
        return telefonodelconductor;
    }

    public void setTelefonodelconductor(String telefonodelconductor) {
        this.telefonodelconductor = telefonodelconductor;
    }

    public String getCorreoelectronicodelconductor() {
        return correoelectronicodelconductor;
    }

    public void setCorreoelectronicodelconductor(String correoelectronicodelconductor) {
        this.correoelectronicodelconductor = correoelectronicodelconductor;
    }

    //Constructor

    public Transporte(int idTransporte, String ruta, int numerodelaunidad, String nombredelconductor, String apellidodelconductor, String telefonodelconductor, String correoelectronicodelconductor) {
        this.idTransporte = idTransporte;
        this.ruta = ruta;
        this.numerodelaunidad = numerodelaunidad;
        this.nombredelconductor = nombredelconductor;
        this.apellidodelconductor = apellidodelconductor;
        this.telefonodelconductor = telefonodelconductor;
        this.correoelectronicodelconductor = correoelectronicodelconductor;
    }
}