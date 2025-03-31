package aulas.oo.heranca.desafio;

public class Car {

    int speed = 0;

    void accelerate() {
        speed += 5;
    }

    void brake() {
        if (speed >= 5) {
            speed -= 5;
        } else  {
            speed = 0;
        }
    }

    int getSpeed() {
        return speed;
    }
}
