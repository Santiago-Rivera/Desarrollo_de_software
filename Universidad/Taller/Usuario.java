package Universidad.Taller;

public class Usuario {

    //Atributos

    private String nombreDeLaPersona;

    private String salonDeClase;

    //Metodos

    public void mostrarInformacion(){
        System.out.println("Nombre de la persona es: " + nombreDeLaPersona + " Salon de clase es: " + salonDeClase);
    }

    //Getter y Setter

    public String getNombreDeLaPersona() {
        return nombreDeLaPersona;
    }

    public void setNombreDeLaPersona(String nombreDeLaPersona) {
        this.nombreDeLaPersona = nombreDeLaPersona;
    }

    public String getSalonDeClase() {
        return salonDeClase;
    }

    public void setSalonDeClase(String salonDeClase) {
        this.salonDeClase = salonDeClase;
    }

    //Constructor

    public Usuario(String nombreDeLaPersona, String salonDeClase) {
        this.nombreDeLaPersona = nombreDeLaPersona;
        this.salonDeClase = salonDeClase;
    }
}
