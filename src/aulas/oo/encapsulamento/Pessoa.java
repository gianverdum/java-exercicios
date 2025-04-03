package aulas.oo.encapsulamento;

public class Pessoa {

    private int age;
    private String name;
    private String lastName;

    public Pessoa() {}

    public Pessoa(String name, int age) {
        setAge(age);
        setName(name);
    }

    public Pessoa(String name, String lastName, int age) {
        setAge(age);
        setName(name);
        setLastName(lastName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getFullName() {
        return name + " " + lastName;
    }

    @Override
    public String toString() {
        return "Hi, I'm " + getName() + " " + getLastName()
                + " and " + getAge() + " years old.";
    }
}
