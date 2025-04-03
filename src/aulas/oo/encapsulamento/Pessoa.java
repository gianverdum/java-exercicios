package aulas.oo.encapsulamento;

public class Pessoa {

    private int age;
    private String name;

    public Pessoa() {}

    public Pessoa(String name, int age) {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        age = Math.abs(age);
        if (age >= 0 && age <= 120) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Hi, I'm " + getName()
                + " and " + getAge() + " years old.";
    }
}
