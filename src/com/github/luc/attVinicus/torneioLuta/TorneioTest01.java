package com.github.luc.attVinicus.torneioLuta;

import java.util.ArrayList;
import java.util.Scanner;

public class TorneioTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Torneio torneio = new Torneio();
        boolean rodando = true;
        do {
            System.out.println("BEM VINDO AO TORNEIO ⚔");
            System.out.println("O QUE DESEJA FAZER? 📋");
            System.out.println("1-CADASTRAR PERSONAGEM");
            System.out.println("2-LISTAR PERSONAGENS");
            System.out.println("3-SIMULAR LUTA");
            System.out.println("4-LISTAR RANK DE VITORIAS");
            System.out.println("5-REVIVER PERSONAGEM");
            System.out.println("----------------------------------");
            System.out.println("TORNEIO AUTOMÁTICO");
            System.out.println("6-CADASTRAR PERSONAGEM PARA TORNEIO");
            System.out.println("7-SIMULAR TORNEIO MATA-MATA");
            System.out.println("8-SAIR");
            int opcao = input.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("DIGITE O NOME:");
                    String nomeP = input.next();
                    System.out.println("DIGITE A FORÇA PERSONAGEM:");
                    int forcaP = input.nextInt();
                    torneio.cadastrarPersonagem(nomeP, forcaP);
                    break;
                case 2:
                    System.out.println("LISTA DOS PERSONAGENS:");
                    torneio.listarPersonagens();
                    break;
                case 3:
                    if (torneio.getPersonagens().size() < 2){
                        System.out.println("PARA SILMULAR UMA LUTA É NECESSÁRIO 2 PERSONAGENS CADASTRADO ❌");
                        break;
                    }
                    torneio.listarPersonagens();
                    System.out.println("QUAIS PERSONAGENS DESEJA SIMULAR LUTA?");
                    int p1 = input.nextInt();
                    int p2 = input.nextInt();

                    Personagem player1 = torneio.getPersonagens().get(p1-1);
                    Personagem player2 = torneio.getPersonagens().get(p2-1);

                    torneio.simularLuta(player1,player2);
                    break;
                case 4:
                    torneio.listarRankDeVitoria();
                    break;
                case 5:
                    torneio.listarPersonagensMortos();
                    System.out.println("Qual personagem deseja reviver?");
                    int r1 = input.nextInt();
                    Personagem pReviver = torneio.getPersonagens().get(r1 - 1);
                    torneio.reviverPersonagem(pReviver);
                    break;

                case 6:
                    System.out.println("DIGITE O NOME:");
                    String nomePt = input.next();
                    System.out.println("DIGITE A FORÇA PERSONAGEM:");
                    int forcaPt = input.nextInt();
                    torneio.cadastrarPersonagemT(nomePt, forcaPt);
                    break;

                case 7:
                    if (torneio.getPersonagensT().size() < 4){
                        System.out.println("PARA SILMULAR UMA LUTA É NECESSÁRIO 4 PERSONAGENS CADASTRADO ❌");
                        break;
                    }
                    torneio.listarPersonagensT();
                    System.out.println("QUANTOS PERSONAGENS DESEJA SIMULAR LUTA?");
                    int quantidade = input.nextInt();
                    System.out.println("DIGITE O NUMERO DOS PERSONAGENS:");
                    ArrayList <Personagem> lista = new ArrayList<>();
                    for (int i = 0; i < quantidade; i++) {
                        lista.add(torneio.getPersonagensT().get(input.nextInt() - 1));
                    }
                    torneio.simularLutaT(lista);
                    break;
                case 8:
                    rodando = false;
                    System.out.println("Fechando o torneio!");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE!");
            }

        }while (rodando);



    }
}
