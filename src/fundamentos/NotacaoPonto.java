package fundamentos;

public class NotacaoPonto {

    public static void main(String[] args) {

        String s = "Bom dia X!";
        s = s.toUpperCase().replace("X", "senhor").concat("!!!").toUpperCase();
        System.out.println(s);
    }
}
