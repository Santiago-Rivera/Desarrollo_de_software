package Universidad.Taller;

public class Alumno extends Usuario {

    //Atributos 

    private double promedio;

    //Metodos

    public boolean pasoLaMateria() {
        if (promedio >= 7) {
            System.out.println("Aprobo la materia");
            return true;
        }else {
            System.out.println("Reprobo la materia");
            return false;
        }
    }

    //Getter y Setter

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    //Constructor

    public Alumno(double promedio, String nombreDeLaPersona, String salonDeClase) {
        super(nombreDeLaPersona, salonDeClase);
        this.promedio = promedio;
    }
}
