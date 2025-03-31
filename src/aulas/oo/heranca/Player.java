package aulas.oo.heranca;

public class Player {

    int life = 100;
    int x;
    int y;

    boolean attack(Player opponent) {

        int deltaX = Math.abs(x - opponent.x);
        int deltaY = Math.abs(y - opponent.y);

        if(deltaX == 0 && deltaY == 1) {
            opponent.life -= 10;
            return true;
        } else if(deltaX == 1 && deltaY == 0) {
            opponent.life -= 10;
            return true;
        }

        return false;
    }

    boolean move(Direction direction) {
        switch (direction) {
            case UP:
                y--;
                break;
            case DOWN:
                y++;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
        }

        return true;
    }
}
