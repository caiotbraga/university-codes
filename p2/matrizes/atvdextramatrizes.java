package p2.matrizes;

import java.util.Scanner;
import java.security.SecureRandom;

public class atvdextramatrizes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] tab = new int[5][5];
        preenchert(tab);
        exibirmatriz(tab);
        int t;
        int linha, coluna;
        int contbi = 0, contbo = 0;
        for (t = 0; t < 10; t++) {
            System.out.println("Informe a linha:");
            linha = in.nextInt();
            while (linha > 4) {
                System.out.println("Informe a linha:");
                linha = in.nextInt();
            }
            System.out.println("Informe a coluna:");
            coluna = in.nextInt();
            while (coluna > 4) {
                System.out.println("Informe a coluna:");
                coluna = in.nextInt();
            }
            if (tab[linha][coluna] == 0) {
                System.out.println("Nao encontrou nada!");
            }
            if (tab[linha][coluna] == 1) {
                System.out.println("Parabens, encontrou 1 bicicleta");
                contbi++;
            } else if (tab[linha][coluna] == 2) {
                System.out.println("Perdeu 1 vida");
                contbo++;
            }
            if (contbi == 5) {
                break;
            } else if (contbo == 5) {
                break;
            }
        }
        if (contbo == 5) {
            System.out.println("Você perdeu todas as 5 vidas.");
        } else if (contbi == 5) {
            System.out.println("Você ganhou uma bicicleta!");
        }
    }

    public static void preenchert(int m[][]) {
        int l1, l2, c1, c2;
        int i;
        for (i = 0; i < 5; i++) {
            l1 = sorteiaNumero();
            l2 = sorteiaNumero();
            c1 = sorteiaNumero();
            c2 = sorteiaNumero();

            while (m[l1][c1] != 0) {
                l1 = sorteiaNumero();
                c1 = sorteiaNumero();
            }

            m[l1][c2] = 1;

            while (m[l2][c2] != 0) {
                l2 = sorteiaNumero();
                c2 = sorteiaNumero();
            }

            m[l2][c2] = 2;
        }
    }

    public static int sorteiaNumero() {
        SecureRandom random = new SecureRandom();
        int numero = random.nextInt(5);
        return numero;
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
