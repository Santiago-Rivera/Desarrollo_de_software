package Universidad.Herencia;

public class Main {
public static void main(String[] args) {
    Vehiculo mustang = new Vehiculo("Mustang", "G", 2017); 

    System.out.println(mustang.getAnio());

    System.out.println(mustang.getMarca());

    System.out.println(mustang.getModelo());

    Carro mercedes = new Carro("Santiago", "Mercedes", "G", 2017);

    System.out.println(mercedes.getDuenio());

    System.out.println(mercedes.getAnio());

    System.out.println(mercedes.getMarca());

    System.out.println(mercedes.getModelo());

    Moto pulsar = new Moto("Pulsar", "1234", 2023, true, 10000);

    System.out.println(pulsar.getAnio());

    System.out.println(pulsar.getMarca());

    System.out.println(pulsar.getModelo());

    System.out.println(pulsar.getTieneSidecar());

    Bicicleta honda = new Bicicleta(329, "Honda", "Fd", 2024);

    System.out.println(honda.getAnio());

    System.out.println(honda.getMarca());

    System.out.println(honda.getModelo());
}
}
