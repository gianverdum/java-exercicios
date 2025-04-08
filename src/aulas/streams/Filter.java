package aulas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ana", 7.8);
        Aluno aluno2 = new Aluno("Bia", 5.8);
        Aluno aluno3 = new Aluno("Daniel", 9.8);
        Aluno aluno4 = new Aluno("Gui", 6.8);
        Aluno aluno5 = new Aluno("Rebeca", 7.1);
        Aluno aluno6 = new Aluno("Pedro", 8.8);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
        Function<Aluno, String> saudacaoAprovado =
                a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";

        alunos.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }
}
