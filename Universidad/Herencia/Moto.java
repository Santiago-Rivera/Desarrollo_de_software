package Universidad.Herencia;

public class Moto {

    //Atributos

    private int tieneSidecar;

    //Métodos

    public void hacerCaballito(){
        System.out.println("El dueño de la moto hace caballito");
    }

    // Getter y Setter

    public int getTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(int tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    //Costructor

    public Moto(int tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    public class Vehiculo extends Moto{
        public Vehiculo(int tieneSidecar) {
            super(tieneSidecar);
        }
    }
}

