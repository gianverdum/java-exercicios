package aulas.oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void addCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso getCursoPorNome(String nome) {
        for (Curso c : cursos) {
            if (c.nome.equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public String toString() {
        return nome;
    }
}
