package Practica;

import java.util.ArrayList;
import java.util.List;

public class Carrito extends Productos implements Mercancia {

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

    //Interfaz 

    @Override
    public List<String> hacerInventario() {
        List<String> inventario = new ArrayList<>();
        inventario.add("Salsa de tomate, Cantidad: 20");
        inventario.add("Cebolla, Cantidad: 30");
        inventario.add("Pimientos, Cantidad: 10");
        inventario.add("Cilantro, Cantidad: 5");
        inventario.add("Carne, Cantidad: 50");
        inventario.add("Mariscos, Cantidad: 10");
        return inventario;
    }

    @Override
    public List<String> productos() {
        List<String> productos = new ArrayList<>();
        productos.add("Arroz");
        productos.add("Azucar");
        productos.add("Sal");
        productos.add("Especias");
        productos.add("Gaseosas");
        productos.add("Dulces");
        return productos;
    }

    @Override
    public void venderProductos() {
        System.out.println("Los productos se estan vendiendo");
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

    //Constructor

    public Carrito(int idCarrito, String productos, double subtotal, int impuestos, String envio, double total, String metodoDePagoE, int idProductos, String nombre, String descripcion, double precio, int stock, double resena) {
        super(idProductos, nombre, descripcion, precio, stock, resena);
        this.idCarrito = idCarrito;
        this.productos = productos;
        this.subtotal = subtotal;
        this.impuestos = impuestos;
        this.envio = envio;
        this.total = total;
        this.metodoDePagoE = metodoDePagoE;
    }
}
