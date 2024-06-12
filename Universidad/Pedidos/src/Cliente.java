package Universidad.Pedidos.src;

//import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    //Atributos

    private int idCliente;

    private String nombre;

    private String direccion;

    private String telefono;

    private String correo;

    private int edad;

    //private List<Pedidos> pedidos;

    private List<Integer> numeros;

    public void ListarNumeros(){

        this.numeros = new ArrayList<>();

        numeros.add(1);

        numeros.add(3);

        numeros.add(2);

        System.out.println(this.numeros);
    }

    //Métodos

    public void agregarPedido(){
        System.out.println("Agregar el pedido");
    }

    public void eliminarPedido(){
        System.out.println("Eliminar el pedido");
    }

    public void actualizarDatos(){
        System.out.println("Actualizar los datos");
    }

    public void verHistorial(){
        System.out.println("Ver el historial del pedido");
    }

    // Getter and Setter

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public Cliente(int idCliente, String nombre, String direccion, String telefono, String correo, int edad) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
    }

}

