package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {



        Scanner entry = new Scanner(System.in);

        System.out.print("Digite o seu name: ");
        String name = entry.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String lastName = entry.nextLine();

        System.out.print("Digite a sua idade: ");
        int age = entry.nextInt();

        System.out.printf("%s %s tem %d anos",
                name, lastName, age);
    }
}
