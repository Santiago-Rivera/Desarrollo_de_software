package Examen;

public class Carritodecompras {
    
    // Atributos

    private int idCarrito;

    private String productos;

    private double subtotal;

    private int impuestos;

    private String envio;

    private double total;

    private String metodoDePagoE;

    // Métodos

    public void metodoDePago(){
        if (metodoDePagoE == "tarjetadeCredito") {
            System.out.println("Usted a elejido pagar con tarjeta de credito");
        }if (metodoDePagoE == "transferencia") {
            System.out.println("A elegido pagar con transferencia");
        } else {
            System.out.println("A elejido pagadar con deposito");
        }
    }

    // Getter y Setter

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(int impuestos) {
        this.impuestos = impuestos;
    }

    public String getEnvio() {
        return envio;
    }

    public void setEnvio(String envio) {
        this.envio = envio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getMetodoDePagoE() {
        return metodoDePagoE;
    }

    public void setMetodoDePagoE(String metodoDePagoE) {
        this.metodoDePagoE = metodoDePagoE;
    }

    // Constructor

    public Carritodecompras(int idCarrito, String productos, double subtotal, int impuestos, String envio, double total, String metodoDePagoE) {
        this.idCarrito = idCarrito;
        this.productos = productos;
        this.subtotal = subtotal;
        this.impuestos = impuestos;
        this.envio = envio;
        this.total = total;
        this.metodoDePagoE = metodoDePagoE;
    }
}
