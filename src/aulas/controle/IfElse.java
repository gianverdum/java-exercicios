package aulas.controle;

import javax.swing.*;

public class IfElse {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog(
                "Digite o valor: ");
        int numero = Integer.parseInt(valor);
        if (numero % 2 == 0) {
            System.out.println("Número par!");
        } else {
            System.out.println("Número ímpar!");
        }

    }
}
