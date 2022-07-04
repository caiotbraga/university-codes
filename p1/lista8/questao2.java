package p1.lista8;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double parcial1, parcial2, media, i;
        int reprovados, aprovados, recuperacao;

        reprovados = 0;
        aprovados = 0;
        recuperacao = 0;
        i = 1;

        System.out.println("Nota parcial 1:");
        parcial1 = input.nextDouble();
        System.out.println("Nota parcial 2:");
        parcial2 = input.nextDouble();

        while (i != 30) {
            i = i + 1;
            System.out.println("Nota parcial 1:");
            parcial1 = input.nextDouble();
            System.out.println("Nota parcial 2:");
            parcial2 = input.nextDouble();

            while (parcial1 > 10 || parcial1 < 0 || parcial2 > 10 || parcial2 < 0) {
                System.out.println("Opção inválida. Digite as notas novamente.");
                System.out.println("Nota parcial 1:");
                parcial1 = input.nextDouble();
                System.out.println("Nota parcial 2:");
                parcial2 = input.nextDouble();
            }

            media = (parcial1 + parcial2) / 2;
            if (media >= 7.0) {
                aprovados = aprovados + 1;
            } else if (media < 7 && media > 3) {
                recuperacao = recuperacao + 1;
            } else if (media <= 3) {
                reprovados = reprovados + 1;
            }
        }
        System.out.printf("%s alunos foram aprovados, %s alunos estão de recuperação e %s alunos reprovaram.",
                aprovados, recuperacao, reprovados);

        input.close();
    }
}