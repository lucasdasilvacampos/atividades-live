package com.github.luc.codigosAvussos;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int f1 = 0;
        int f2 = 1;

        System.out.print(f1 + " " + f2);
        for (int i = 2; i < n; i++) {
            int f3 = f1 + f2;
            System.out.print(" " + f3);
            f1 = f2;
            f2 = f3;
        }

        System.out.println("Fim da sequência");
        
    }
}
