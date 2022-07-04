package p1.lista4;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        System.out.println("Digite a sua idade");
        idade = in.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
        in.close();
    }
}
