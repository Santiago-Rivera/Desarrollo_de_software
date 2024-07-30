package Universidad.Herencia;

public class Bicicleta  extends Vehiculo{
    
    //Atributos 

    private int numeroDeVelocidades;

    private double valorBicicleta;

    private double descuento;

    private double totalConDescuento;

    //Métodos

    public void tocarTimbre(){
        System.out.println("Numero de caballos de fuerzas");
    }

    public boolean numeroDeVelocidades(){
        if (getNumeroDeVelocidades() >= 3) {
            this.descuento = this.valorBicicleta * 0.10;
            this.totalConDescuento = this.valorBicicleta - this.descuento;
            this.valorBicicleta = this.totalConDescuento;
            System.out.println("El valor de la bicicleta con descuento es: " + this.valorBicicleta);
            return true;
        }else {
            return false;
        }
    }
    //Getter y Setter

    public int getNumeroDeVelocidades() {
        return numeroDeVelocidades;
    }

    public void setNumeroVelocidades(int numeroVelocidades) {
        this.numeroDeVelocidades = numeroVelocidades;
    }

    public double getValorBicicleta() {
        return valorBicicleta;
    }

    public void setValorBicicleta(int valorBicicleta) {
        this.valorBicicleta = valorBicicleta;
    }

    //Constructor

    public Bicicleta(Integer numeroVelocidades, String marca, String modelo, Integer anio, Integer valorBicicleta) {
        super(marca, modelo, anio);
        this.numeroDeVelocidades = numeroVelocidades;
        this.valorBicicleta = valorBicicleta;
    }
}