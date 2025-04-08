package aulas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ana", 7.8, false);
        Aluno aluno2 = new Aluno("Bia", 5.8, true);
        Aluno aluno3 = new Aluno("Daniel", 9.8, true);
        Aluno aluno4 = new Aluno("Gui", 6.8, true);
        Aluno aluno5 = new Aluno("Rebeca", 7.1, true);
        Aluno aluno6 = new Aluno("Pedro", 8.8, false);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
        Predicate<Aluno> comportado = a -> a.behave;
        Function<Aluno, String> saudacaoAprovado =
                a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";

        alunos.stream()
                .filter(aprovado)
                .filter(comportado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }
}
