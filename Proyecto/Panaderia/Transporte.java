package Proyecto.Panaderia;

public class Transporte {

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


