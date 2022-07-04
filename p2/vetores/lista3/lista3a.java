package p2.vetores.lista3;

import java.util.Scanner;

public class lista3a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nome = new String[5];
        Double[] notas1 = new Double[5];
        Double[] notas2 = new Double[5];
        Double[] mediasal = new Double[5];
        String[] situacao = new String[5];
        double mediast, percentual, maiormedia;
        int i;

        System.out.println("Informe os dados dos alunos");
        preencher(nome, notas1, notas2, mediasal, situacao);
        System.out.println("Resultados finais");
        resultados(nome, mediasal, situacao);
        mediast = mediadat(mediasal);
        System.out.println("A media geral da turma foi " + mediast);
        i = medianos(mediasal, mediast);
        System.out.println("O número de alunos acima da média foi de " + i);
        percentual = pabaixo(mediasal, mediast);
        System.out.println("O percentual de alunos abaixo da media foi de " + percentual);
        maiormedia = maiorm(mediasal);
        System.out.println("A maior média da turma é " + maiormedia);

    }

    public static void preencher(String[] vetn, Double[] vetn1, Double[] vetn2, Double[] vetm, String[] vets) {
        int i;
        Scanner in = new Scanner(System.in);
        for (i = 0; i < vetn.length; i++) {
            System.out.println("Informe o nome do aluno " + (i + 1) + ":");
            vetn[i] = in.next();
            System.out.println("Informe a primeira nota de " + vetn[i] + ":");
            vetn1[i] = in.nextDouble();
            while (vetn1[i] < 0 || vetn1[i] > 10) {
                System.out.println("Nota invalida, informe a primeira nota de " + vetn[i] + " ");
                vetn1[i] = in.nextDouble();
            }
            System.out.println("Informe a segunda nota de " + vetn[i] + ":");
            vetn2[i] = in.nextDouble();
            while (vetn2[i] < 0 || vetn2[i] > 10) {
                System.out.println("Nota invalida, informe a segunda nota de " + vetn[i] + "");
                vetn2[i] = in.nextDouble();
            }
            vetm[i] = ((vetn1[i] * 2) + (vetn2[i] * 3)) / 5;
            if (vetm[i] >= 7) {
                vets[i] = "aprovado";
            } else if (vetm[i] < 3) {
                vets[i] = "reprovado";
            } else {
                vets[i] = "recuperacao";
            }
        }
    }

    public static void resultados(String[] vetn, Double[] vetm, String[] vets) {
        int i;
        for (i = 0; i < vetn.length; i++) {
            System.out.print("O aluno " + vetn[i] + " ");
            System.out.println("obteve media " + vetm[i] + " ");
            System.out.println("e está " + vets[i]);
        }
    }

    public static double mediadat(Double[] vet) {
        double soma = 0;
        double media;
        int i;
        for (i = 0; i < vet.length; i++) {
            soma = soma + vet[i];
        }
        media = soma / 5;
        return media;
    }

    public static int medianos(Double[] mediasal, Double mediast) {
        int i, a = 0;
        for (i = 0; i < mediasal.length; i++) {
            if (mediasal[i] > mediast) {
                a = a + 1;
            }
        }
        return a;
    }

    public static double pabaixo(Double[] mediasal, Double mediast) {
        int i, a = 0;
        double percentual = 0;
        for (i = 0; i < mediasal.length; i++) {
            if (mediasal[i] < mediast) {
                a = a + 1;
            }
            percentual = a * 100 / 5;
        }
        return percentual;
    }

    public static double maiorm(Double[] mediasal) {
        int i;
        double maior = 0;
        for (i = 0; i < mediasal.length; i++) {
            if (mediasal[i] > maior) {
                maior = mediasal[i];
            }
        }
        return maior;
    }
}
