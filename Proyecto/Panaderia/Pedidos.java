package Proyecto.Panaderia;

import java.util.Date;

public class Pedidos extends Panaderia {

    //Atributos

    private int idPedidos;

    private Date fecha;

    private double total;

    private String estado;

    private String registro;

    private String productovendido;

    private String pedidosentregados;

    private int ordendelpedido; 

    //Métodos

    public void Solicitar(){
        this.estado = "Solicitado";

        System.out.println("El pedido a sido solicitado");
    }

    public Date cancelarPedido(){

        return this.fecha;

    }

    public double calcularTotal(){
        System.out.println("Calcular el total de los pedidos" + " " + total); 

        return this.total;
    }

    public void cambiarEstado(){
        this.estado = "Procesado";

        System.out.println("Cambiar el estado del pedido" + " " + estado);
    }

    //Geter y Setter

    public int getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(int idPedidos) {
        this.idPedidos = idPedidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getProductovendido() {
        return productovendido;
    }

    public void setProductovendido(String productovendido) {
        this.productovendido = productovendido;
    }

    public String getPedidosentregados() {
        return pedidosentregados;
    }

    public void setPedidosentregados(String pedidosentregados) {
        this.pedidosentregados = pedidosentregados;
    }

    public int getOrdendelpedido() {
        return ordendelpedido;
    }

    public void setOrdendelpedido(int ordendelpedido) {
        this.ordendelpedido = ordendelpedido;
    }

    //Constructor
  
    public Pedidos(int idPedidos, Date fecha, double total, String estado, String productovendido) {
        this.idPedidos = idPedidos;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    public Pedidos(int idPedidos, Date fecha, double total, String registro, String productovendido, int idPanaderia, String nombre, String direccion, String paginaweb, String telefono, String sucursales, String redessociales) {
        super(idPanaderia, nombre, direccion, paginaweb, telefono, sucursales, redessociales);
        this.idPedidos = idPedidos;
        this.fecha = fecha;
        this.total = total;
        this.registro = registro;
        this.productovendido = productovendido;
    }
}