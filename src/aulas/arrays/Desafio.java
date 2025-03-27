package aulas.arrays;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas para lançar: ");
        int quantidade = entrada.nextInt();

        double[] notas = new double[quantidade];

        for(int i = 0; i < quantidade; i++) {
            System.out.printf("Digite o valor da nota: ");
            notas[i] = entrada.nextDouble();
        }
        double total = 0;
        for(double nota : notas) {
            total += nota;
        }
        System.out.printf("A média do aluno é: %.2f%n", total / notas.length);
    }
}
