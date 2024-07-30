package Examen;

import java.util.ArrayList;

import java.util.List;

public class Usuario implements Feedback{

    // Atributos

    private int idUsuario;

    private String nombre;

    private String correoElectronico;

    private String contraseña;

    private String direccion;

    private double resena;
    // Métodos

    public String agregarElcorreoElectronico(){
        return correoElectronico;
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

    // Getter and Setter

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Constructor

    public Usuario(int idUsuario, String nombre, String correoElectronico, String contraseña, String direccion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.direccion = direccion;
    }
}
