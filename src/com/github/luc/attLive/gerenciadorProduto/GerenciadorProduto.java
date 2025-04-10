package com.github.luc.attLive.gerenciadorProduto;
/*
Cadastrar produto
Listar todos os produtos
Buscar produto por id
Atualizar quantidade de um produto (entrada ou saída de estoque)
Calcular valor total do estoque
Sair
 */
import java.util.ArrayList;

public class GerenciadorProduto {
    ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        if (!(produto.getPreco() < 0) && !(produto.getQuantidade() < 0)) {
            produtos.add(produto);
            System.out.println("Produto adicionado com sucesso!");
            return;
        }
        System.out.println("Valor ou quantidade inválida");

    }

    public void listarProduto() {

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

    }

    public void bucarProduto(int idProduto) {
        idProduto -= 1;
        if (produtos.get(idProduto) != null) {
            System.out.println(produtos.get(idProduto));
            return;
        }


    }

    public void atualizarProduto(int idProduto, int novaQuantidade) {
        if (novaQuantidade < 0) {
            System.out.println("Quantidade inválida");
            return;
        }
        for (Produto produto : produtos) {
            idProduto -= 1;
            if (produtos.get(idProduto) != null) {
                produto.setQuantidade(novaQuantidade);
                System.out.println("Produto atualizado, com sucesso!");
                break;
            }


        }

    }

    public void calcularQuantidadeProdutos() {
        int soma = 0;
        for (Produto produto : produtos) {
            soma += produto.getQuantidade();
        }
        System.out.println("Valor total do estoque de todos produtos: " + soma);
    }


    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
