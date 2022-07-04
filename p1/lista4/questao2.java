package p1.lista4;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        System.out.println("Digite o número");
        numero = in.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é impar");
        }
        in.close();
    }
}
