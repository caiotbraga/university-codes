package p1.lista6;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double consumo, valor;
        System.out.println("Informe o consumo em quilowatts");
        consumo = in.nextDouble();
        if (consumo < 10) {
            valor = 7 + consumo + 3.50;
            System.out.print("O valor da conta será " + valor);
        } else {
            valor = 1.40 + consumo + 3.50;
            System.out.println("O valor da conta será " + valor);
        }
        in.close();
    }
}
