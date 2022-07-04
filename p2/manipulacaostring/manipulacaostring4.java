package p2.manipulacaostring;

import java.util.Scanner;

public class manipulacaostring4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        int i, tam = 0, x;
        System.out.println("Digite um nome");
        nome = in.nextLine();
        tam = nome.length();
        for (i = 0; i < tam; i++) {
            x = nome.charAt(i);
            x = Character.toLowerCase(x);
            while (' ' != x && Character.isLetter(x) == false) {
                System.out.println("Nome invalido! Digite um nome novamente");
                nome = in.nextLine();
            }
        }
        System.out.println("Ola " + nome + ", prazer em te conhecer!");

    }
}
