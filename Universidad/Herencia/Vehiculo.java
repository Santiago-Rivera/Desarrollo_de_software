package Universidad.Herencia; 

public class Vehiculo {

    //Atributos

    private String marca;

    private int modelo;

    private Integer anio;

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

    public int getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    //Constructor
    public Vehiculo(String marca, int modelo2, Integer anio) {
        this.marca = marca;
        this.modelo = modelo2;
        this.anio = anio;
    }
}
