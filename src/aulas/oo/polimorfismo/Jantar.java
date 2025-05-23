package aulas.oo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Comida arroz = new Arroz(0.2);
        Comida feijao = new Feijao(0.1);

        System.out.println("Peso: " + convidado.getPeso());
        convidado.comer(arroz);
        convidado.comer(feijao);
        System.out.println("Peso: " + convidado.getPeso());

        Comida sorvete = new Sorvete(0.4);

        convidado.comer(sorvete);
        System.out.println("Peso: " + convidado.getPeso());
    }
}
