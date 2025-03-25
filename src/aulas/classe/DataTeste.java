package aulas.classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data(7, 11, 2024);
        var d2 = new Data();

        System.out.println(d1.getFormatedDate());
        System.out.println(d2.getFormatedDate());
    }
}
