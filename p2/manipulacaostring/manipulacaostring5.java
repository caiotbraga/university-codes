package p2.manipulacaostring;

import java.util.Scanner;

public class manipulacaostring5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cpf;
        int i = 0, tam = 0;
        char x;
        System.out.println("Informe seu CPF:");
        cpf = in.next();
        tam = cpf.length();
        if (tam != 11) {
            System.out.println("Tamanho invalido, o cpf tem 11 digitos");
            System.out.println("Informe seu CPF:");
            cpf = in.next();
            tam = cpf.length();
        } else {
            for (i = 0; i < tam; i++) {
                x = cpf.charAt(i);
                if (Character.isLetter(x)) {
                    System.out.println("Informe apenas digitos");
                    System.out.println("Informe seu CPF:");
                    cpf = in.next();
                    tam = cpf.length();
                }
            }
            System.out.println(cpf);
        }
    }
}