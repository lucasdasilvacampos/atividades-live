package com.github.luc.attVinicus.herancaPessoa;

import java.util.Scanner;

public class EscolaTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno aluno;
        Professor professor;
        Escola escola = new Escola();

        boolean rodando = true;
        do {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1- Cadastrar Aluno");
            System.out.println("2- Cadastrar Professor");
            System.out.println("3- Listar Pessoas Cadastradas");
            System.out.println("4- Sair");
            System.out.println("Digite uma opção:");
            System.out.flush();
            int opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite um nome:");
                    System.out.flush();
                    String nomeA = input.next();
                    System.out.println("Digite a idade:");
                    System.out.flush();
                    int idadeA = input.nextInt();
                    System.out.println("Digite a matricula:");
                    System.out.flush();
                    String matriculaA = input.next();
                    aluno = new Aluno(nomeA, idadeA, matriculaA);
                    escola.adicionarPessoa(aluno);
                    break;
                case 2:
                    System.out.println("Digite um nome:");
                    System.out.flush();
                    String nomeP = input.next();
                    System.out.println("Digite a idade:");
                    System.out.flush();
                    int idadeP = input.nextInt();
                    System.out.println("Digite a disciplina:");
                    System.out.flush();
                    String disciplinaP = input.next();
                    professor = new Professor(nomeP, idadeP, disciplinaP);
                    escola.adicionarPessoa(professor);
                    break;
                case 3:
                    escola.listarPessoas();
                    break;
                case 4:
                    rodando = false;
                    System.out.println("Fechando Sistema...❌");
                    break;
                default:
                    System.out.println("Opção inválida, verifique a opção escolhida ❌");
                    break;
            }

        } while (rodando);


    }
}
