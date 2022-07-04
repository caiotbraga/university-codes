package p1.lista8;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.println("Informe a primeira nota");
        nota1 = in.nextDouble();
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Informe uma nota que seja válida(0-10)");
            nota1 = in.nextDouble();
        }
        System.out.println("Informe a segunda nota");
        nota2 = in.nextDouble();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Informe uma nota que seja válida(0-10)");
            nota2 = in.nextDouble();
        }
        media = (nota1 + nota2) / 2;
        if (media >= 7) {
            System.out.println("O aluno obteve média " + media + " e está aprovado");
        } else {
            if (media < 7 || media <= 3) {
                System.out.println("“O aluno obteve média " + media + " e está de recuperacao");
            }
            if (media < 3) {
                System.out.println("“O aluno obteve média " + media + " eestá reprovado");
            }
        }
        in.close();
    }
}
