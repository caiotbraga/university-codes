package p2.manipulacaostring;

import java.util.Scanner;

public class manipulacaostring7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String conta;
        char dig, x;
        int tam, i;
        boolean valido = false;
        System.out.println("Informe a conta");
        conta = in.next();
        tam = conta.length();
        while (tam != 6) {
            System.out.println("Informe a conta(6 digitos)");
            conta = in.next();
            tam = conta.length();
        }
        System.out.println("Informe o código verificador");
        dig = in.next().charAt(0);
        while (Character.isLetter(dig)) {
            System.out.println("Informe o código verificador(apenas número");
            dig = in.next().charAt(0);
        }
        for (i = 0; i < tam; i++) {
            x = conta.charAt(i);
            if (Character.isLetter(x)) {
                System.out.println("Informe a conta(apenas números)");
                conta = in.next();
                tam = conta.length();
            } else {
                valido = true;
            }
        }
        if (valido = true) {

        }
    }
}
