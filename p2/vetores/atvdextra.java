package p2.vetores;

import java.util.Scanner;

public class atvdextra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op, flag = 0, tam = 100, cont = 0, retorno, posicao;
        String[] nomes = new String[tam];
        String nome;
        boolean achou = false;
        do {
            menu();
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe o nome:");
                    nome = in.next();
                    retorno = inserir(nomes, cont, nome);
                    if (retorno == 1) {
                        System.out.println("Nome adicionado!");
                        cont++;
                        flag = 1;
                    } else if (retorno == 2) {
                        System.out.println("Vetor cheio!");
                    } else {
                        System.out.println("Valor repetido!");
                    }
                    break;
                case 2:
                    exibicao(nomes, cont);
                    break;
                case 3:
                    ordenarc(nomes, cont, flag);
                    break;
                case 4:
                    ordenard(nomes, cont, flag);
                    break;
                case 5:
                    System.out.println("Informe o nome que deseja procurar:");
                    nome = in.nextLine();
                    posicao = buscar(nomes, cont, nome);
                    if (posicao == -1) {
                        System.out.println("Valor nao encontrado");
                    } else {
                        System.out.println("Valor encontrado na posicao " + posicao);
                    }
                    break;
                default:
                    System.out.println("Fim do programa.");
            }
        } while (op != 0);

        while (op > 5) {
            System.out.println("Opcao inexitente!");
            System.out.println("Informe a opcao");
            op = in.nextInt();
        }
    }

    public static void menu() {
        System.out.println("Menu principal");
        System.out.println("1 - Inserir novo nome");
        System.out.println("2 - Exibir nomes");
        System.out.println("3 - Ordenar crescente");
        System.out.println("4 - Ordenar decrescente");
        System.out.println("5 - Realizar busca");
        System.out.println("0 - Sair do programa");
        System.out.println("Informe a opcao");
    }

    public static int buscar(String[] vetorn, int cont, String nome) {
        int i;
        boolean achou = false;
        int pos = 0;
        for (i = 0; i <= cont - 1; i++) {
            if (nome.compareToIgnoreCase(vetorn[i]) == 0) {
                achou = true;
                pos = i;
                break;
            }
        }
        if (achou == true) {
            return pos;
        } else {
            return -1;
        }
    }

    public static void exibicao(String[] vetorn, int cont) {
        int i;
        if (cont == 0) {
            System.out.println("Vetor vazio!");
        } else {
            for (i = 0; i < cont; i++) {
                System.out.println(vetorn[i] + " ");
            }
        }
    }

    public static void ordenarc(String[] vetorn, int n, int flag) {
        int i, fim, pos;
        String chave;
        boolean troca;
        fim = n - 2;
        pos = 0;
        do {
            troca = false;
            for (i = 0; i <= fim; i++) {
                if (vetorn[i].compareToIgnoreCase(vetorn[i + 1]) > 0) {
                    chave = vetorn[i];
                    vetorn[i] = vetorn[i + 1];
                    vetorn[i + 1] = chave;
                    pos = i;
                    troca = true;
                }
            }
            fim = pos - 1;
        } while (troca == true);
        flag = 2;
    }

    public static void ordenard(String[] vetorn, int n, int flag) {
        int i, fim, pos;
        String chave;
        boolean troca;
        fim = n - 2;
        pos = 0;
        do {
            troca = false;
            for (i = 0; i <= fim; i++) {
                if (vetorn[i].compareToIgnoreCase(vetorn[i + 1]) < 0) {
                    chave = vetorn[i];
                    vetorn[i] = vetorn[i + 1];
                    vetorn[i + 1] = chave;
                    pos = i;
                    troca = true;
                }
            }
            fim = pos - 1;
        } while (troca == true);
        flag = 3;
    }

    public static int inserir(String[] vetorn, int cont, String nome) {
        int pos;
        if (cont == vetorn.length) {
            return 2;
        } else {
            pos = buscar(vetorn, cont, nome);
            if (pos == -1) {
                vetorn[cont] = nome;
                return 1;
            } else {
                return 3;
            }
        }
    }

}
