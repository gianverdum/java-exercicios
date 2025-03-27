package aulas.classe;

public class Equals {

    public static void main(String[] args) {

        User u1 = new User();
        u1.nome = "Joao Silva";
        u1.email = "joao.silva@gmail.com";

        User u2 = new User();
        u2.nome = "Joao Silva";
        u2.email = "joao.silva@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

    }
}
