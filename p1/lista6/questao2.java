package p1.lista6;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cr;
        System.out.println("Informe o coeficiente de rendimento");
        cr = in.nextDouble();
        if (cr >= 9.0) {
            System.out.println("Este aluno é Altamente recomendado");
        } else if (cr >= 8.0) {
            System.out.println("Este aluno é fortemente recomendado");
        } else if (cr >= 7.0) {
            System.out.println("Este aluno é recomendado");
        } else {
            System.out.println("Este aluno nao é recomendado");
        }
        in.close();
    }

}
