package aulas.oo.heranca;

public class Hero extends Player{

    boolean attack(Player opponent) {

        boolean attack1 = super.attack(opponent);
        boolean attack2 = super.attack(opponent);
        boolean attack3 = super.attack(opponent);
        return attack1 || attack2 || attack3;
    }
}
