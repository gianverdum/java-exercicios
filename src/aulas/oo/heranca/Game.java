package aulas.oo.heranca;

public class Game {

    public static void main(String[] args) {

        Monster p1 = new Monster();
        p1.x = 10;
        p1.y = 10;

        Hero p2 = new Hero(10, 11);

        System.out.println("Monster life is " + p1.life);
        System.out.println("Hero life is " + p2.life);

        p1.attack(p2);
        p2.attack(p1);

        p1.attack(p2);
        p2.attack(p1);

        p1.move(Direction.UP);
        p1.attack(p2);
        p2.attack(p1);

        System.out.println("Monster life is " + p1.life);
        System.out.println("Hero life is " + p2.life);
    }
}
