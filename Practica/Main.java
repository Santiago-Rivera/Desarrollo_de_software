package Practica;

public class Main {

    public static void main(String[] args) {
        Productos producto = new Productos(1, "Salsa de tomate", "Los Andes", 2.45, 10, 6.8);
        System.out.println(producto.getNombre());
        System.out.println(producto.getDescripcion());
        System.out.println(producto.getPrecio());

        Carrito carrito = new Carrito(2, "Salsa de mayonesa", 2.55, 15, "a domicilio", 3, "Transferencia", 1, "Salsa de tomate", "Los Andes", 2, 10, 6);
        System.out.println(carrito.getMetodoDePagoE());
        System.out.println(carrito.getProductos());
        System.out.println(carrito.getImpuestos());
        System.out.println(carrito.getNombre());
        System.out.println(carrito.getDescripcion());
        System.out.println("precio de la salsa de tomate es:" + " " + carrito.getPrecio());
        System.out.println(carrito.hacerInventario());
        System.out.println(carrito.productos());
        carrito.venderProductos();

        Inventario inventario = new Inventario(3, "Salsa de ranch", 20, 1, "Cebolla", "Vegetal", 1, 50, 9);
        System.out.println(inventario.getIdInventario());
        System.out.println(inventario.getNombreDelProducto());
        System.out.println(inventario.getCantidadDelProducto());
        System.out.println(inventario.getNombre());
        System.out.println(inventario.getDescripcion());
        System.out.println("precio de la cebolla es:" + " " + inventario.getPrecio());
        System.out.println(inventario.hacerInventario());
        System.out.println(inventario.productos());
        inventario.venderProductos();
    }
}
