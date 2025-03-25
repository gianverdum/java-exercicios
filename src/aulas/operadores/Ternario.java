package aulas.operadores;

public class Ternario {

    public static void main(String[] args) {

        double avg = 7.9;
        String partialResult = avg >= 5.0 ?
                "em Recuperação" : "Reprovado";
        String finalResult = avg >= 7.0 ?
                "Aprovado" : partialResult;

        System.out.println("O aluno está " + finalResult);
    }
}
