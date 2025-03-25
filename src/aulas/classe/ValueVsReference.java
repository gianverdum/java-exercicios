package aulas.classe;

public class ValueVsReference {

    public static void main(String[] args) {

        double a = 2;
        double b = a;
        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1;
        d1.day = 31;
        d2.month = 12;

        System.out.println(d1.getFormatedDate());
        System.out.println(d2.getFormatedDate());
        rollbackStandardDate(d1);
        System.out.println(d1.getFormatedDate());
        System.out.println(d2.getFormatedDate());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    static void rollbackStandardDate(Data d) {
        d.day = 1;
        d.month = 1;
        d.year = 1970;
    }

    static void alterarPrimitivo(int a) {
        a++;
    }
}
