package com.github.luc.attVinicus.biblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Livro> livrosEmprestados;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>(); //Esta é lista vazia de livro do usuario
    }

    public void pegarEmprestado(Livro livro) {
        this.livrosEmprestados.add(livro); // add adiciona um objeto na lista
        livro.indisponibilizarLivro();
        System.out.println("Livro emprestado ✅");
    }

    public void devolverLivro(Livro livro) {
        this.livrosEmprestados.remove(livro); //remove remove um objeto da lista
        livro.disponibilizarLivro(); //agora eu deixo o livro disponivél após a devolução
        System.out.println("Livro devolvido ✅");

    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
}
