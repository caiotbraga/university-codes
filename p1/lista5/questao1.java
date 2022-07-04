package p1.lista5;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        System.out.println("Informe sua idade");
        idade = in.nextInt();
        if (idade >= 16) {
            System.out.println("Esta pessoa tem " + idade + " anos e pode votar");
        } else {
            System.out.println("Esta pessoa tem " + idade + " e nao pode votar");
        }
        in.close();
    }

}
