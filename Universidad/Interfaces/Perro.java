package Universidad.Interfaces;

public class Perro implements Animal {

    @Override
    public void caminar() {
        System.out.println("El perro esta caminando");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Grrrrrr");
    }

    @Override
    public String tipoAnimal() {
        return "Es de tipo: Labrador";
    }
}
