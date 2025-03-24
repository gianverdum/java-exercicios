package aulas.fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Informações de um funcionário
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 324567;
        long pontosAcumulados = 3_123_123_123L;

        // Tipos numéricos inteiros
        float salario = 11_455.44F;
        double vendasAcumuladas = 2_123_123_123.89;

        // Tipo booleano
        boolean estaDeFerias = true;

        // Tipo caractere
        char status = 'A'; // Ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias?" + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
