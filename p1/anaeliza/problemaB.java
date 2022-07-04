package p1.anaeliza;

import java.util.Scanner;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class problemaB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double raioDaBase, altura, mililitros, volume, areaB, pi;
        System.out.println("Digite o raio da base do cilindro");
        raioDaBase = in.nextDouble();
        System.out.println("Digite a altura do cilindro");
        altura = in.nextDouble();
        System.out.println("Digite o valor de pi");
        pi = in.nextDouble();
        areaB = raioDaBase * raioDaBase * pi;
        volume = areaB * altura;
        mililitros = 1000000000 * volume;
        System.out.println("O volume em mililitros será de" + mililitros);
        in.close();

    }
}
