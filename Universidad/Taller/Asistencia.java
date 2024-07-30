package Universidad.Taller;

public class Asistencia {

    //Atributos

    private String nombre;

    private String asistencia;

    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

    //Constructor

    public Asistencia(String nombre, String asistencia) {
        this.nombre = nombre;
        this.asistencia = asistencia;
    }
}
