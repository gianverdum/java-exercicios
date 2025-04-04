package aulas.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimirNome =
                p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Notebook", 2987.99, 0.25);
        Produto p2 = new Produto("Cadaerno", 19.90, 0.03);
        Produto p3 = new Produto("Boracha", 7.80, 0.18);
        Produto p4 = new Produto("Lápis", 4.39, 0.19);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);

        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
