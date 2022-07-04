package p1.lista2;

import java.util.Scanner;

public class lista2c {
    public static void main(String[] args) {
        double[] vetGanhos = new double[12];
        double[] vetGastos = new double[12];
        double[] vetLucros = new double[12];
        double totalg, totalgt, totalL, mediaL;

        preenchervg(vetGanhos);
        exibirg(vetGanhos);
        preenchervgt(vetGastos);
        exibirgt(vetGastos);
        vetLucros = calcularL(vetGanhos, vetGastos);
        exibirL(vetLucros);
        totalg = totalg(vetGanhos);
        exibirtotalg(totalg);
        totalgt = totalgt(vetGastos);
        exibirtotalgt(totalgt);
        totalL = totalL(vetLucros);
        exibirtotalLucro(totalL);
        mediaL = medialucro(vetLucros);
        exibirmedialucro(mediaL);

    }

    public static void preenchervg(double[] vet) {
        int i;
        Scanner in = new Scanner(System.in);
        for (i = 0; i < vet.length; i++) {
            System.out.println("Informe o valor do ganho do mes " + (i + 1) + ":");
            vet[i] = in.nextDouble();
        }
    }

    public static void preenchervgt(double[] vet) {
        int i;
        Scanner in = new Scanner(System.in);
        for (i = 0; i < vet.length; i++) {
            System.out.println("Informe o valor do gasto do mes " + (i + 1) + ":");
            vet[i] = in.nextDouble();
        }
    }

    public static void exibirg(double[] vet) {
        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.println("O valor de ganho no mes " + (i + 1) + " foi de " + vet[i] + " reais");
        }
    }

    public static void exibirgt(double[] vet) {
        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.println("O valor de gastos no mes " + (i + 1) + " foi de " + vet[i] + " reais");
        }
    }

    public static double[] calcularL(double[] G, double[] GT) {
        int i;
        double[] L = new double[12];
        for (i = 0; i < L.length; i++) {
            L[i] = G[i] - GT[i];
        }
        return L;
    }

    public static void exibirL(double[] vet) {
        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.println("O valor do lucro no mes " + (i + 1) + " foi de " + vet[i] + " reais");
        }
    }

    public static double totalg(double[] vet) {
        int i;
        double soma = 0;
        for (i = 0; i < vet.length; i++) {
            soma = vet[i] + soma;
        }
        return soma;
    }

    public static void exibirtotalg(double ganhos) {
        System.out.println("O total de ganhos foi de: " + ganhos + " reais");
    }

    public static double totalgt(double[] vet) {
        int i;
        double soma = 0;
        for (i = 0; i < vet.length; i++) {
            soma = vet[i] + soma;
        }
        return soma;
    }

    public static void exibirtotalgt(double gastos) {
        System.out.println("O total de gastos foi de: " + gastos + " reais");
    }

    public static double totalL(double[] vet) {
        int i;
        double soma = 0;
        for (i = 0; i < vet.length; i++) {
            soma = vet[i] + soma;
        }
        return soma;
    }

    public static void exibirtotalLucro(double lucros) {
        System.out.println("O total do lucro foi de: " + lucros + " reais");
    }

    public static double medialucro(double[] vet) {
        int i;
        double soma = 0, media;
        for (i = 0; i < vet.length; i++) {
            soma = soma + vet[i];
        }
        media = soma / vet.length;
        return media;
    }

    public static void exibirmedialucro(double medialucro) {
        System.out.println("A media de lucro da empresa foi de " + medialucro + " reais");
    }

}
