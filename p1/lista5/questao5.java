package p1.lista5;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s, sf, a;
        System.out.println("Digite o salário");
        s = in.nextDouble();
        if (s <= 1900) {
            sf = s + (s * 0.2);
            a = sf - s;
            System.out.println("O jogador terá aumento de R$" + a + " e passará a receber " + sf);
        }
        if (s > 1900 && s <= 3300) {
            sf = s + (s * 0.15);
            a = sf - s;
            System.out.println("O jogador terá aumento de R$" + a + " e passará a receber " + sf);
        }
        if (s > 3300 && s <= 5800) {
            sf = s + (s * 0.1);
            a = sf - s;
            System.out.println("O jogador terá aumento de R$" + a + " e passará a receber " + sf);
        }
        if (s > 5800) {
            sf = s + (s * 0.05);
            a = sf - s;
            System.out.println("O jogador terá aumento de R$" + a + " e passará a receber " + sf);
        }
        in.close();
    }
}
/*
 * █████████
 * █▄█████▄█
 * █▼▼▼▼▼
 * █
 * █▲▲▲▲▲
 * █████████
 * ██ ██
 */
