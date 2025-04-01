package aulas.oo.heranca.desafio;

public class Car {
    final int MAX_SPEED;
    int speed = 0;
    int delta = 5;

    Car(int maxSpeed) {
        MAX_SPEED = maxSpeed;
    }

    void accelerate() {
        if (speed + delta > MAX_SPEED) {
            speed = MAX_SPEED;
        } else {
            speed += delta;
        }
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
