package p1.lista14;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a, b, c;
        char resp;

        do {
            System.out.print("Informe o valor de a:");
            a = in.nextDouble();
            in.nextLine();
            System.out.print("Informe o valor de b:");
            b = in.nextDouble();
            in.nextLine();
            System.out.print("Informe o valor de c:");
            c = in.nextDouble();
            in.nextLine();
            raizes(a, b, c);
            System.out.println("Deseja calcular outros valores?Digite 's' para sim e 'n' para nao");
            resp = in.next().charAt(0);
            in.nextLine();
        } while (resp == 's');
        in.close();
    }

    public static void raizes(double a, double b, double c) {
        double x1, x2, d;
        d = delta(a, b, c);
        if (d == 0) {
            x1 = -b + Math.sqrt(d) / (2 * a);
            System.out.printf("Só existe uma raiz da equacao de valor: %2.f", x1);
        } else if (d < 0) {
            System.out.println("Nao existe raiz real");
        }
        if (d > 0) {
            x1 = -b + Math.sqrt(d) / (2 * a);
            x2 = -b - Math.sqrt(d) / (2 * a);
            System.out.printf("As raizes da equacao sao: %.2f e %.2f", x1, x2);
        }
    }

    public static double delta(double a, double b, double c) {
        double d;
        d = Math.pow(b, 2) - 4 * a * c;
        return d;
    }

}
