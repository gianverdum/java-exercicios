package aulas.fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        // (ºF - 32) x 5/9 = ºC
        double fahrenheit = 87;
        double celsius;
        final int ADJUST = 32;
        final double FACTOR = 5.0 / 9.0;

        celsius = (fahrenheit - ADJUST) * FACTOR;

        System.out.println("Temperature: " + celsius + "ºC");
    }
}
