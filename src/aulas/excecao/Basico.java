package aulas.excecao;

import aulas.streams.Aluno;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            imprimirNomeDoAluno(a1);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
            e.printStackTrace();
        }


        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
//            e.printStackTrace();
        }
        System.out.println("Fim :)");
    }
    public static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.getNome());
    }
}
