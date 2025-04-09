package aulas.excecao.personalizadaB;

import aulas.excecao.Aluno;
import aulas.excecao.personalizadaB.NumeroForaIntervaloException;
import aulas.excecao.personalizadaB.StringVaziaException;
import aulas.excecao.personalizadaB.Validar;

public class TesteValidacoes {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Ana", -7);
            Validar.aluno(aluno);
        } catch (StringVaziaException
                 | NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim :)");

    }
}
