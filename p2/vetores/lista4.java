package p2.vetores;

import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[50];
        int[] B = new int[50];
        int resp = 0, contA = 0, contB = 0, valor, retorno, posicao;
        do {
            menu();
            resp = in.nextInt();
            while (resp < 1 || resp > 5) {
                System.out.println("Valor inválido, tente novamente!");
                resp = in.nextInt();
            }
            if (resp == 1) {
                System.out.println("Informe o valor:");
                valor = in.nextInt();
                if (valor % 2 == 0) {
                    retorno = armazenar(A, contA, valor);
                    if (retorno == 1) {
                        System.out.println("A inserção foi realizada!");
                        contA++;
                    } else if (retorno == 2) {
                        System.out.println("Vetor cheio!");
                    } else {
                        System.out.println("Já existe o valor " + valor + " no vetor");
                    }
                } else {
                    retorno = armazenar(B, contB, valor);
                    if (retorno == 1) {
                        System.out.println("A inserção foi realizada!");
                        contB++;
                    } else if (retorno == 2) {
                        System.out.println("Vetor cheio!");
                    } else {
                        System.out.println("Já existe o valor " + valor + " no vetor");
                    }
                }
            } else if (resp == 2) {
                System.out.println("Informe o valor:");
                valor = in.nextInt();
                if (valor % 2 == 0) {
                    posicao = buscar(A, contA, valor);
                    if (posicao == -1) {
                        System.out.println("Valor não encontrado");
                    } else {
                        System.out.println("Valor encontrado na posição " + posicao);
                    }
                } else {
                    posicao = buscar(B, contB, valor);
                    if (posicao == -1) {
                        System.out.println("Valor não encontrado");
                    } else {
                        System.out.println("Valor encontrado na posição " + posicao);
                    }
                }
            } else if (resp == 3) {
                exibir(A, contA);
            } else if (resp == 4) {
                exibir(B, contB);
            }
        } while (resp >= 1 && resp <= 4);
        System.out.println("Fim do programa!");
    }

    public static void menu() {
        System.out.println("1 = Armazenar número");
        System.out.println("2 = Procurar número");
        System.out.println("3 = Exibir números pares");
        System.out.println("4 = Exibir números ímpares");
        System.out.println("5 = Encerrar programa");
    }

    public static int armazenar(int[] vet, int cont, int valor) {
        int pos;
        if (cont == vet.length) {
            return 2;
        } else {
            pos = buscar(vet, cont, valor);
            if (pos == -1) {
                vet[cont] = valor;
                return 1;
            } else {
                return 3;
            }
        }
    }

    public static int buscar(int[] vet, int cont, int valor) {
        int i;
        boolean achou = false;
        int pos = 0;
        for (i = 0; i <= cont - 1; i++) {
            if (valor == vet[i]) {
                achou = true;
                pos = i;
                break; // para o FOR
            }
        }
        if (achou == true) {
            return pos;
        } else {
            return -1;
        }
    }

    public static void exibir(int[] vet, int cont) {
        int i;
        if (cont == 0) {
            System.out.println("Vetor vazio!");
        } else {
            for (i = 0; i < cont; i++) {
                System.out.println(vet[i] + " ");
            }
        }
    }
}
