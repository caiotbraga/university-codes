package p1.lista4;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double peso, altura, pesoI;
        char sexo;
        System.out.println("Informe seu sexo");
        sexo = in.next().charAt(0);
        System.out.println("Informe o peso");
        peso = in.nextDouble();
        System.out.println("Informe sua altura");
        altura = in.nextDouble();
        if (sexo == 'M') {
            pesoI = (72.7 * altura) - 58;
            if (peso > pesoI) {
                System.out.println("Seu peso está acima do ideal");
            } else if (peso < pesoI) {
                System.out.println("Seu peso está abaixo do ideal");
            } else if (peso == pesoI) {
                System.out.println("Seu peso é o ideal");
            } else if (sexo == 'F') {
                pesoI = (62.1 * altura) - 58;
                if (peso > pesoI) {
                    System.out.println("Seu peso está acima do ideal");
                } else if (peso < pesoI) {
                    System.out.println("Seu peso está abaixo do ideal");
                } else if (peso == pesoI) {
                    System.out.println("Seu peso é o ideal");
                }
                in.close();
            }

        }

    }

}
