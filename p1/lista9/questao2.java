package p1.lista9;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade, total, g1, g2;
        double peso, altura, media, somaA, percentual;

        total = 0;
        g1 = 0;
        somaA = 0;
        g2 = 0;

        while (total != 3) {
            total = total + 1;
            System.out.println("Informe a idade");
            idade = in.nextInt();

            System.out.println("Informe a altura");
            altura = in.nextDouble();

            System.out.println("Informe o peso");
            peso = in.nextDouble();

            while (idade < 0 || idade > 120) {
                System.out.print("Idade invalida, por favor digite novamente no intervalo de 1-120:");
                idade = in.nextInt();
            }

            while (altura < 0.5 && altura > 3.0) {
                System.out.print("Altura invalida, por favor digite novamente no intervalo de 0,5-3,0:");
                altura = in.nextDouble();
            }

            while (peso < 2 && peso > 300) {
                System.out.print("Peso invalido, por favor digite novamente no intervalo de 2-300:");
                peso = in.nextDouble();
            }
            if (idade < 30 && peso > 80) {
                g1 = g1 + 1;
            } else if (idade <= 10 && idade >= 15) {
                somaA = somaA + altura;
                g2 = g2 + 1;
            }
        }
        media = somaA / g2;

        percentual = 100 * g1 / total;

        System.out.println("O percentual de pessoas com a idade abaixo de 30 anos e peso maior que 80kg foi de: "
                + percentual + "%");
        System.out.println("A media das alturas das pessoas com idade entre 10 e 15 foi de:" + media);
        in.close();
    }

}
