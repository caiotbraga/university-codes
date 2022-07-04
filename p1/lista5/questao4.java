package p1.lista5;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int he, hf, ht;
        System.out.println("Informe as horas extras trabalhadas");
        he = in.nextInt();
        System.out.println("Informe as horas que faltou");
        hf = in.nextInt();
        ht = he - (2 * hf / 3);
        if (ht > 40) {
            System.out.println("O funcionário receberá R$2OO de gratificacao de natal");
        } else if (ht > 30) {
            System.out.println("O funcionário receberá R$175 de gratificacao de natal");
        } else if (ht > 20) {
            System.out.println("O funcionário receberá R$150 de gratificacao de natal");
        } else if (ht > 10) {
            System.out.println("O funcionário receberá R$125 de gratificacao de natal");
        } else {
            System.out.println("O funcionário receberá R$100 de gratificacao de natal");
        }
        in.close();
    }

}
/*
 * /*public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * int he, hf, ht;
 * System.out.println("Informe as horas extras trabalhadas");
 * he = in.nextInt();
 * System.out.println("Informe as horas que faltou");
 * hf = in.nextInt();
 * ht = he - ( 2 * hf / 3);
 * if (ht > 40){System.out.
 * println("O funcionário receberá R$2OO de gratificacao de natal");}
 * if (ht > 30 && ht <= 40){System.out.
 * println("O funcionário receberá R$175 de gratificacao de natal");}
 * if (ht > 20 && ht <= 30){System.out.
 * println("O funcionário receberá R$150 de gratificacao de natal");}
 * if (ht > 10 && ht <= 20){System.out.
 * println("O funcionário receberá R$125 de gratificacao de natal");}
 * if (ht <=10){System.out.
 * println("O funcionário receberá R$100 de gratificacao de natal");}
 * in.close();
 * }
 * }
 */