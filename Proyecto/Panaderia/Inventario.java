package Proyecto.Panaderia;

public class Inventario {

    //Atributos

    private String nombredelproducto;

    private String tiposdeproductos;

    //Getter y Setter

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

    public Inventario(String nombredelproducto, String tiposdeproductos) {
        this.nombredelproducto = nombredelproducto;
        this.tiposdeproductos = tiposdeproductos;
    }
}