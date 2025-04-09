package aulas.excecao;

public class Causa {

    public static void main(String[] args) {
        try {
            metodoA(null);
        } catch (Exception e) {
            if(e.getMessage() != null) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        } catch (Exception cause) {
            throw new IllegalArgumentException(cause);
        }
    }

    static void metodoB(Aluno aluno) {
        if(aluno == null) {
            throw new NullPointerException("Aluno está nulo!");
        }
        System.out.println(aluno.nome);
    }
}
