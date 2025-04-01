package aulas.oo.heranca.desafio;

public class TestTrack {

    public static void main(String[] args) {
        Car f = new Ferrari(400);
        f.accelerate();

        Car c = new Civic();
        c.accelerate();

        System.out.println("Ferrari Speed: " + f.getSpeed());
        System.out.println("Civic Speed: " + c.getSpeed());

        f.accelerate();
        f.accelerate();
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
