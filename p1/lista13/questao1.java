package p1.lista13;

import java.util.Scanner;

public class questao1 {
    public static double volumecu(double l) {
        double v;
        v = Math.pow(l, 3);
        return v;
    }

    public static double volumep(double h, double l, double c) {
        double v;
        v = h * l * c;
        return v;
    }

    public static double volumee(double r) {
        double v;
        v = Math.pow(r, 3) * Math.PI * 4.0 / 3;
        return v;
    }

    public static double volumeci(double r, double h) {
        double v;
        v = Math.pow(r, 2) * 3 * h;
        return v;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int resp;
        double volume, lado, altura, largura, comprimento, raio;
        char resposta;

        do {
            System.out.println("O que voce deseja calcular ?");
            System.out.println("1: volume do cubo");
            System.out.println("2: volume do paralelepipedo");
            System.out.println("3: volume da esfera");
            System.out.println("4: volume do cilindro");
            resp = in.nextInt();
            if (resp == 1) {
                System.out.println("Informe o valor do lado do cubo");
                lado = in.nextDouble();
                volume = volumecu(lado);
                System.out.printf("O valor do volume do cubo é: %.2f \n", volume);
            } else if (resp == 2) {
                System.out.println("Informe o valor da altura do paralelepipedo");
                altura = in.nextDouble();
                System.out.println("Informe o valor do comprimento do paralelepipedo");
                comprimento = in.nextDouble();
                System.out.println("Informe o valor da largura do paralelepipedo");
                largura = in.nextDouble();
                volume = volumep(altura, largura, comprimento);
                System.out.printf("O valor do volume do paralelepipedo é: %.2f \n", volume);
            } else if (resp == 3) {
                System.out.println("Informe o valor do raio da esfera");
                raio = in.nextDouble();
                volume = volumee(raio);
                System.out.printf("O valor do volume da esfera é: %.2f \n", volume);
            } else if (resp == 4) {
                System.out.println("Informe o valor do raio do cilindro");
                raio = in.nextDouble();
                System.out.println("Informe o valor da altura do cilindro");
                altura = in.nextDouble();
                volume = volumeci(raio, altura);
                System.out.printf("O valor do volume do cilindro é: %.2f \n", volume);
            }
            System.out.println("Deseja calcular mais algum volume? Digite 's' para sim e 'n' para nao");
            resposta = in.next().charAt(0);
        } while (resposta == 's');
        in.close();
    }
}
