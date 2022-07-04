package p2.manipulacaostring;

import java.util.Scanner;

public class manipulacaostring2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;
        char letra;
        int i, cont = 0, tam, x;
        System.out.println("Digite a frase");
        frase = in.nextLine();
        System.out.println("Informe o caractere");
        letra = in.next().charAt(0);
        tam = frase.length();
        in.close();
        for (i = 0; i < tam; i++) {
            x = frase.charAt(i);
            x = Character.toLowerCase(x);
            if (x == letra) {
                cont++;
            }
        }
        System.out.println("O número de vezes que a letra " + letra + " aparece é " + cont);
    }
}
