package p1.lista4;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M, N;
        System.out.println("Digite o numero M");
        M = in.nextInt();
        System.out.println("Digite o numero N");
        N = in.nextInt();
        if (M % N == 0) {
            System.out.println("M é divisivel por N");
        } else {
            System.out.println("M nao é divisivel por N");
        }
        in.close();
    }

}
