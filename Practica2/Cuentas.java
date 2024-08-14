package Practica2;

public class Cuentas extends Cliente {
    //Atributos

    private int IdCuentas;

    private int numero;

    private String titular;

    private String movimientos;

    //Getter y Setter

    public int getIdCuentas(){
        return IdCuentas;
    }

    public void setIdCuentas(int IdCuentas) {
        this.IdCuentas = IdCuentas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(String movimientos) {
        this.movimientos = movimientos;
    }

    //Constructor 

    public Cuentas(int IdCuentas, int numero, String titular, String movimientos, int idCilente, int dni, String nombre, String apellido){
        super(idCilente, dni, nombre, apellido);
        this.IdCuentas = IdCuentas;
        this.numero = numero;
        this.titular = titular;
        this.movimientos = movimientos;
    }
}
