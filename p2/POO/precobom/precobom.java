package p2.POO.precobom;

import java.util.Scanner;

public class precobom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String codigo;
        String descricao;
        String fornecedor;
        Double preco, pAlteracao;
        int estoque, qtd, op, tam = 0, tipoA;
        System.out.println("Informe a quantidade de produtos da loja:");
        tam = in.nextInt();
        loja bompreco = new loja(tam);
        do {
            menu();
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe o codigo do produto:");
                    codigo = in.next();
                    System.out.println("Informe a descricao do produto:");
                    descricao = in.next();
                    System.out.println("Informe o fornecedor do produto:");
                    fornecedor = in.next();
                    System.out.println("Informe o preco do produto:");
                    preco = in.nextDouble();
                    System.out.println("Informe a quantidade em estoque do produto:");
                    estoque = in.nextInt();
                    produto produto = new produto(codigo, descricao, fornecedor, preco, estoque);
                    bompreco.adcProduto(produto);
                    break;
                case 2:
                    bompreco.exibirDados();
                    break;
                case 3:
                    System.out.println("Informe o codigo do produto:");
                    codigo = in.next();
                    System.out.println("Informe percentual de alteracao:");
                    pAlteracao = in.nextDouble();
                    System.out.println("Informe o tipo de alteracao: 1-aumento || 2-desconto");
                    tipoA = in.nextInt();
                    while (tipoA != 1 && tipoA != 2) {
                        System.out.println("Tipo invalido, informe o tipo novamente");
                        tipoA = in.nextInt();
                    }
                    bompreco.alterarPreco(codigo, pAlteracao, tipoA);
                    break;
                case 4:
                    System.out.println("Informe o codigo do produto que voce deseja fazer a adicao:");
                    codigo = in.next();
                    System.out.println("Informe a quantidade a ser adicionada ao estoque:");
                    qtd = in.nextInt();
                    bompreco.adcEstoque(codigo, qtd);
                    break;
                case 5:
                    System.out.println("Informe o codigo do produto que voce deseja comprar:");
                    codigo = in.next();
                    System.out.println("Informe a quantidade que voce deseja comprar:");
                    qtd = in.nextInt();
                    bompreco.venda(codigo, qtd);
                    break;
                default:
                    System.out.println("Fim do programa.");
            }
        } while (op != 0);
    }

    public static void menu() {
        System.out.println("Menu principal");
        System.out.println("1 - Cadastrar um novo produto");
        System.out.println("2 - Exibir os dados dos produtos");
        System.out.println("3 - Alterar preco do produto");
        System.out.println("4 - Adicionar estoque de um produto");
        System.out.println("5 - Vender um produto");
        System.out.println("0 - Sair do programa");
        System.out.println("Informe a opcao");
    }
}
