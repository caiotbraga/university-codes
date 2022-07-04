package p2.manipulacaostring;

import java.util.Scanner;

public class manipulacaostring6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sequencia1, sequencia2;
        boolean retorno;
        System.out.println("Informe a primeira sequencia de caracteres");
        sequencia1 = in.next();
        System.out.println("Informe a segunda sequencia de caracteres");
        sequencia2 = in.next();
        retorno = comparar(sequencia1, sequencia2);
        if (retorno == true) {
            System.out.println("As palavras sao iguais");
        } else {
            System.out.println("As palavras sao diferentes");
        }
    }

    public static boolean comparar(String s1, String s2) {
        char l1, l2;
        int i, tam;
        boolean igual = false;
        tam = s1.length();
        for (i = 0; i < tam; i++) {
            l1 = s1.charAt(i);
            l2 = s2.charAt(i);
            if (l1 == l2) {
                igual = true;
            } else {
                igual = false;
            }
        }
        return igual;

    }
}
