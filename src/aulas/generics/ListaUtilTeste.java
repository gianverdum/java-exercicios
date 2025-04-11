package aulas.generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args) {

        List<String> langs = Arrays.asList("Java", "C#", "Python", "PHP");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem);

        Integer ultimaNum = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimaNum);

        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLinguagem2);

        Integer ultimaNum2 = ListaUtil.getUltimo2(nums);
        System.out.println(ultimaNum2);
    }
}
