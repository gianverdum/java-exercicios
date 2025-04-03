package aulas.oo.heranca.desafio;

public class Car {
    final int MAX_SPEED;
    int speed = 0;
    int delta = 5;

    protected Car(int maxSpeed) {
        MAX_SPEED = maxSpeed;
    }

    public void accelerate() {
        if (speed + delta > MAX_SPEED) {
            speed = MAX_SPEED;
        } else {
            speed += delta;
        }
    }

    public void brake() {
        if (speed >= 5) {
            speed -= 5;
        } else  {
            speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }
}
