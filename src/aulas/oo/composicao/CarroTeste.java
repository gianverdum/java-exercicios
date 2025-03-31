package aulas.oo.composicao;

public class CarroTeste {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        System.out.println(carro1.isLigado());

        carro1.ligar();
        System.out.println(carro1.isLigado());

        System.out.println(carro1.motor.giros());

        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();

        System.out.println(carro1.motor.giros());

        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();

        System.out.println(carro1.motor.carro.motor.carro.motor.giros());

        System.out.println(carro1.motor.giros());

    }
}
