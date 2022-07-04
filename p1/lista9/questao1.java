package p1.lista9;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade, x, v, nv;
        double pv, pnv;

        x = 0;
        v = 0;
        nv = 0;

        while (x != 3) {
            x = x + 1;
            System.out.println("Informe a idade");
            idade = in.nextInt();
            while (idade < 1 || idade > 120) {
                System.out.println("Idade invalida, insira uma idade valida(1-120)");
                idade = in.nextInt();
            }
            if (idade >= 18 && idade <= 90) {
                System.out.println("Esta pessoa tem " + idade + " anos e pode votar.");
                v = v + 1;
            }

            else {
                System.out.println("Esta pessoa tem " + idade + " anos e nao pode votar.");
                nv = nv + 1;
            }
        }
        System.out.println("O total de votantes foi de " + v);
        pv = 100.0 * v / x;
        System.out.printf("O percentual de votantes foi de %.2f\n", pv);

        System.out.println("O total de nao votantes de " + nv);
        pnv = 100.0 * nv / x;
        System.out.printf("O percentual de nao votantes foi de %.2f\n", pnv);

        in.close();
    }

}
