package aulas.oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.addAluno(aluno1);
        curso1.addAluno(aluno2);
        curso2.addAluno(aluno1);
        curso2.addAluno(aluno3);
        aluno1.addCurso(curso3);
        aluno2.addCurso(curso3);
        aluno3.addCurso(curso3);

        for (Aluno aluno : curso1.alunos) {
            System.out.printf("%s está matriculado(a) no curso %s%n%n", aluno.nome, curso1.nome);
        }

        for (Aluno aluno : curso2.alunos) {
            System.out.printf("%s está matriculado(a) no curso %s%n%n", aluno.nome, curso2.nome);
        }

        for (Aluno aluno : curso3.alunos) {
            System.out.printf("%s está matriculado(a) no curso %s%n%n", aluno.nome, curso3.nome);
        }

        System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.getCursoPorNome("Java completo");

        if(cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
