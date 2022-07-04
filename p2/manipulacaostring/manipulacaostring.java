package p2.manipulacaostring;

import java.util.Scanner;

public class manipulacaostring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;
        int tam, i, cont = 0;
        char c;
        System.out.println("Digite a frase");
        frase = in.nextLine(); // importante usar o nextLine pra passar do espaco depois da primeira palavra
        tam = frase.length();
        in.close();
        for (i = 0; i < tam; i++) {
            c = frase.charAt(i);
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cont++;
            }
        }
        System.out.println("O número de vogais na frase é " + cont);
    }

}
/*
 * isDefined – Determina se o caractere passado como argumento está definido no
 * conjunto de caracteres Unicode. Se estiver, o método retorna true; caso
 * contrário, retorna false.
 * isDigit – Determina se o caractere é um dígito (número) definido no Unicode.
 * isLetter – Determina se o caractere é uma letra do alfabeto.
 * isLetterOrDigit – Determina se o caractere é uma letra ou um dígito numérico.
 * isUpperCase – Determina se o caractere é uma letra maiúscula.
 * isLowerCase – Determina se o caractere é uma letra minúscula.
 * toUpperCase – Converte o caractere para maiúscula.
 * toLowerCase – Converte o caractere para minúscula.
 */
