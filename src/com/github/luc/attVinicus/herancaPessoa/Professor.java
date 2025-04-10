package com.github.luc.attVinicus.herancaPessoa;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("PROFESSOR");
        super.exibirInformacoes();
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("------------------");

    }

}
