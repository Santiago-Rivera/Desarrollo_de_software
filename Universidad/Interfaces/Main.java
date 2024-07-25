package Universidad.Interfaces;

public class Main {
    public static void main(String[] args) {

        Perro douglas = new Perro();

        douglas.caminar();

        douglas.hacerRuido();

        System.out.println(douglas.tipoAnimal());

        Gato garfiel = new Gato();

        garfiel.caminar();

        garfiel.hacerRuido();

        System.out.println(garfiel.tipoAnimal());
    }
}