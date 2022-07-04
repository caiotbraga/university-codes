package p2.vetores;

import java.util.Scanner;

public class lista6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] codigos = new int[50];
        int[] quantidade = new int[50];
        String[] nomes = new String[50];
        int codigo, qntd, adcp, op, x;

        for (x = 0; x < codigos.length; x++) {
            System.out.println("Informe o nome do produto");
            nomes[x] = in.next();
            System.out.println("Informe o codigo do " + nomes[x] + "");
            codigos[x] = in.nextInt();
            System.out.println("Informe a quandidade desse produto");
            quantidade[x] = in.nextInt();
        }
        do {
            menu();
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Venda de produto");
                    System.out.println("Informe o código do produto:");
                    codigo = in.nextInt();
                    System.out.println("Informe a quantidade desejada:");
                    qntd = in.nextInt();
                    venda(codigos, quantidade, codigo, qntd);
                    break;
                case 2:
                    System.out.println("Informe o código do produto:");
                    codigo = in.nextInt();
                    estoque(codigos, quantidade, codigo);
                    break;
                case 3:
                    System.out.println("Informe o código do produto:");
                    codigo = in.nextInt();
                    System.out.println("Informe a quantidade a ser adicionada ao produto");
                    adcp = in.nextInt();
                    attestoque(codigos, quantidade, codigo, adcp);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (op != 0);
    }

    public static void menu() {
        System.out.println("1 - Venda de produto");
        System.out.println("2 - Consulta de estoque");
        System.out.println("3 - Atualização de estoque");
        System.out.println("4 - Encerrar programa");
        System.out.println("Informe a opção desejada:");
    }

    public static void venda(int vet1[], int vet2[], int cod, int qntd) {
        int pos;
        pos = buscarcod(vet1, cod);
        if (pos == -1) {
            System.out.println("Código inexistente!");
        } else {
            if (qntd <= vet2[pos]) {
                vet2[pos] = vet2[pos] - qntd;
                System.out.println("Pedido atendido!");
                if (vet2[pos] == 0) {
                    System.out.println("Estoque zerado. Favor, entrar em contato o fornecedor do produto.");
                }
            } else if (vet2[pos] < qntd) {
                System.out.println("Não temos estoque suficiente desta mercadoria. Favor consultar estoque.");
            }
        }
    }

    public static int buscarcod(int vet1[], int cod) {
        int pos = 0;
        int i;
        boolean achou = true;
        for (i = 0; i < vet1.length; i++) {
            if (cod == vet1[i]) {
                pos = i;
                achou = true;
                break;
            }
        }
        if (achou == true) {
            return pos;
        } else
            return -1;
    }

    public static void estoque(int vet1[], int vet2[], int cod) {
        int pos = 0;
        pos = buscarcod(vet1, cod);
        if (pos == -1) {
            System.out.println("Código inexistente!");
        } else {
            System.out.println(vet2[pos] + " ");
        }
    }

    public static void attestoque(int vet1[], int vet2[], int cod, int adcp) {
        int pos = 0;
        pos = buscarcod(vet1, cod);
        if (pos == -1) {
            System.out.println("Código inexistente!");
        } else {
            vet2[pos] = vet2[pos] + adcp;
        }
    }

}
