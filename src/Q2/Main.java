package Q2;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(1.6, "Flex");
        Carro carro = new Carro("Abacate", "Jeep", motor);

            carro.liga();
            carro.acelera(10.0);
            System.out.println("Marcha atual: " + carro.pegaMarcha());

                    carro.acelera(35.0);
                    System.out.println("Marcha atual: " + carro.pegaMarcha());

                        System.out.println("Modelo: " + carro.modelo);
                        System.out.println("Potência do motor: " + carro.motor.potencia);
    }
}