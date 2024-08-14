package Practica2;

public class Main {
    public static void main(String[] args) {

        Cliente santiago = new Cliente(1, 1722901384, "Santiago", "Rivera");

        santiago.agregarNombreDelCiente();

        santiago.setNombre("Julian");

        santiago.setApellido("Alvarez");

        System.out.println(santiago.getNombre());

        System.out.println(santiago.getApellido());

        System.out.println(santiago.numeroDeCuentas());

        Movimientos movimientos = new Movimientos(1, "Beca-tec", 485, 1, 1722901384,"Santiago", "Rivera");

        santiago.agregarNombreDelCiente();

        santiago.setNombre("Lionel");

        santiago.setApellido("Messi");

        movimientos.setConcepto("Deposito por ventanilla");

        movimientos.setCantidad(600);

        System.out.println(movimientos.getCantidad());

        System.out.println(movimientos.getConcepto());

        System.out.println(santiago.getNombre());

        System.out.println(santiago.getApellido());

        Cuentas bancarias = new Cuentas(2, 1800490827, "Santiago", "Cuenta de ahorros", 1, 1722901384,"Santiago", "Rivera");

        santiago.agregarNombreDelCiente();

        santiago.setNombre("Dibu");

        santiago.setApellido("Martinez");

        movimientos.setCantidad(600);

        System.out.println(movimientos.getCantidad());

        bancarias.setNumero(1722901384);

        bancarias.setMovimientos("Cuenta de credito");

        System.out.println(bancarias.getNumero());

        System.out.println(bancarias.getMovimientos());

        System.out.println(santiago.getNombre());

        System.out.println(santiago.getApellido());
    }
}
