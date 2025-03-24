package aulas.fundamentos;

public class Wrappers {

    public static void main(String[] args) {

        // byte
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt("15000");
        Long l = 100_000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);
        System.out.println(l);

        Float f = 123.0F;
        System.out.println(f);

        Double d = 123.12345;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c.toString());
    }
}
