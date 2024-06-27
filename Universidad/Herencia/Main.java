package Universidad.Herencia;

public class Main {
public static void main(String[] args) {
    Vehiculo mustang = new Vehiculo("Mustang", 215, 2017);

    System.out.println(mustang.getAnio());

    System.out.println(mustang.getMarca());

    System.out.println(mustang.getModelo());

    Carro mercedes = new Carro("Santiago", "Mercedes", 215, 2017);

    System.out.println(mercedes.getDuenio());

    System.out.println(mercedes.getAnio());

    System.out.println(mercedes.getMarca());

    System.out.println(mercedes.getModelo());

    Moto pulsar = new Moto(true, "pulsar", 180, 2023);

    System.out.println(pulsar.getAnio());

    System.out.println(pulsar.getMarca());

    System.out.println(pulsar.getModelo());

    Bicicleta honda = new Bicicleta(329, "Honda", 123, 2024);

    System.out.println(honda.getAnio());

    System.out.println(honda.getMarca());

    System.out.println(honda.getModelo());
}
}
