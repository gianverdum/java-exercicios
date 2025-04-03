package aulas.oo.heranca.desafio;

public interface Delux {

    void airConditionerOn();
    void airConditionerOff();
    default int airConditionerSpeed() {
        return 1;
    }
}
