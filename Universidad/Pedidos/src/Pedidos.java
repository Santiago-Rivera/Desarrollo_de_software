package Universidad.Pedidos.src;

import java.util.Date;

public class Pedidos {

    //Atributos

    private int IdPedidos;

    private Date fecha;

    private double total;

    private String estado;

    //Métodos

    public void solicitar(){
        this.estado = "Solicitado";
        System.out.println("El pedido ha sido solicitado");
    }

    public void cancelarPedido() {
        if (this.estado.equals("Cancelado")) {
            this.estado = "Cancelado";
            System.out.println("El pedido ha sido cancelado");
        }else {
            System.out.println("El pedido ya está cancelado");
        }

    }

    public double calcularTotal(){
        System.out.println("Calculando pedido");
        return this.total;
    }

    public void reiniciarEstado(){
        this.estado = "Sin estado...";
        System.out.println("Cambiando estado pedido");
    }

    // Getter and Setter

    public int getIdPedidos() {
        return IdPedidos;
    }

    public void setIdPedidos(int idPedidos) {
        idPedidos = IdPedidos;
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

// Constructor

    public Pedidos(int idPedidos, Date fecha, double total, String estado){
        this.IdPedidos = idPedidos;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "IdPedidos=" + IdPedidos +
                ", fecha=" + fecha +
                ", total=" + total +
                ", estado='" + estado + '\'' +
                '}';
    }

    //Pedidos pedidos = new Pedidos(25, new Date(), 10.35, "Prueba");
}
