package com.github.luc.attLive.gerenciadorProduto;
/*
Cadastrar produto
Listar todos os produtos
Buscar produto por id
Atualizar quantidade de um produto (entrada ou saída de estoque)
Calcular valor total do estoque
Sair
 */

import java.util.Scanner;

public class SistemaMercadoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto produto;
        GerenciadorProduto gerenciador = new GerenciadorProduto();

        boolean rodando = true;
        do {
            System.out.println("Menu");
            System.out.println("Escolha uma das opções abaixo");
            System.out.println("1- Cadastrar produto");
            System.out.println("2- Buscar produto por id");
            System.out.println("3- Atualizar quantidade de um produto");
            System.out.println("4- Calcular valor total do estoque");
            System.out.println("5- Listar Todos Produtos");
            System.out.println("6- Sair");
            int opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite nome, preço e quantidade do produto:");
                    System.out.println("Nome produto:");
                    String nome = input.next();
                    System.out.println("Preço produto:");
                    double preco = input.nextDouble();
                    System.out.println("Quantidade produto:");
                    int quantidade = input.nextInt();
                    produto = new Produto(nome, preco, quantidade);
                    gerenciador.cadastrarProduto(produto);
                    break;

                case 2:
                    System.out.println("Digite o id do produto:");
                    int idProduto = input.nextInt();
                    gerenciador.bucarProduto(idProduto);
                    break;

                case 3:
                    System.out.println("Você deseja adicionar(+) ou remover(-)?");
                    char resposta = input.next().charAt(0);
                    System.out.println("Digite o id do produto que deseja atualizar:");
                    int idP = input.nextInt();
                    System.out.println("Digite a nova quantidade:");
                    int novaQuantidade = input.nextInt();
                    gerenciador.atualizarProduto(idP, novaQuantidade);
                    break;
                case 4:
                    gerenciador.calcularQuantidadeProdutos();
                    break;

                case 5:
                    gerenciador.listarProduto();
                    break;
                case 6:
                    rodando = false;
                    System.out.println("Saindo do programa...⭕");
                    break;
                default:
                    System.out.println("Opção inválida, verifique a opção digitada!");

            }

        } while (rodando);


    }
}
