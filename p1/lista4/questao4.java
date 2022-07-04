package p1.lista4;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Digite o primeiro número");
        numero1 = in.nextInt();
        System.out.println("Digite o segundo número");
        numero2 = in.nextInt();
        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior que o número" + numero2);

        } else {
            System.out.println("O número " + numero2 + " é maior que o número " + numero1);
        }
        in.close();
    }

}
