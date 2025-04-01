package aulas.oo.heranca.desafio;

public class Ferrari extends Car {

    Ferrari() {
        this(315);
    }

    Ferrari(int maxSpeed) {
        super(maxSpeed);
        delta = 350;
    }
}
