package p2.vetores;

import java.util.Scanner;

public class atvdm {
    public static void main(String[] args) {
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        exibev(A);
        preencherv(A);
        exibev(A);
        exibev(B);
        preencherv(B);
        exibev(B);
        C = somarv(A, B);
        exibev(C);
    }

    public static void exibev(int[] vet) {
        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.println(vet[i] + " ");
        }
    }

    public static void preencherv(int[] vet) {
        int i;
        Scanner in = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            System.out.println("Informe o valor:");
            vet[i] = in.nextInt();
            in.close();
        }

    }

    public static int[] somarv(int[] A, int[] B) {
        int i;
        int[] C = new int[5];
        for (i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }
        return C;
    }
}
