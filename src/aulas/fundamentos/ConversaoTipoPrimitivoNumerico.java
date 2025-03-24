package aulas.fundamentos;

public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {
        double a = 1; // Implicit
        System.out.println(a);

        float b = (float) 1.12345; // Explicit ou Cast
        System.out.println(b);

        int c = 127;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);
    }
}
