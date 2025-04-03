package aulas.oo.heranca;

public class Player {

    public int life = 100;
    public int x;
    public int y;

    protected Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean attack(Player opponent) {

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

    public boolean move(Direction direction) {
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
