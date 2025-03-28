package aulas.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        /**
         * Diferença entre Offer e Add é o comportamento quando a fila está cheia
         */
        Queue<String> fila = new LinkedList<>();
        fila.add("Ana");
        fila.offer("Bia");
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Guilherme");

        /**
         * Quando a fiila está vazia Add retorna false e Offer retorna uuma exceção
         */
//        System.out.println(fila.peek());
//        System.out.println(fila.peek());
//        System.out.println(fila.element());

        /**
         * Poll remove e retorna o próximo elemento da fila
         * Remove tem o mesmo comportamento, mas gera erro se a fila estiver vazia
         */
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
//        System.out.println(fila.remove());
    }
}
