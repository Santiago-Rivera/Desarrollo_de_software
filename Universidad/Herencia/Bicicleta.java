package Universidad.Herencia;

public class Bicicleta {
    
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

    public Bicicleta(int numeroVelocidades) {
        this.numeroVelocidades = numeroVelocidades;
    }

    public class Vehiculo extends Bicicleta{
        public Vehiculo(int numeroVelocidades) {
            super(numeroVelocidades);
        }
    }
}

