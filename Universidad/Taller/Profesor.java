package Universidad.Taller;

public class Profesor extends Usuario {

    //Atributos

    private double falta;

    //Metodos

    public boolean conteoDeFalta(){
        if (falta >= 3) {
            System.out.println("Debe justificar su falta");
            return true;
        }else {
            System.out.println("No debe justificar sus faltas");
            return false;
        }
    }

    //Getter y Setter

    public double getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    //Constructor

    public Profesor(int falta, String nombreDeLaPersona, String salonDeClase) {
        super(nombreDeLaPersona, salonDeClase);
        this.falta = falta;
    }
}