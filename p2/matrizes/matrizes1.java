package p2.matrizes;

import java.util.Scanner;

public class matrizes1 {
    public static void main(String[] args) {
        int[][] A = new int[3][4];
        int[][] B = new int[3][4];
        int[][] C = new int[3][4];
        System.out.println("Preenchimento da matriz A");
        preencher(A);
        System.out.println("Preenchimento da matriz B");
        preencher(B);
        C = somamatriz(A, B);
        exibirmatriz(C);
    }

    public static void preencher(int[][] matriz) {
        Scanner in = new Scanner(System.in);
        int c, l;
        int taml = matriz.length;
        int tamc = matriz[0].length;
        for (l = 0; l < taml; l++) {
            for (c = 0; c < tamc; c++) {
                System.out.println("Informe o valor na posicao[" + l + "] [" + c + "]");
                matriz[l][c] = in.nextInt();
            }
        }
    }

    public static int[][] somamatriz(int[][] ma, int[][] mb) {
        int c, l;
        int taml = ma.length;
        int tamc = ma[0].length;
        int mc[][] = new int[3][4];
        for (l = 0; l < taml; l++) {
            for (c = 0; c < tamc; c++) {
                mc[l][c] = ma[l][c] + mb[l][c];
            }
        }
        return mc;
    }

    public static void exibirmatriz(int mc[][]) {
        int c, l;
        int taml = mc.length;
        int tamc = mc[0].length;
        for (l = 0; l < taml; l++) {
            System.out.println("");
            for (c = 0; c < tamc; c++) {
                System.out.print(mc[l][c] + " ");
            }
        }
    }
}
