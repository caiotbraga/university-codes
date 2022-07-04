package p1.lista6;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade, dosagem;
        double peso, ml, gotas;
        System.out.println("Informe a sua idade");
        idade = in.nextInt();
        System.out.println("Informe seu peso");
        peso = in.nextDouble();
        if (idade >= 12) {
            if (peso >= 60) {
                dosagem = 1000;
            } else {
                dosagem = 875;
            }
        } else {
            if (peso < 5) {
                dosagem = 0;
            } else if (peso <= 9) {
                dosagem = 125;
            } else if (peso <= 16) {
                dosagem = 250;
            } else if (peso <= 24) {
                dosagem = 375;
            } else if (peso <= 30) {
                dosagem = 500;
            } else {
                dosagem = 750;
            }
        }
        ml = dosagem / 500;
        gotas = ml * 20;
        gotas = Math.floor(gotas);
        System.out.println("Quantidade de gotas é " + gotas);
        in.close();
    }
}
