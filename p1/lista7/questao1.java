package p1.lista7;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n;
        System.out.println("Informe um número de 1 a 9");
        n = in.nextFloat();
        if (n < 1 || n > 9) {
            System.out.println("O valor não está dentro da faixa permitida.");
        } else {
            System.out.println("O valor está dentro da faixa permitida.");
        }
        in.close();
    }

}
