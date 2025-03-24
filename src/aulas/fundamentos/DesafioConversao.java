package aulas.fundamentos;


import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Digite o primeiro salario do T1: ");
        String paycheck1 = entry.nextLine().replace(",", ".");
        System.out.print("Digite o segundo salario do T1: ");
        String paycheck2 = entry.nextLine().replace(",", ".");
        System.out.print("Digite o terceiro salario do T1: ");
        String paycheck3 = entry.nextLine().replace(",", ".");

        double val1 = Double.parseDouble(paycheck1);
        double val2 = Double.parseDouble(paycheck2);
        double val3 = Double.parseDouble(paycheck3);
        double avg = (val1 + val2 + val3) / 3;

        System.out.printf("Media dos salarios: R$%.2f", avg);
    }
}
