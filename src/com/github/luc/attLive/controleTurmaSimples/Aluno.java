package com.github.luc.attLive.controleTurmaSimples;

public class Aluno {
    private String nome;
    private int idade;
    private boolean maiorIdade;



    public boolean maiorIdade() {
       maiorIdade= idade >= 18;
           return maiorIdade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
