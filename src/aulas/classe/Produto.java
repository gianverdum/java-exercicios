package aulas.classe;

public class Produto {

    String nome;
    double preco;
    static double discount = 0.25;

    Produto() {}

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    double precoComDesconto(){
        return preco * (1 - discount);
    }

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - (discount + descontoDoGerente));
    }
}
