package aulas.streams;

import java.util.Objects;

public class Aluno {

    final String nome;
    final double nota;
    final boolean behave;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }

    public Aluno(String nome, double nota, boolean behave) {
        this.nome = nome;
        this.nota = nota;
        this.behave = behave;
    }

    @Override
    public String toString() {
        return nome + " tem nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Aluno aluno)) return false;
        return Double.compare(nota, aluno.nota) == 0 && behave == aluno.behave && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, behave);
    }
}
