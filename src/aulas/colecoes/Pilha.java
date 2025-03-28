package aulas.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O pequeno príncipe");
        livros.push("A magia do atendimento");
        livros.push("O hobbit");

//        System.out.println(livros.peek());
//        System.out.println(livros.element());
//
//        System.out.println(livros.poll());
//        System.out.println(livros.poll());
//        System.out.println(livros.pop());
//        System.out.println(livros.poll());

        for(String livro : livros) {
            System.out.println(livro);
        }
    }
}
