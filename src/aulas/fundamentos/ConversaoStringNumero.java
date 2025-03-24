package aulas.fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {

    public static void main(String[] args) {
        String val1 = JOptionPane.showInputDialog(
                "Digite o primeiro número:");
        String val2 = JOptionPane.showInputDialog(
                "Digite o segundo número:");

        System.out.println(val1 + val2);

        Double num1 = Double.parseDouble(val1);
        Double num2 = Double.parseDouble(val2);

        System.out.println(num1 + num2);
    }
}
