package p2.manipulacaostring;

import java.util.Scanner;

public class manipulacaostring3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;
        int contL = 0, contN = 0, contE = 0, contC = 0, i, tam, x;
        System.out.println("Digite uma frase");
        frase = in.nextLine();
        tam = frase.length();
        in.close();
        for (i = 0; i < tam; i++) {
            x = frase.charAt(i);
            x = Character.toLowerCase(x);
            if (Character.isLetter(x)) {
                contL++;
            } else if (' ' == x) {
                contE++;
            } else if (Character.isDigit(x)) {
                contN++;
            } else {
                contC++;
            }
        }
        System.out.println("O número de letras é " + contL);
        System.out.println("O número de números é " + contN);
        System.out.println("O número de espaços é " + contE);
        System.out.println("O número de caracteres é " + contC);

    }
}
