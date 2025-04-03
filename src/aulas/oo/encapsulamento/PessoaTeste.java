package aulas.oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Peter", 20);
//        p1.age = -20;
        p1.setAge(-30);
        p1.setAge(-119);
        p1.setAge(144);

        System.out.println(p1);
    }
}
