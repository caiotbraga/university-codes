package p1.lista7;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double seg1, seg2, seg3;
        System.out.println("Informe o segmento 1");
        seg1 = in.nextDouble();
        System.out.println("Informe o segmento 2");
        seg2 = in.nextDouble();
        System.out.println("Informe o segmento 3");
        seg3 = in.nextDouble();
        if (seg1 > seg2 + seg3 || seg2 > seg1 + seg3 || seg3 > seg1 + seg2) {
            System.out.println("Nao é possivel formar um triangulo pois um lado é maior que a soma dos outros 2");
        } else if (seg1 == seg2 && seg2 == seg3) {
            System.out.println("Esse triangulo é equilatero");
        } else if (seg1 != seg2 && seg2 != seg3 && seg1 != seg3) {
            System.out.println("Esse triangulo é escaleno");
        } else if (seg1 == seg2 && seg2 != seg3 || seg1 == seg2 && seg1 != seg3) {
            System.out.println("Esse triangulo é isoceles");
        }
        in.close();
    }
}
