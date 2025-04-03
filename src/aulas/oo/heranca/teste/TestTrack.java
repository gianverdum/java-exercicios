package aulas.oo.heranca.teste;

import aulas.oo.heranca.desafio.Car;
import aulas.oo.heranca.desafio.Civic;
import aulas.oo.heranca.desafio.Ferrari;

public class TestTrack {

    public static void main(String[] args) {
        Ferrari f = new Ferrari(400);
        f.accelerate();

        Car c = new Civic();
        c.accelerate();

        System.out.println("Ferrari Speed: " + f.getSpeed());
        System.out.println("Civic Speed: " + c.getSpeed());

        f.turboOn();
        f.airConditionerOn();
        f.accelerate();
        f.accelerate();
        f.turboOff();
        f.accelerate();
        c.accelerate();
        c.accelerate();
        c.accelerate();

        System.out.println("Ferrari Speed: " + f.getSpeed());
        System.out.println("Civic Speed: " + c.getSpeed());

        f.brake();
        f.brake();
        f.brake();
        f.brake();
        c.brake();
        c.brake();
        c.brake();
        c.brake();

        System.out.println("Ferrari Speed: " + f.getSpeed());
        System.out.println("Civic Speed: " + c.getSpeed());
    }
}
