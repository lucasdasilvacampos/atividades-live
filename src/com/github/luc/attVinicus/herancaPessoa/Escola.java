package com.github.luc.attVinicus.herancaPessoa;

import java.util.ArrayList;

public class Escola {
    private ArrayList<Pessoa> pessoas;

    public Escola() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa p) {
        this.pessoas.add(p);
        System.out.println("CADASTRADO COM SUCESSO! 👍🤠");

    }

    public void listarPessoas() {
        System.out.println("Lista de todas pessoas cadastradas:");
        for (Pessoa pessoa : this.pessoas) {
            pessoa.exibirInformacoes();
        }

    }
}
