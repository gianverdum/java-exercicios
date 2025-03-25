package aulas.classe;

public class AreaCirc {

    double radius;
    static final double pi = 3.14;

    AreaCirc(double radius) {
        this.radius = radius;
    }

    double area() {
        return pi * Math.pow(radius, 2);
    }


}
