package aulas.fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s));

        Scanner sc = new Scanner(System.in);

        String s2 = sc.nextLine();

        System.out.println("2" == s2);
        System.out.println("2".equals(s2.trim()));
    }
}
