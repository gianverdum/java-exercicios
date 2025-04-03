package aulas.oo.heranca.desafio;

public class Ferrari extends Car implements Sportive, Delux {

    private boolean turboTurnedOn = false;
    private boolean airConditionerTurnedOn = false;

    public Ferrari() {
        this(315);
    }

    public Ferrari(int maxSpeed) {
        super(maxSpeed);
        setDelta(15);
    }

    @Override
    public void turboOn() {
        turboTurnedOn = true;
    }

    @Override
    public void turboOff() {
        turboTurnedOn = false;
    }

    @Override
    public void airConditionerOn() {
        airConditionerTurnedOn = true;
    }

    @Override
    public void airConditionerOff() {
        airConditionerTurnedOn = false;
    }

    @Override
    public int getDelta() {
        if(turboTurnedOn && !airConditionerTurnedOn) {
            return 35;
        } else if (turboTurnedOn && airConditionerTurnedOn) {
            return 30;
        } else if (!turboTurnedOn && !airConditionerTurnedOn) {
            return 20;
        } else {
            return 15;
        }
    }
}
