package p1.lista4;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A, B, X;
        System.out.println("Digite o valor de A");
        A = in.nextDouble();
        while (A == 0) {
            System.out.println("O valor de A nao pode ser 0");
            A = in.nextDouble();
        }
        System.out.println("Digite o valor de B");
        B = in.nextDouble();
        X = -B / A;
        System.out.println("O valor de X é de " + X);
        in.close();

    }

}
