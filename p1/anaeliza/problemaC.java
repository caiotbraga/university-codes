package p1.anaeliza;

import java.util.Scanner;

public class problemaC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double altura, diametro, raio, areaLateral, areaB, areaExterna, litros, areaTotal;
        double qtdCilindros, qtdLata, custo;
        System.out.println("Digite a altura do cilindro");
        altura = in.nextDouble();
        System.out.println("Digite o diametro de cilindros");
        diametro = in.nextDouble();
        System.out.println("Digite a quantidade de cilindros");
        qtdCilindros = in.nextInt();
        raio = diametro / 2;
        areaLateral = 2 * 3.14 * raio * altura;
        areaB = 3.14 * raio * raio;
        areaExterna = areaLateral + 2 * areaB;
        areaTotal = areaExterna + qtdCilindros;
        litros = areaTotal / 3;
        qtdLata = litros / 5;
        custo = qtdLata * 45.0;
        System.out.println("Qtd de latas de tinta " + qtdLata);
        System.out.println("Custo em reais: " + custo);
        in.close();

    }
}
