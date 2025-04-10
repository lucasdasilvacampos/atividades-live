package com.github.luc.attVinicus.herancaPessoa;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("ALUNO");
        super.exibirInformacoes();
        System.out.println("Matricula: " + this.matricula);
        System.out.println("------------------");
    }
}
