package com.github.luc.attVinicus.torneioLuta;

public class Personagem {
    private String nome;
    private int forca;
    private int vida;
    private int vitorias;
    private boolean estavivo = true;

    {
        this.vida = 100;
    }

    public void vencerLuta(){
        this.vitorias += 1;
    }

    public void reviver(){
        this.vida = 100;
    }

    public Personagem(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
    }

    public Personagem() {
        this.nome = "Desconhecido";
        this.forca = 10;
    }


    public void atacar(Personagem oponente) {
        oponente.receberDano(this.forca);
    }

    public void receberDano(int dano) {
        this.vida -= dano;

    }

    public boolean estarvivo() {
        return this.vida > 0;
    }


    @Override
    public String toString() {
        return
                "Nome= " + nome +
                " Forca= " + forca +
                " Vida= " + vida +
                ' ';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getVida() {
        return vida;
    }
}
