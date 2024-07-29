package Proyecto.Panaderia;

import java.util.Arrays;

import java.util.Date;

import java.util.List;

public class Main {
    public static void main(String[] args){

        Pedidos pedidos = new Pedidos(1, new Date(), 50, "Entregado", "Sauces 8");

        pedidos.Solicitar(); 

        pedidos.cancelarPedido();

        Panaderia panaderia = new Panaderia(23 , "Dulzura", "domingo comin entre garcia agollena y la 24 va", "https://dulzura206.cms.webnode.ec/", "0986030552", "Francisco de orellana y Urdesa", "Panaderia_dulzura");

        panaderia.agregarNombre();

        panaderia.agregarTelefono();

        Clientes clientes = new Clientes(1, "Rivaldo", "Samanes", "0985678324", "rnuques.es@tecnologicoargos.edu.ec", 19, 1);

        clientes.agregarPedido();

        clientes.actualizarDatos();

        clientes.entregarMercaderia();

        clientes.hacerInventario();

        clientes.seleccionarRuta();

        Servicios servicios = new Servicios(2, "Domicilio", "Urbanizacion Santiago", "Cumpleaños", "Pastel de futbol", "Pastel Vegetariano", "Avena");

        servicios.agendarelevento();

        servicios.agregarNombredelservicio();

        List<Trabajadores> TRABAJADORES_INPUT = Arrays.asList(
            new Trabajadores("Juan", "Limpieza"),
            new Trabajadores("Pedro", "Panadero"),
            new Trabajadores("Fernando", "Conductor"),
            new Trabajadores("William", "Decorador"),
            new Trabajadores("Enrique", "Repartidor"));
            for (Trabajadores trabajadores : TRABAJADORES_INPUT) {
            System.out.println(trabajadores.getNombre() + " " + trabajadores.getCargo());
        }

        Transporte transporte = new Transporte(2, "Samanes a Alborada", 34, " Gustavo", "Hernandez", "0992392000", "gustavoriverahdez@hotmail.com");

        transporte.getApellidodelconductor();

        transporte.agregarNumerodelaunidad(); 

        List<Rutas> RUTAS_INPUT = Arrays.asList(
            new Rutas("Norte", "Alborada 5ta etapa"),
            new Rutas("Sur", "Trinitarias"),
            new Rutas("Norte", "samanes"),
            new Rutas("Norte", "Sauses"));
            for (Rutas rutas : RUTAS_INPUT) {
                System.out.println(rutas.getNombreDelSector() + " " + rutas.getDireccion());
            }

        transporte.entregarMercaderia();

        transporte.hacerInventario();

        transporte.seleccionarRuta();

        Productos productos = new Productos(3, "Pan", "Pan de dulce", 0.15, "Harina", "100% natural", "100 unidades");

        productos.calcularelpreciodelproducto();

        productos.agregarcalidaddelproducto();

        List<Inventario> INVENTARIO_INPUT = Arrays.asList(
        new Inventario("Pan", "Enrrollado"),
        new Inventario("Pan", "Salado"),
        new Inventario("Pan", "Baguette"),
        new Inventario("Arepas", "Colombianas"),
        new Inventario("Buñuelos", "Colombianos"),
        new Inventario("Gelatina", "Mosaico"),
        new Inventario("Flan", "Queso de leche"),
        new Inventario("Arepas de queso", "Colombianas"),
        new Inventario("Croassan", "Crema pastelera"),
        new Inventario("Rosca de reyes", "Chocolate"));
        for (Inventario inventario : INVENTARIO_INPUT) {
            System.out.println(inventario.getNombredelproducto() + " " + inventario.getTiposdeproductos());
        }
    }
}