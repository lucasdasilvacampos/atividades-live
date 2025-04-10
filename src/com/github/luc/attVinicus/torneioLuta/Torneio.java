package com.github.luc.attVinicus.torneioLuta;

import java.util.ArrayList;

public class Torneio {
    ArrayList<Personagem> personagens;
    ArrayList<Personagem> personagensT;

    public Torneio() {
        personagens = new ArrayList<>();
        personagensT = new ArrayList<>();
    }

    public void cadastrarPersonagem(String nome, int forca) {
        Personagem p = new Personagem(nome, forca);
        personagens.add(p);
        System.out.println("PERSONAGEM CADASTRADO COM SUCESSO 👍🤠");
    }

    public void listarPersonagens() {
        if (personagens.isEmpty()) {
            System.out.println("NÃO TEM PERSONAGENS CADASTRADOS ❌");
            return;
        }
        System.out.println("---------------TODOS PERSONAGENS DISPONÍVEIS---------------");
        for (Personagem personagen : personagens) {
            if (personagen.getVida() > 0) {
                System.out.println((personagens.indexOf(personagen) + 1) + "- " + personagen);
            }
        }
    }

    public Personagem simularLuta(Personagem p1, Personagem p2) {
        boolean vencedor = false;
        Personagem atacante = p1;
        Personagem defensor = p2;

        while (!vencedor) {
            atacante.atacar(defensor);
            if (defensor.estarvivo()) {
                Personagem aux = atacante;
                atacante = defensor;
                defensor = aux;
            } else {
                vencedor = true;
                System.out.println("Vencedor foi: " + atacante);
                atacante.vencerLuta();
            }
        }
        return atacante;
    }

    public void listarRankDeVitoria() {
        for (Personagem personagen : personagens) {
            if (personagen.getVitorias() > 0) {
                System.out.println("Nome: " + personagen.getNome() + " Vitorias: " + personagen.getVitorias());
            }
        }

    }

    public void listarPersonagensMortos() {
        for (Personagem personagen : personagens) {
            if (personagen.getVida() <= 0) {
                System.out.println((personagens.indexOf(personagen) + 1) + "- " + "Nome: " + personagen.getNome());
            }

        }
    }

    public void reviverPersonagem(Personagem p) {
        if (!personagens.contains(p) && p.getVida() > 0) {
            return;
        }
        p.reviver();
        System.out.println("Personagem Revivido com Sucesso 👍🤠");
//        for (Personagem personagen : personagens) {
//            if (personagen.getVida() <= 0) {
//                personagen.reviver();
//                break;
//            }
//        }

    }

    public void cadastrarPersonagemT(String nome, int forca) {
        Personagem p = new Personagem(nome, forca);
        personagensT.add(p);
        System.out.println("PERSONAGEM CADASTRADO PARA O TORNEIO AUTOMÁTICO COM SUCESSO 👍🤠");
    }

    public void listarPersonagensT() {
        if (personagensT.isEmpty()) {
            System.out.println("NÃO TEM PERSONAGENS CADASTRADOS ❌");
            return;
        }
        System.out.println("---------------TODOS PERSONAGENS DISPONÍVEIS PARA O TORNEIO---------------");
        for (Personagem personagen : personagensT) {
            if (personagen.getVida() > 0) {
                System.out.println((personagensT.indexOf(personagen) + 1) + "- " + personagen);
            }
        }
    }

    public void simularLutaT(ArrayList<Personagem> personagens) {
        /*
        0 1 2 3 4 5
        0 2 5
        2 5
        5
         */
        int i = 0;
        while (personagens.size() > 1){
            if (i+1 >= personagens.size()){
                i = 0;
                continue;
            }
            Personagem p1 = personagens.get(i);
            Personagem p2 = personagens.get(i+1);
            Personagem vencedor = simularLuta(p1,p2);
            i++;
            if (vencedor == p1){
                personagens.remove(p2);
            }else {
                personagens.remove(p1);
            }

        }
        System.out.println("Vencendor do torneio foi: " + personagens.get(0));
    }


    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }

    public ArrayList<Personagem> getPersonagensT() {
        return personagensT;
    }
}


