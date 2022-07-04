package p2.vetores.lista1;

import java.util.Scanner;

public class atvd1b {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double[] VET = new double[3];
            int i;
            for (i = 0; i < VET.length; i++) {
                System.out.print("Informe um valor:");
                VET[i] = in.nextDouble();
            }
            double soma = 0;
            for (i = 0; i < VET.length; i++) {
                soma = soma + VET[i];
            }
            System.out.print(soma);
        }

    }
}
