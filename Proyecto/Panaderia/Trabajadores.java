package Proyecto.Panaderia;

public class Trabajadores {

    // Atributos

    private String nombre; 

    private String cargo;

    private String nombredelproducto;

    private String tiposdeproductos;

    // Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombredelproducto() {
        return nombredelproducto;
    }

    public void setNombredelproducto(String nombredelproducto) {
        this.nombredelproducto = nombredelproducto;
    }

    public String getTiposdeproductos() {
        return tiposdeproductos;
    }

    public void setTiposdeproductos(String tiposdeproductos) {
        this.tiposdeproductos = tiposdeproductos;
    }

    // Constructor

    public Trabajadores(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }
}