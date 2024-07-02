package Universidad.Herencia;

public class Bicicleta  extends Vehiculo{
    
    //Atributos 

    protected int numeroVelocidades;

    //Métodos
 
    public void tocarTimbre(){
        System.out.println("Numero de caballos de fuerzas");
    }

    //Getter y Setter

    public int getNumeroVelocidades() {
        return numeroVelocidades;
    }

    public void setNumeroVelocidades(int numeroVelocidades) {
        this.numeroVelocidades = numeroVelocidades;
    }

    //Constructor

    public Bicicleta(int numeroVelocidades, String marca, String modelo, Integer anio) {
        super(marca, modelo, anio);
        this.numeroVelocidades = numeroVelocidades;
    }
}