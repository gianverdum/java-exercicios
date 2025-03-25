package aulas.controle;

public class DesafioFor {

    public static void main(String[] args) {
        /**
         * Criar um for que não utiliza valor numérico para controle
         */
        String valor = "#";
        for (String i = "#"; !i.equals("######"); i += "#"){
            System.out.println(valor);
            valor += "#";
        }
    }
}
