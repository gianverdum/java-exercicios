package aulas.fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        /**
         * Ler num1
         * Ler num2
         * + - * / %
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double a = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double b = sc.nextDouble();
        System.out.println("Digite a operação desajada: ");
        String op = sc.next();

        double result = "+".equals(op) ? a + b : 0;
        result = "-".equals(op) ? a - b : 0;
        result = "*".equals(op) ? a * b : result;
        result = "/".equals(op) ? a / b : result;
        result = "%".equals(op) ? a % b : result;

        System.out.printf("O resultado de %.2f %s %.2f é %.2f", a, op, b, result);
    }
}
