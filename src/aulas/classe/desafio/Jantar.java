package aulas.classe.desafio;

public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Hamburger", 0.45);
        Pessoa p = new Pessoa("João", 80.18);
        System.out.printf("João pesava %.2fkg antes do jantar%n", p.peso);
        p.comer(c1);
        System.out.printf("João pesa %.2fkg depois de comer %s", p.peso, c1.nome);
    }
}
