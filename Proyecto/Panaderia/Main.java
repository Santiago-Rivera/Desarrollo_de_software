package Proyecto.Panaderia;

import java.util.Date;

public class Main {
    public static void main(String[] args){
    
        Pedidos pedidos = new Pedidos(1, new Date(), 50, "En camino", "Entregado", "Sauces 8");

        pedidos.Solicitar(); 

        pedidos.cancelarPedido();

        Panaderia panaderia = new Panaderia(23 , "Dulzura", "domingo comin entre garcia agollena y la 24 va", "https://dulzura206.cms.webnode.ec/", "0986030552", "Francisco de orellana y Urdesa", "Panaderia_dulzura");
    
        panaderia.agregarNombre();

        panaderia.agregarTelefono();

        Clientes clientes = new Clientes(1, "Rivaldo", "Samanes", "0985678324", "rnuques.es@tecnologicoargos.edu.ec", 19, 1);

        clientes.agregarPedido();

        clientes.actualizarDatos();

        Servicios servicios = new Servicios(2, "Domicilio", "Urbanizacion Santiago", "Cumpleaños", "Pastel de futbol", "Pastel Vegetariano", "Avena");

        servicios.agendarelevento();

        servicios.agregarNombredelservicio();

        Transporte transporte = new Transporte(2, "Samanes a Alborada", 34, " Gustavo", "Hernandez", "0992392000", "gustavoriverahdez@hotmail.com");

        transporte.getApellidodelconductor();

        transporte.agregarNumerodelaunidad(); 

        Productos productos = new Productos(3, "Pan", "Pan de dulce", 0.15, "Harina", "100% natural", "100 unidades");

        productos.calcularelpreciodelproducto();

        productos.agregarcalidaddelproducto();
    }
}