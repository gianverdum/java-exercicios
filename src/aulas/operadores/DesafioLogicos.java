package aulas.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        // Trabalho terça
        // Trabalho quinta
        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        System.out.println("Comprou Tv 50\"? " + comprouTv50);
        System.out.println("Comprou Tv 32\"? " + comprouTv32);
        System.out.println("Comprou sorverte? " + comprouSorvete);
        System.out.println("Mais saudável? " + !comprouSorvete);
    }
}
