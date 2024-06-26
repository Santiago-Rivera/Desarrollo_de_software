package Universidad.Herencia;

import java.util.Date;

public class Main {
public static void main(String[] args) {
    Vehiculo vehiculo = new Vehiculo("Mustang", 215, new Date());

    vehiculo.arrancar();

    Carro carro = new Carro("Santiago");

    carro.encenderAireAcondicionado();

    Moto moto = new Moto(1);

    moto.hacerCaballito();

    Bicicleta bicicleta = new Bicicleta(2);

    bicicleta.getNumeroVelocidades();
}
}
