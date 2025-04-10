package com.github.luc.attLive.gerenciadorProduto;
/*
Cadastrar produto
Listar todos os produtos
Buscar produto por id
Atualizar quantidade de um produto (entrada ou saída de estoque)
Calcular valor total do estoque
Sair
 */

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private int id;
    private static int contador;
{
    id=++contador;
}

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", id=" + id +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
