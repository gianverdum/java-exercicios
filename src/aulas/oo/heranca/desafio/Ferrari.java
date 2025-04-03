package aulas.oo.heranca.desafio;

public class Ferrari extends Car {

    public Ferrari() {
        this(315);
    }

    public Ferrari(int maxSpeed) {
        super(maxSpeed);
        delta = 350;
    }
}
