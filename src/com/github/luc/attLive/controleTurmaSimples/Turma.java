package com.github.luc.attLive.controleTurmaSimples;

public class Turma {
    Aluno[] alunos = new Aluno[5];

    public void adicionarAluno(Aluno a){
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null){
                alunos[i] = a;
                break;
            }

        }
        
    }
    
    public void listarMaiorIdade(){
        System.out.println("Lista dos maiores de idade");
        for (Aluno aluno : alunos) {
            if (aluno.maiorIdade()){
                System.out.println(aluno.getNome());
                System.out.println(aluno.getIdade());
            }

        }
        
    }

}
