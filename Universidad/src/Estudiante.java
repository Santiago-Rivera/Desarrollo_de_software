package Universidad.src;

import java.util.List;

public class Estudiante {
    //atributos
    // visibilidad tipo de dato - nombre_variable
    private  int cedula;

    //private String nombres;

    //private String apellidos;

    //private int edad;

public List<Integer> notas;

    //constructor
    public Estudiante(int cedula){
        this.cedula = cedula;
    }
    //private List<List<Estudiante>> estudiantes;

    //métodos = funcionalidad o acciones
    //cargar archivos
    //ver curso

    public void obtenerDatos(String nombres){
        System.out.println("Hola desde el método obtenerDatos" + nombres);
    }

    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedulita){
        this.cedula = cedulita;
    }

    public String getNombres() {
        return "";
    }
}
/*public class Documento {

    private String[] authors;

    private Date;

    public String[] getAuthors() {
        return authors;
    }

    public void addAuthor(String name){
        System.out.println(name);
    }*/

// Un getter es un método público, solo lectura
