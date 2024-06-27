package Universidad.Herencia;

public class Moto extends Vehiculo {

    //Atributos

    private boolean tieneSidecar;

    //Métodos

    public void hacerCaballito(){
        System.out.println("El dueño de la moto hace caballito");
    }
    
    // Getter y Setter

    public boolean getTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    //Costructor

    public Moto(boolean tieneSidecar, String marca, int modelo, Integer anio) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }
}

