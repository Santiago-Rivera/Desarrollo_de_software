package Universidad.Colecciones;

import java.util.ArrayList;

import java.util.List;

public class Main {

    public static void main(String[] args) {
    
        List<Persona> alumnos = new ArrayList<>();

        Persona alumno_1 = new Persona("Juan", 9);

        Persona alumno_2 = new Persona("Jennifer", 12);

        alumnos.add(alumno_1);

        alumnos.add(alumno_2);

        for (Persona persona : alumnos ) {
            System.out.println(persona.getNombre() + " " + persona.getEdad());
        }
    }
}
