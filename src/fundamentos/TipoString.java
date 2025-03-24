package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Hi there!".charAt(0));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Giancarlo";
        var sobrenome = "Verdum";
        var idade = 37;
        var salario = 17324.57F;

        System.out.printf("%s %s is a developer with %d years old, and his paycheck is $%.2f",
                nome, sobrenome, idade, salario);

        String frase = String.format("\n%s %s is a developer with %d years old, and his paycheck is $%.2f",
                nome, sobrenome, idade, salario);
        System.out.printf(frase);
    }
}
