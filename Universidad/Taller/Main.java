package Universidad.Taller;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Usuario user = new Usuario("Jason", "Computacion");

        user.mostrarInformacion();

        Alumno sergio = new Alumno(8,"Sergio","Computacion");

        sergio.getPromedio();

        sergio.mostrarInformacion();

        sergio.pasoLaMateria();

        Profesor daniel = new Profesor(4, "Daniel", "Laboratorio 2");

        daniel.getFalta();

        daniel.mostrarInformacion();

        daniel.conteoDeFalta();

        List<Asistencia> ASISTENCIA_INPUT = Arrays.asList(
            new Asistencia("Sergio", "Presente"),
            new Asistencia("Paula", "Falta"),
            new Asistencia("Xavier", "Presente"),
            new Asistencia("Ricardo", "Falta"),
            new Asistencia("Diane", "Presente"));
        for (Asistencia asistencia : ASISTENCIA_INPUT) {
            System.out.println(asistencia.getNombre() + " " + asistencia.getAsistencia());
        }
    }
}
