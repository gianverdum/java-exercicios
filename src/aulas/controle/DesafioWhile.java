package aulas.controle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double total = 0;
        int contador = 0;

        while (nota != -1) {
            System.out.println("Digite a nota ou -1 para sair: ");
            nota = sc.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                contador++;
            } else if (nota != -1) {
                System.out.println("Nota inválida!");
            }
        }

        double media = total / contador;
        System.out.printf("Media: %.2f", media);
    }
}
