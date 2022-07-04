package p1.anaeliza;

import java.util.Scanner;

public class problemaA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double notaInter, notaPrat, notaF, exameF;
        System.out.println("Digite a nota do exame intermediário");
        notaInter = in.nextDouble();
        System.out.println("Digite a nota do exame prático");
        notaPrat = in.nextDouble();
        System.out.println("Digite a nota do exame final");
        exameF = in.nextDouble();
        notaF = (30 * notaInter) / 100 + (20 * notaPrat) / 100 + (50 * exameF) / 100;
        System.out.println("O sua nota final será de " + notaF);
        in.close();
    }
}
