package Proyecto.Panaderia;

public class Productos {

    //Atributos

    private int idProductos;

    private String nombredelproducto;

    private String tiposdeproductos;

    private double preciodelproducto;

    private String ingredientesdelproducto;

    private String calidaddelproducto;

    private String cantidaddelproducto;

    //Métodos

    public void agregarcalidaddelproducto(){
        System.out.println("Agregar la calidad del producto");
    }

    public void ingresaringredientesdelproducto(){
        System.out.println("Ingresar los ingredientes del producto");
    }

    public double calcularelpreciodelproducto(){
        System.out.println("Calcular el precio del producto");

        return preciodelproducto;
    }

    public void ingresarlostiposdeproductos(){
        System.out.println("Ingresar los tipos de productos");
    }

    //Getter y Setter

    public int getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
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

    public double getPreciodelproducto() {
        return preciodelproducto;
    }

    public void setPreciodelproducto(double preciodelproducto) {
        this.preciodelproducto = preciodelproducto;
    }

    public String getIngredientesdelproducto() {
        return ingredientesdelproducto;
    }

    public void setIngredientesdelproducto(String ingredientesdelproducto) {
        this.ingredientesdelproducto = ingredientesdelproducto;
    }

    public String getCalidaddelproducto() {
        return calidaddelproducto;
    }

    public void setCalidaddelproducto(String calidaddelproducto) {
        this.calidaddelproducto = calidaddelproducto;
    }

    public String getCantidaddelproducto() {
        return cantidaddelproducto;
    }

    public void setCantidaddelproducto(String cantidaddelproducto) {
        this.cantidaddelproducto = cantidaddelproducto;
    }

    //Constructor

    public Productos(int idProductos, String nombredelproducto, String tiposdeproductos, double preciodelproducto,String ingredientesdelproducto, String calidaddelproducto, String cantidaddelproducto) {
        this.idProductos = idProductos;
        this.nombredelproducto = nombredelproducto;
        this.tiposdeproductos = tiposdeproductos;
        this.preciodelproducto = preciodelproducto;
        this.ingredientesdelproducto = ingredientesdelproducto;
        this.calidaddelproducto = calidaddelproducto;
        this.cantidaddelproducto = cantidaddelproducto;
    }
}