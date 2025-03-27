package aulas.arrays;

public class Foreach {

    public static void main(String[] args) {

        double[] notas = {9.9, 8.7, 7.2, 9.4};

        double total = 0;
        for(double nota : notas) {
            System.out.printf("Nota: %.2f%n", nota);
            total += nota;
        }
        System.out.printf("Média das notas: %.2f%n", (total / notas.length));
    }
}
