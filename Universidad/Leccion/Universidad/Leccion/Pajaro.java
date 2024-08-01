package Universidad.Leccion;

public class Pajaro extends Animal implements Volador {

    //Atributos

    private String nombre;

    //Metodos

    public String cantar(String tipo) {
        return "El tipo es: " + tipo;
    }

    //Interfaz

    @Override
    public void volar() {
        System.out.println("El pajaro esta volando");
    }

    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        System.out.println("Nombre del pajaro");
    }

    //Constructor

    public Pajaro (String nombre) {
        this.nombre = nombre; 
    }
}