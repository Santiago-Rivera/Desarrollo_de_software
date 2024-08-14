package Practica2;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Banco{
    //Atributos

    private int idCilente;

    private int dni;

    private String nombre;

    private String apellido;

    //Metodos

    public void agregarNombreDelCiente(){
        System.out.println("Agregar el nombre del cliente" + " " + nombre);
    }

    public void eliminarDniDelCliente(){
        System.out.println("Eliminar el dni del cliente" + dni);
    }

    //Interfaz

    
    @Override
    public List<String> numeroDeCuentas() {
        List<String> cuentas = new ArrayList<>();
        cuentas.add("Banco produbanco");
        cuentas.add("Banco pichincha");
        return cuentas;
    }

    //Getter y Setter

    public int getIdCliente() {
        return idCilente;
    }

    public void setIdCliente(int idCilente) {
        this.idCilente = idCilente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido; 
    }

    //Constructor

    public Cliente(int idCilente, int dni, String nombre, String apellido) {
        this.idCilente = idCilente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
