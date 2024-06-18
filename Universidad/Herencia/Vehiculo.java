package Universidad.Herencia;

import java.util.Date;

public class Vehiculo {

    //Atributos

    private String marca;

    private int modelo;

    private Date anio;

    //Métodos

    public void arrancar(){
        System.out.println("Arrancar el carro");
    }

    public void detener(){
        System.out.println("Deterner el carro");
    }

    public void mostrarInfo(){
        System.out.println("Mostrar informacion del carro");
    }

    //Getter y Setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    //Constructor

    public Vehiculo(String marca, int modelo, Date anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
}
