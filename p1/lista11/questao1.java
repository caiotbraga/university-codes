package p1.lista11;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int voto, contvv, contMa, contPe, contL, contPa, contF, contB, contI, contv;
        double percentualB, percentualN, percentualVV;
        char resp;

        contvv = 0;
        contMa = 0;
        contPe = 0;
        contL = 0;
        contPa = 0;
        contF = 0;
        contB = 0;
        contI = 0;
        contv = 0;

        do {
            System.out.println("Informe em quem voce quer votar, sendo:");
            System.out.println("1 = Maria");
            System.out.println("2 = Pedro");
            System.out.println("3 = Luis");
            System.out.println("4 = Paula");
            System.out.println("5 = Francisco");
            System.out.println("6 = Voto Branco");
            voto = in.nextInt();
            contv = contv + 1;
            if (voto == 1) {
                contMa = contMa + 1;
            } else if (voto == 2) {
                contPe = contPe + 1;
            } else if (voto == 3) {
                contL = contL + 1;
            } else if (voto == 4) {
                contPa = contPa + 1;
            } else if (voto == 5) {
                contF = contF + 1;
            } else if (voto == 6) {
                contB = contB + 1;
            } else if (voto < 1 || voto > 6) {
                contI = contI + 1;
            }
            contvv = contMa + contPe + contL + contPa + contF + contB;
            System.out.print("Tem mais pessoas para votar?");
            System.out.println("Digite 's'para sim ou 'n'para nao");
            resp = in.next().charAt(0);
        } while (resp == 's');
        percentualVV = 100.0 * contvv / contv;
        percentualB = 100.0 * contB / contv;
        percentualN = 100.0 * contI / contv;
        System.out.println("O total de votos para Maria foi de " + contMa);
        System.out.println("O total de votos para Pedro foi de " + contPe);
        System.out.println("O total de votos para Luis foi de " + contL);
        System.out.println("O total de votos para Paula foi de " + contPa);
        System.out.println("O total de votos para Francisco foi de " + contF);
        System.out.println("O total de votos brancos foi de " + contB);
        System.out.println("O total de votos nulos foi de " + contI);
        System.out.printf("O percentual de votos validos é de %.2f \n", percentualVV);
        System.out.printf("O percentual de votos brancos é de %.2f \n", percentualB);
        System.out.printf("O percentual de votos invalidos é de %.2f \n", percentualN);
        in.close();
    }
}
