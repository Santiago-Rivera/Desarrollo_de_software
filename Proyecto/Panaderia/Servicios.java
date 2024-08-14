package Proyecto.Panaderia;

public class Servicios {

    //Atributos

    private int idServicios; 

    private String nombredelservicio;

    private String domicilio;

    private String eventos;

    private String decoraciondelpastel;

    private String pedidosespeciales;

    private String productossaludables;

    //Métodos

    public void agregarNombredelservicio(){
        System.out.println("Agregar el nombre del servicio");
    }

    public void ingresareldomiciliodelpedido(){
        System.out.println("Ingresar el domicilio del pedido");
    } 

    public void agendarelevento(){
        System.out.println("Agendar el evento");
    }

    public void agredaringredientespedidosespeciales(){
        System.out.println("Agregar los ingredientes del pedido especial");
    }

    //Getter y Setter

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public String getNombredelservicio() {
        return nombredelservicio;
    }

    public void setNombredelservicio(String nombredelservicio) {
        this.nombredelservicio = nombredelservicio;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEventos() {
        return eventos;
    }

    public void setEventos(String eventos) {
        this.eventos = eventos;
    }

    public String getDecoraciondelpastel() {
        return decoraciondelpastel;
    }

    public void setDecoraciondelpastel(String decoraciondelpastel) {
        this.decoraciondelpastel = decoraciondelpastel;
    }

    public String getPedidosespeciales() {
        return pedidosespeciales;
    }

    public void setPedidosespeciales(String pedidosespeciales) {
        this.pedidosespeciales = pedidosespeciales;
    }

    public String getProductossaludables() {
        return productossaludables;
    }

    public void setProductossaludables(String productossaludables) {
        this.productossaludables = productossaludables;
    }

    //Constructor

    public Servicios(int idServicios, String nombredelservicio, String domicilio, String eventos, String decoraciondelpastel, String pedidosespeciales, String productossaludables) {
        this.idServicios = idServicios;
        this.nombredelservicio = nombredelservicio;
        this.domicilio = domicilio;
        this.eventos = eventos;
        this.decoraciondelpastel = decoraciondelpastel;
        this.pedidosespeciales = pedidosespeciales;
        this.productossaludables = productossaludables;
    }
}