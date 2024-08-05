package Universidad.Herencia;

public class Carro extends Vehiculo {
 
    //Atributos

    private String duenio;

    //Métodos

    public void encenderAireAcondicionado(){
        System.out.println("Encender el aire acondicionado");
    }
 
    //Getter y Setter

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    //Constructor

    public Carro(String duenio, String marca, String modelo,Integer anio) {
        super(marca, modelo, anio);
        this.duenio = duenio;    
    } 
}
