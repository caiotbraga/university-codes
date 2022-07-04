package p1.lista5;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, x, delta, x1, x2;
        System.out.println("Informe o valor de A");
        a = in.nextDouble();
        System.out.println("Informe o valor de B");
        b = in.nextDouble();
        System.out.println("Informe o valor de C");
        c = in.nextDouble();
        delta = (Math.pow(b, 2)) - (4 * a * c);
        if (delta < 0) {
            System.out.println("Nao existe raiz real");
        }
        if (delta == 0) {
            x = -b / a;
            System.out.println("O valor de X é " + x);
        }
        if (delta > 0) {
            x1 = ((b * (-1)) + Math.sqrt(delta)) / 2 * a;
            x2 = ((b * (-1)) - Math.sqrt(delta)) / 2 * a;
            System.out.println("Os valor de x1 será " + x1 + "e de x2 " + x2);
        }
        in.close();
    }
}
