package aulas.lambdas;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("iPad", 3235.89, 0.13);

        /**
         * 1. A partir do produto calcular o preco real (com desconto)
         * 2. Imposto Monicipal: >= 2500 (8,5%)/ < 2500 (Isento)
         * 3. Frete: >= 3000 (100)/ < 3000 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$ 1234,56
         */

//        BiFunction<Double, Double, Double> precoComDesconto =
//                (valorProduto, valorDesconto) -> valorProduto * valorDesconto;
//        UnaryOperator<Double> valorComImposto =
//                valorProduto -> valorProduto >= 2500 ? valorProduto * (1 + 0.085) : valorProduto;
//        UnaryOperator<Double> valorComFrete =
//                valorProduto -> valorProduto >= 3000 ? valorProduto + 100 : valorProduto;
//        UnaryOperator<Double> arredondar =
//                valorProduto -> Math.round(valorProduto * 100.0) / 100.0;
//        Function<Double, String> formatar =
//                valorProduto -> NumberFormat
//                        .getCurrencyInstance(Locale
//                        .forLanguageTag("pt-BR"))
//                        .format(valorProduto);
//
//        Function<Produto, String> pipeline =
//                produto -> precoComDesconto
//                        .andThen(valorComImposto)
//                        .andThen(valorComFrete)
//                        .andThen(arredondar)
//                        .andThen(formatar)
//                        .apply(p.preco, p.desconto);
//
//        System.out.println(pipeline.apply(p));

        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - p.desconto);
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco;
        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(",", ".");

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preço final é " + preco);

    }
}
