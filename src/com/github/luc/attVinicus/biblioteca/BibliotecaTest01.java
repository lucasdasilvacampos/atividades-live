package com.github.luc.attVinicus.biblioteca;

import java.util.Scanner;

public class BibliotecaTest01 {
    static Scanner input = new Scanner(System.in);
    static Usuario usuario;

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        boolean rodando = true;
        do {
            System.out.println("BEM VINDO AO MENU");
            System.out.println("ESCOLHA UMA DAS OPÇÕES ABAIXO");
            System.out.println("DIGITE 1- CADASTRA-SE");
            System.out.println("DIGITE 2- CADASTRAR LIVRO");
            System.out.println("DIGITE 3- PEGAR LIVRO EMPRESTADO");
            System.out.println("DIGITE 4- DEVOLVER LIVRO");
            System.out.println("DIGITE 5- LISTAR LIVRO(S)");
            System.out.println("DIGITE 6- SAIR");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("DIGITE SEU NOME");
                    usuario = new Usuario(input.next());
                    biblioteca.cadastrarUsuario(usuario);
                    break;
                case 2:
                    System.out.println("DIGITE O NOME DO LIVRO E O AUTOR:");
                    Livro livro = new Livro(input.next(), input.next());
                    biblioteca.adicionarLivro(livro);
                    break;
                case 3:
                    System.out.println("DIGITE O TITULO DO LIVRO QUE DESEJA PEGAR EMPRESTADO E O NOME DO USUÁRIO:");

                    biblioteca.emprestarLivro(input.next(), input.next());
                    break;
                case 4:
                    System.out.println("DIGITE O TITULO DO LIVRO QUE DESEJA DEVOLVER:");
                    biblioteca.devolverLivro(input.next(), input.next());
                    break;
                case 5:
                    System.out.println("LISTA DOS LIVROS: ");
                    System.out.println(biblioteca.getLivros());
                    break;
                case 6:
                    rodando = false;
                    System.out.println("SAINDO DO PROGRAMA ‼");
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!");

            }

        } while (rodando);


    }
}
