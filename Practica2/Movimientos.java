package Practica2;

public class Movimientos extends Cliente {
    //Atributos

    private int idMovimientos;

    private String concepto;

    private int cantidad;

    //Metodos

    public void digiteElMotivoDelMovimiento() {
        System.out.println("Por favor digite el motivo del movimiento");
    }

    public void ingreseLaCantidadDelMovimiento() {
        System.out.println("Ingrese la cantidad del movimiento");
    }

    //Getter y Setter

    public int getIdMovimientos() {
        return idMovimientos;
    }

    public void setIdMovimientos(int idMovimientos) {
        this.idMovimientos = idMovimientos;
    }

    public String getConcepto() { 
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Constructor

    public Movimientos(int idMovimientos, String concepto, int cantidad, int idCilente, int dni, String nombre, String apellido) {
        super(idCilente, dni, nombre, apellido);
        this.idMovimientos = idMovimientos;
        this.concepto = concepto; 
        this.cantidad = cantidad;
    }
}
