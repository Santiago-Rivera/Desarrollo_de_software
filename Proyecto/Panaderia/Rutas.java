package Proyecto.Panaderia;

public class Rutas {

    // Atributos

    private String nombreDelSector;

    private String direccion;

    // Getter y Setter

    public String getNombreDelSector() {
        return nombreDelSector;
    }

    public void setNombreDelSector(String nombreDelSector) {
        this.nombreDelSector = nombreDelSector;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Constructor

        public Rutas(String nombreDelSector, String direccion) {
        this.nombreDelSector = nombreDelSector;
        this.direccion = direccion;
    }
}