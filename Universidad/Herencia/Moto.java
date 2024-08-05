package Universidad.Herencia;

public class Moto extends Vehiculo {

    //Atributos

    private boolean tieneSidecar;

    int valorMoto = 10000;

    //Métodos

    public void hacerCaballito(){
        System.out.println("El dueño de la moto hace caballito");
    }
    
    public boolean tieneSidecar(){
        if (this.tieneSidecar) {
            this.valorMoto = ((int) ((this.valorMoto * 0.15) + this.valorMoto));
            System.out.println("Valor de la moto con sidecar: " + this.valorMoto);
            return true;
        }else {
            return false;
        }
    }

    // Getter y Setter

    public boolean getTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    } 

    public int getValorMoto() {
        return valorMoto;
    }

    public void setValorMoto(int valorMoto) {
        this.valorMoto = valorMoto;
    }

    //Costructor

    public Moto(String marca, String modelo2, Integer anio, boolean tieneSidecar, int valorMoto) {
        super(marca, modelo2, anio);
        this.tieneSidecar = tieneSidecar;
        this.valorMoto = valorMoto;
    }
}

