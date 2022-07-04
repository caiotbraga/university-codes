package p1.lista4;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ano;
        double preco, valorT;
        System.out.println("Informe o ano");
        ano = in.nextInt();
        System.out.println("Informe o valor do carro");
        preco = in.nextDouble();
        if (ano < 2000) {
            valorT = preco + (preco * 0.01);
            System.out.println("O valor da transferencia será de " + valorT);
        } else {
            valorT = preco + (preco * 0.015);
            System.out.println("O valor da transferencia será de " + valorT);
        }
        in.close();
    }

}
