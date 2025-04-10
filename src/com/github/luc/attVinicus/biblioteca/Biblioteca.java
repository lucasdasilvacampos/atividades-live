package com.github.luc.attVinicus.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();


    public void adicionarLivro(Livro livro) {
        if (this.livros.contains(livro)) { //contains retorna um boolean(verdadeiro
            System.out.println("Esse livro já existe ❌");
            return;
        }
        this.livros.add(livro);
        System.out.println("Livro Adicionado ✅");
    }

    public void cadastrarUsuario(Usuario usuario) {
        if (this.usuarios.contains(usuario)) {
            System.out.println("Já existe usuário cadastrado ❌");
            return;
        }
        this.usuarios.add(usuario);
        System.out.println("Usuario cadastrado ✅");
    }


    public void emprestarLivro(String titulo, String nome) {
        boolean userExist = usuarios.stream().anyMatch(usuario -> usuario.getNome().equalsIgnoreCase(nome));
        if (userExist) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isDisponivel()) {
                    for (Usuario usuario : usuarios) {
                        if (usuario.getNome().equalsIgnoreCase(nome)) {
                            usuario.pegarEmprestado(livro);
                            break;
                        }
                    }

                } else {
                    System.out.println("Livro não disponível ❌");
                }
            }
        } else {
            System.out.println("Usuario não encontrado ❌");
        }
    }


    public void devolverLivro(String titulo, String nome) {
        boolean userExist = usuarios.stream().anyMatch(usuario -> usuario.getNome().equalsIgnoreCase(nome));
        if (userExist) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo) && !livro.isDisponivel()) {
                    for (Usuario usuario : usuarios) {
                        if (usuario.getNome().equalsIgnoreCase(nome)) {
                            usuario.devolverLivro(livro);
                            break;
                        }
                    }
                } else {
                    System.out.println("Livro não existe ❌");
                }

            }
        } else {
            System.out.println("Usuário não encontrado ❌");
        }
    }


    public ArrayList<Livro> getLivros() {
        return livros;
    }
}
