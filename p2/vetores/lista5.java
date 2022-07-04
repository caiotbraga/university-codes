package p2.vetores;

import java.util.Scanner;

public class lista5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[] A = new boolean[12];
        boolean[] B = new boolean[12];
        boolean[] C = new boolean[12];
        boolean[] D = new boolean[12];
        int resp;

        menu();
        resp = in.nextInt();
        if (resp == 1) {
            exibirlugares(B, D);
        }

    }

    public static void menu() {
        System.out.println("VENDA DE PASSAGEM VIAGE BEM");
        System.out.println("Informe a poltrona");
        System.out.println("1- corredor");
        System.out.println("2- janela");
    }

    public static void exibirlugares(boolean[] f1, boolean[] f2) {
        int i;
        for (i = 0; i < f1.length; i++) {
            System.out.println(f1[i] + " ");
            System.out.println(f2[i] + " ");
        }
    }
}
