package Universidad.Taller;

public class Profesor extends Usuario {

    //Atributos

    private double falta;

    //Variables del metodo de asistencia de alumnos

    private String asistenciaDeAlumnos;

    private String[] arreglo = {"Sergio", "Pablo", "Alya", "Veronica"};

    private String palabraBuscada = "Pablo";

    private String palabraBuscada1 = "Alya";

    private boolean encontrada = false;

    private boolean noEncontrada = true;

    private String palabraNoEncontrada = "Sergio";

    private String palabraNoEncontrada1 = "Veronica"; 

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

    //El metodo asistecia de alumnos me permite saber que alumno fueron a la clase de computacion y que alumno no fue a la clase de computacion.

    public String asistenciaDeAlumnos(){
        for (String persona : arreglo) {
            if (persona.contains(palabraBuscada)) {
                encontrada = true;
                break;
            }
        }
        
        if (encontrada) {
            System.out.println(palabraBuscada + " " + "y" + " " + palabraBuscada1 + " " + "asistieron a la clase de computacion");
        } else {
            System.out.println("La persona no asistió a la clase.");
        } if (noEncontrada) {
            System.out.println(palabraNoEncontrada + " " + "y" + " " + palabraNoEncontrada1 + " " + "no asistieron a la clase de computacion");
        }
        return asistenciaDeAlumnos;
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