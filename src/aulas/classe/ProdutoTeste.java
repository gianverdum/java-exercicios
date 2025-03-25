package aulas.classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 2550.77);
        var p2 = new Produto("Pen", 12.56);

        Produto.discount = 0.50;

        System.out.printf("%s $%.2f%n", p1.nome, p1.precoComDesconto());
        System.out.printf("%s $%.2f%n", p2.nome, p2.precoComDesconto());
        System.out.printf("Total price: $%.2f%n", p1.precoComDesconto() + p2.precoComDesconto());
    }
}
