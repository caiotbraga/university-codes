package p1.lista5;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2, m;
        System.out.println("Informe a sua nota na primeira avaliacao");
        n1 = in.nextDouble();
        System.out.println("Informe a sua nota na segunda avaliacao");
        n2 = in.nextDouble();
        m = (n1 + n2) / 2;
        if (m >= 7) {
            System.out.println("O aluno obteve média " + m + " e está aprovado");
        } else if (m >= 3 && m < 7) {
            System.out.println("O aluno obteve média " + m + " e está na prova final");
        }

        else {
            System.out.println("O aluno obteve média " + m + " e está reprovado");
        }
        in.close();
    }
}
