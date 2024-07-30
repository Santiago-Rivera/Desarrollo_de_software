package Examen;

import java.util.Date;

public class Comentario {

    // Atributos

    private int idComentario;

    private String producto;

    private String usuario;

    private String comentario;

    private Date fecha;

    // Métodos

    public String agregarelnombredelproducto(){
        return producto;
    }

    public Date ingresarlafecha(){
        return fecha;
    }

    // Getter y Setter

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Constructor

    public Comentario(int idComentario, String producto, String usuario, String comentario, Date fecha) {
        this.idComentario = idComentario;
        this.producto = producto;
        this.usuario = usuario;
        this.comentario = comentario;
        this.fecha = fecha;
    }
}
