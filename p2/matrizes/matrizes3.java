package p2.matrizes;

import java.util.Scanner;

public class matrizes3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int o;
        System.out.println("Qual a ordem da matriz que você deseja trabalhar?");
        o = in.nextInt();
        int[][] matriz = new int[o][o];
        boolean simetrica = false;
        pmatriz(matriz);
        simetrica = matrizs(matriz);
        exibirmatriz(matriz);
        if (simetrica = true) {
            System.out.println("A matriz é simetrica");
        } else {
            System.out.println("A matriz não é simetrica");
        }

    }

    public static void pmatriz(int[][] m) {
        Scanner in = new Scanner(System.in);
        int l, c;
        int taml = m.length;
        int tamc = m[0].length;
        for (l = 0; l < taml; l++) {
            for (c = 0; c < tamc; c++) {
                System.out.println("Informe o valor do elemento: [" + l + "] [" + c + "]");
                m[l][c] = in.nextInt();
            }
        }
    }

    public static boolean matrizs(int[][] m) {
        int l, c;
        int taml = m.length;
        int tamc = m[0].length;
        int[][] transposta = new int[tamc][taml];
        boolean simetrica = false;
        for (l = 0; l < taml; l++) {
            for (c = 0; c < tamc; c++) {
                if (m[l][c] == transposta[c][l]) {
                    simetrica = true;
                } else {
                    simetrica = false;
                    break;
                }
            }
        }
        return simetrica;

    }

    public static void exibirmatriz(int m[][]) {
        int c, l;
        int taml = m.length;
        int tamc = m[0].length;
        for (l = 0; l < taml; l++) {
            System.out.println("");
            for (c = 0; c < tamc; c++) {
                System.out.print(m[l][c] + " ");
            }
        }
        System.out.println(" ");
    }

}
