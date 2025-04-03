package aulas.oo.abstrato;

public abstract class Mamifero extends Animal {

    public abstract String mamar();

    @Override
    public final String mover() {
        return "Anda";
    }
}
