package p1.lista10;

import java.util.Scanner;

public class questaounica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, cont, cont30;
        double temp, media, maior, menor, soma;

        cont = 0;
        maior = Double.MIN_VALUE;
        menor = Double.MAX_VALUE;
        soma = 0;
        cont30 = 0;

        System.out.println("Quantas temperaturas foram coletadas hoje?");
        n = in.nextInt();

        while (n < 5) {
            System.out.println("Numero de temperaturas invalida.Informe um valor maior ou igual a 5.");
            n = in.nextInt();
        }
        while (cont < n) {
            System.out.print("Informe a temperatura " + cont + ":");
            temp = in.nextDouble();
            while (temp < -40 || temp > 60) {
                System.out.print("Temperatura invalida, por favor informe a temperatura " + cont + " novamente:");
                temp = in.nextDouble();
            }
            if (temp > 30) {
                cont30 = cont30 + 1;
            }
            soma = soma + temp;
            if (temp > maior) {
                temp = maior;
            } else if (temp < menor) {
                temp = menor;
            }
        }
        media = soma / n;
        System.out.println("A maior temperatura registrada foi de " + maior);
        System.out.println("A menor temperatura registrada foi de " + menor);
        System.out.println("A temperatura media registrada foi de " + media);
        System.out.printf("A temperatura media registrada foi de %.2f \n", media);
        in.close();
    }

}
