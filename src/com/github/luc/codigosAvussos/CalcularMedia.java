package com.github.luc.codigosAvussos;

import java.util.ArrayList;
import java.util.Scanner;

/*
Peça ao usuário para informar quantas notas deseja inserir.
Leia as notas e armazene-as em um array.
Calcule e exiba a média das notas.
Crie um metodo que recebe o array de notas e retorna a média.
 */
public class CalcularMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira suas notas: ");
        int[] notas = new int[]{input.nextInt(),input.nextInt(),input.nextInt()};
        int media = 0;
        for (int nota : notas) {
            if(nota <= 0){
                return;
            }
            media+= nota;
        }
        media = media / notas.length;
        System.out.println("Sua media é: "+media);

    }
}
