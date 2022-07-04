package p1.lista11;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, cont, res;
        System.out.println("Informe o numero que voce deseja a tabuada");
        num = in.nextInt();
        for (cont = 1; cont <= 10; cont = cont + 1) {
            System.out.print(num);
            System.out.print("x");
            System.out.print(cont);
            System.out.print("=");
            res = num * cont;
            System.out.println(res);
            in.close();
        }

    }
}
