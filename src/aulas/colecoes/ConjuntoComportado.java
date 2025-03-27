package aulas.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

//        Set<String> approvedList = new HashSet<>(); // Não garante ordem de inserção
        SortedSet<String> approvedList = new TreeSet<>(); // Garante ordem de inserção
        approvedList.add("Ana");
        approvedList.add("Bob");
        approvedList.add("Carlos");
        approvedList.add("Luis");

        for(String candidate : approvedList) {
            System.out.println(candidate);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(120);
        nums.add(6);

        for(int num : nums) {
            System.out.println(num);
        }
    }
}
