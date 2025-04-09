package aulas.excecao.personalizadaB;

import aulas.excecao.Aluno;
import aulas.excecao.personalizadaB.NumeroForaIntervaloException;
import aulas.excecao.personalizadaB.StringVaziaException;

public class Validar {

    private Validar() {}

    public static void aluno(Aluno aluno)
            throws StringVaziaException, NumeroForaIntervaloException {
        if (aluno == null) {
            throw new IllegalArgumentException("O aluno está nulo!");
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }

        if (aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaIntervaloException("nota");
        }
    }
}
