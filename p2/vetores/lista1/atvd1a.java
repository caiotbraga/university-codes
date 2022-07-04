package p2.vetores.lista1;

import java.util.Scanner;

public class atvd1a {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int i;
            int[] A = new int[5];
            System.out.println("Preenchimento do vetor A");
            for (i = 0; i < 5; i++) {
                System.out.println(A[i] + " ");
            }
            for (i = 0; i < 5; i++) {
                System.out.println("Informe o numeros inteiros:");
                A[i] = in.nextInt();
            }
            for (i = 0; i < 5; i++) {
                System.out.println(A[i] + " ");
            }
            int[] B = new int[5];
            System.out.println("Preenchimento do vetor B");
            for (i = 0; i < 5; i++) {
                System.out.println(B[i] + " ");
            }
            for (i = 0; i < 5; i++) {
                System.out.print("Informe o numeros inteiros");
                B[i] = in.nextInt();
            }
            for (i = 0; i < 5; i++) {
                System.out.println(B[i] + " ");
            }
            int[] C = new int[5];
            C[0] = A[0] + B[0];
            C[1] = A[1] + B[1];
            C[2] = A[2] + B[2];
            C[3] = A[3] + B[3];
            C[4] = A[4] + B[4];
            for (i = 0; i < 5; i++) {
                System.out.print(C[i] + " ");
            }
        }
    }
}