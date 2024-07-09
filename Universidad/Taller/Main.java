package Universidad.Taller;

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
    }
}
