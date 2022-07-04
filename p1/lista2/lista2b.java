package p1.lista2;

import java.util.Scanner;

public class lista2b {
    public static void main(String[] args) {
        double[] vetGanhos = new double[13];
        double[] vetGastos = new double[13];
        double[] vetLucros = new double[13];
        double totalg, totalgt, totalL;

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
    }

    public static void preenchervg(double[] vet) {
        int i;
        Scanner in = new Scanner(System.in);
        for (i = 1; i < vet.length; i++) {
            System.out.println("Informe o valor do ganho do mes " + i + ":");
            vet[i] = in.nextDouble();
        }
    }

    public static void preenchervgt(double[] vet) {
        int i;
        Scanner in = new Scanner(System.in);
        for (i = 1; i < vet.length; i++) {
            System.out.println("Informe o valor do gasto do mes " + i + ":");
            vet[i] = in.nextDouble();
        }
    }

    public static void exibirg(double[] vet) {
        int i;
        for (i = 1; i < vet.length; i++) {
            System.out.println("O valor de ganho no mes " + i + " foi de " + vet[i] + " reais");
        }
    }

    public static void exibirgt(double[] vet) {
        int i;
        for (i = 1; i < vet.length; i++) {
            System.out.println("O valor de gastos no mes " + i + " foi de " + vet[i] + " reais");
        }
    }

    public static double[] calcularL(double[] G, double[] GT) {
        int i;
        double[] L = new double[13];
        for (i = 1; i < L.length; i++) {
            L[i] = G[i] - GT[i];
        }
        return L;
    }

    public static void exibirL(double[] vet) {
        int i;
        for (i = 1; i < vet.length; i++) {
            System.out.println("O valor do lucro no mes " + i + " foi de " + vet[i] + " reais");
        }
    }

    public static double totalg(double[] vet) {
        int i;
        double soma = 0;
        for (i = 1; i < vet.length; i++) {
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
        for (i = 1; i < vet.length; i++) {
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
        for (i = 1; i < vet.length; i++) {
            soma = vet[i] + soma;
        }
        return soma;
    }

    public static void exibirtotalLucro(double lucros) {
        System.out.println("O total do lucro foi de: " + lucros + " reais");
    }
}
