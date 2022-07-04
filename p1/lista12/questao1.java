package p1.lista12;

import java.util.Scanner;

public class questao1 {
    public static double conversaoR(double real) {
        double dolar;
        dolar = real / 5.60;
        return dolar;
    }

    public static double conversaoD(double dolar) {
        double real;
        real = dolar * 5.60;
        return real;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double r, d;
        char resp;

        System.out.println(
                "Qual conversao voce deseja fazer? dolar para real = digite 'd' ou real para dolar = digite 'r'");
        resp = in.next().charAt(0);
        if (resp == 'd') {
            System.out.println("Informe o valor em dolar");
            d = in.nextDouble();
            r = conversaoD(d);
            System.out.printf("%.2f dolares sao %.2f reais \n", d, r);
        } else if (resp == 'r') {
            System.out.println("Informe o valor em real");
            r = in.nextDouble();
            d = conversaoR(r);
            System.out.printf("%.2f reais sao %.2f dolaers \n", r, d);
        }
        in.close();
    }

}
