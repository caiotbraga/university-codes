package p2.matrizes;

import java.util.Scanner;

public class matrizes2 {
    public static void main(String[] args) {
        char[][] gabarito = new char[1][10];
        char[][] respostas = new char[3][10];
        String[] nomes = new String[3];
        int[] acertos = new int[10];
        pgabarito(gabarito);
        pdadosalunos(nomes, respostas);
        nacertos(nomes, respostas, gabarito, acertos);
        aprovacao(nomes, respostas, acertos);
    }

    public static void pgabarito(char[][] gab) {
        Scanner in = new Scanner(System.in);
        int c, l, taml = gab.length;
        int tamc = gab[0].length;
        for (l = 0; l < taml; l++) {
            for (c = 0; c < tamc; c++) {
                System.out.println("Informe o gabarito da questao " + (c + 1));
                gab[l][c] = in.next().charAt(0);
                while (gab[l][c] != 'a' && gab[l][c] != 'b' && gab[l][c] != 'c' && gab[l][c] != 'd'
                        && gab[l][c] != 'e') {
                    System.out.println("GABARITO INVALIDO!");
                    System.out.println("Informe o gabarito novamente! (a/b/c/d/e)");
                    gab[l][c] = in.next().charAt(0);
                }
            }
        }

    }

    public static void pdadosalunos(String[] nome, char[][] resp) {
        Scanner in = new Scanner(System.in);
        int l, c;
        int taml = resp.length;
        int tamc = resp[0].length;
        for (l = 0; l < taml; l++) {
            System.out.println("Informe o nome do aluno:");
            nome[l] = in.nextLine();
            for (c = 0; c < tamc; c++) {
                System.out.println("Informe o gabarito da questao " + (c + 1) + " do aluno " + nome[l]);
                resp[l][c] = in.next().charAt(0);
            }
        }
    }

    public static void nacertos(String[] nome, char[][] resp, char[][] gab, int[] acertos) {
        int l, c;
        int taml = resp.length;
        int tamc = resp[0].length;
        for (l = 0; l < taml; l++) {
            for (c = 0; c < tamc; c++) {
                if (gab[0][c] == resp[l][c]) {
                    acertos[l]++;
                }
                System.out.println("O aluno " + nome[l] + " teve " + acertos[l] + " acertos");
            }
        }
    }

    public static void aprovacao(String[] nome, char[][] resp, int[] acertos) {
        int l, c;
        int taml = resp.length;
        int tamc = resp[0].length;
        for (l = 0; l < taml; l++) {
            for (c = 0; c < tamc; c++) {
                if (acertos[l] >= 7) {
                    System.out.println("O aluno " + nome[l] + " foi aprovado");
                }
            }
        }
    }

}
