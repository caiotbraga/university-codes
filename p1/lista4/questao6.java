package p1.lista4;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salarioM, horasT, salarioT, valorHT, salarioI;
        System.out.println("Digite o valor do salário minimo.");
        salarioM = in.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas");
        horasT = in.nextDouble();
        valorHT = 5 * salarioM / 100 * horasT;
        salarioT = valorHT + salarioM;
        if (salarioT > 1500) {
            salarioI = salarioT - 7.5 * salarioT / 100;
            System.out.println("Seu salário será de " + salarioI + " após o abate de 7,5% do imposto de renda");
        } else {
            System.out.println("O seu salário será de " + salarioT);
        }
        in.close();
    }

}
