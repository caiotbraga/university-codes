package p2.manipulacaostring;

import java.util.Scanner;

public class manipulacaostringextra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] cadastro = new String[5];
        int i, tam = cadastro.length;
        boolean valido = false;
        for (i = 0; i < tam; i++) {
            System.out.println("Informe o número do cadastro " + String.valueOf(i + 1));
            cadastro[i] = in.nextLine();
            valido = validar(cadastro[i]);
            while (valido == false) {
                System.out.println("Houve um erro no número do cadastro.");
                System.out.println("Digite novamente:");
                cadastro[i] = in.nextLine();
                valido = validar(cadastro[i]);
            }

        }

        exibir(cadastro);
    }

    public static boolean validar(String cad) {
        int tam = cad.length();
        boolean valido = true;
        int d1, d2, x1, x2;
        if (tam != 9) {
            valido = false;
        } else {
            d1 = calculard1(cad);
            x1 = cad.charAt(7) - '0';
            d2 = calculard2(cad);
            x2 = cad.charAt(8) - '0';
            if (x1 != d1 || x2 != d2) {
                valido = false;
            }
        }
        return valido;
    }

    public static int calculard1(String cad) {
        int i, tam = cad.length(), soma, resto;
        int[] num = new int[tam];
        int d1;
        for (i = 0; i < tam; i++) {
            num[i] = cad.charAt(i) - '0'; // transformando o caracter em inteiro.
        }
        soma = (num[0] * 8) + (num[1] * 7) + (num[2] * 6) + (num[3] * 5) + (num[4] * 4) + (num[5] * 3) + (num[6] * 2);
        resto = soma % 11;
        if (resto == 1 || resto == 0) {
            d1 = 0;
            return d1;
        } else {
            d1 = 11 - resto;
            return d1;
        }
    }

    public static int calculard2(String cad) {
        int i, tam = cad.length(), soma, resto;
        int[] num = new int[tam];
        int d2;
        for (i = 0; i < tam; i++) {
            num[i] = cad.charAt(i) - '0'; // transformando o caracter em inteiro.
        }
        soma = (num[0] * 9) + (num[1] * 8) + (num[2] * 7) + (num[3] * 6) + (num[4] * 5) + (num[5] * 4) + (num[6] * 3)
                + (num[7] * 2);
        resto = soma % 11;
        if (resto == 1 || resto == 0) {
            d2 = 0;
            return d2;
        } else {
            d2 = 11 - resto;
            return d2;
        }
    }

    public static void exibir(String[] cadastro) {
        int i;
        int tam = cadastro.length;
        for (i = 0; i < tam; i++) {
            System.out.println(cadastro[i]);
        }
    }

}
