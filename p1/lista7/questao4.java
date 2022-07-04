package p1.lista7;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1, n2, n3;
        System.out.println("Informe o número real 1");
        n1 = in.nextFloat();
        System.out.println("Informe o número real 2");
        n2 = in.nextFloat();
        System.out.println("Informe o número real 3");
        n3 = in.nextFloat();
        if (n1 != n2 && n2 != n3 && n1 != n3) {

            if (n1 > n2 && n1 > n3) {
                System.out.println("O número 1 é o maior");
                if (n2 > n1 && n2 > n3) {
                    System.out.println("O número 2 é o maior");
                }
                if (n3 > n1 && n3 > n2) {
                    System.out.println("O número 3 é o maior");
                }
            } else {
                System.out.println("Nao é possivel fazer a operacao pois os numeros precisam fazer diferente");
            }
            in.close();
        }

    }

}
