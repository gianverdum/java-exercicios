package aulas.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos? ");
        int qtdAlunos = sc.nextInt();

        System.out.println("Quantos notas por aluno? ");
        int qtdNotas = sc.nextInt();

        double[][] notas = new double[qtdAlunos][qtdNotas];
        double total = 0;
        for (int a = 0; a < notas.length; a++) {
            for (int n = 0; n < notas[a].length; n++) {
                System.out.printf("Informe a %dª nota do aluno %d: ", n + 1, a + 1);
                notas[a][n] = sc.nextDouble();
                total += notas[a][n];
            }
        }
        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Média da turma é: " + media);

        for(double[] nota : notas) {
            System.out.println(Arrays.toString(nota));
        }
    }
}
