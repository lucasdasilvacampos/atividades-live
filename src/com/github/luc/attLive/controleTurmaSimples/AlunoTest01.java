package com.github.luc.attLive.controleTurmaSimples;

public class AlunoTest01 {
    public static void main(String[] args) {
        Turma turma = new Turma();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();
        Aluno aluno5 = new Aluno();
        aluno1.setNome("Lucas");
        aluno1.setIdade(17);

        aluno2.setNome("Jonas");
        aluno2.setIdade(23);

        aluno3.setNome("Vinicius");
        aluno3.setIdade(23);

        aluno4.setNome("Marcos");
        aluno4.setIdade(20);

        aluno5.setNome("Carlão");
        aluno5.setIdade(12);

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);
        turma.adicionarAluno(aluno4);
        turma.adicionarAluno(aluno5);

        turma.listarMaiorIdade();

    }
}
