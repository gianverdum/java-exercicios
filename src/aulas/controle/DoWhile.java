package aulas.controle;

public class DoWhile {

    public static void main(String[] args) {

        String texto = "";
        do {
            System.out.println("Digite a palavra mágica");
            System.out.println("Quer encerrar o programa?");
        } while (!texto.equalsIgnoreCase("please"));
    }
}
