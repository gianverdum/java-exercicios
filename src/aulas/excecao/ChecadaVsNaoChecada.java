package aulas.excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        System.out.println("Fim :)");
    }
    // Exceção não verificada
    static void geraErro1() {
        throw new RuntimeException("Erro #01!");
    }
    // Exceção verificada
    static void geraErro2() throws Exception{
        throw new Exception("Erro #02!");
    }
}
