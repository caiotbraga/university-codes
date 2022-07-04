package p2.vetores.lista3;

import java.util.Scanner;

public class lista3b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] votos = new int[10];
        double[] percentuais = new double[10];
        String[] nomes = { "BRANCO", "JOAO", "MARIA", "PEDRO", "LUIS", "ANA", "LUIZA", "SILVIA", "ANDRE", "NULO" };
        int soma;
        System.out.println("ELEICOES");
        contador(votos);
        soma = somarvotos(votos);
        percentual(percentuais, votos, soma);
    }

    public static void exibicao() {
        System.out.println("ELEICOES:");
        System.out.println("Em quem voce deseja votar?");
        System.out.println("0 = BRANCO");
        System.out.println("1 = JOAO");
        System.out.println("2 = MARIA");
        System.out.println("3 = PEDRO");
        System.out.println("4 = LUIS");
        System.out.println("5 = ANA");
        System.out.println("6 = LUIZA");
        System.out.println("7 = SILVIA");
        System.out.println("8 = ANDRE");
    }

    public static void contador(int[] cont) {
        Scanner in = new Scanner(System.in);
        char resp;
        int voto;
        do {
            exibicao();
            System.out.println("Em quem voce deseja votar?");
            voto = in.nextInt();
            if (voto >= 0 && voto <= 8) {
                cont[voto]++;
            } else {
                cont[9]++;
            }
            System.out.println("Tem outra pessoa pra votar? s/n");
            resp = in.next().charAt(0);
            resp = Character.toLowerCase(resp);
        } while (resp == 's');
    }

    public static int somarvotos(int[] cont) {
        int soma = 0, i;
        for (i = 0; i < cont.length; i++) {
            soma = soma + cont[i];
        }
        return soma;
    }

    public static void percentual(double perc[], int votos[], int soma) {
        int i;
        for (i = 0; i < perc.length; i++) {
            perc[i] = votos[i] * 100 / soma;
            System.out.println("O candidato " + i + " recebeu " + perc[i] + "% dos votos");
        }
    }

}
