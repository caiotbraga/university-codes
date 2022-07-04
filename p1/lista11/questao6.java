package p1.lista11;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, num, soma;

        soma = 0;

        System.out.println("Quantos numeros serao somados?");
        n = in.nextInt();
        while (n < 0) {
            System.out.println("Quantidade invalida, por favor digite novamente um valor maior que 0");
            n = in.nextInt();
        }
        for (num = 1; num <= n; num = num + 1) {
            soma = soma + num;
            in.close();
        }
        System.out.print("A soma dos primeiros numeros inteiros maiores que 0 até " + n + " é de " + soma);
    }
}
