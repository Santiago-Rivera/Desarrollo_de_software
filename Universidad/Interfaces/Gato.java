package Universidad.Interfaces;

public class Gato implements Animal {

    @Override
    public void caminar() {
        System.out.println("El gato esta caminando");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau");
    }

    @Override
    public String tipoAnimal() {
        return "Es de tipo: Persa";
    }
}
