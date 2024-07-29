package Proyecto.Panaderia;

public class Panaderia {
    //Atributos
    
    private int idPanaderia; 

    private String nombre;

    private String direccion;

    private String paginaweb;
    
    private String telefono;

    private String sucursales;

    private String redessociales; 

    //Métodos

    public void solicitarDirección(){
        System.out.println("Solicitar la direccion de la panaderia" + this.direccion);
    }

    public void agregarPaginaweb(){
        System.out.println("Agregar la pagina web de la panaderia" + this.paginaweb);
    }

    public void agregarNombre(){
        System.out.println("Agregar el nombre de la panaderia" + " " + this.nombre);
    }

    public void agregarTelefono(){
        System.out.println("Agregar telefono" + " " + this.telefono);
    }

    //Getter y setter

    public int getidPedidos(){
        return idPanaderia; 
    }

    public void setidPedidos(int idPanaderia){
        this.idPanaderia = idPanaderia;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDirección(String dirección){
        return dirección;
    }

    public void setPaginaweb(String paginaweb){
        this.paginaweb = paginaweb;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getSucursales() {
        return sucursales;
    }

    public void setSucursales(String sucursales) {
        this.sucursales = sucursales;
    }

    public String getRedessociales() {
        return redessociales;
    }

    public void setRedessociales(String redessociales) {
        this.redessociales = redessociales;
    }

    //Constructor

    public Panaderia(int idPanaderia, String nombre, String direccion, String paginaweb, String telefono, String sucursales, String redessociales) {
        this.idPanaderia = idPanaderia;
        this.nombre = nombre;
        this.direccion = direccion;
        this.paginaweb = paginaweb;
        this.telefono = telefono;
        this.sucursales = sucursales;
        this.redessociales = redessociales;
    }
}