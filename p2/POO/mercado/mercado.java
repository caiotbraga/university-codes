package p2.POO.mercado;

import java.util.Scanner;

public class mercado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String codigo;
        String descricao;
        String fornecedor;
        Double preco, desconto, aumento;
        int estoque, adicionar, venda;

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
        produto p = new produto(codigo, descricao, fornecedor, preco, estoque);
        System.out.println("Informacoes: " + p);
        System.out.println("Informe o percentual de desconto:");
        desconto = in.nextDouble();
        p.aplicarDesconto(desconto);
        System.out.println("Informe o aumento:");
        aumento = in.nextDouble();
        p.aplicarAumento(aumento);
        System.out.println("Informe o número que foi adicionado ao estoque:");
        adicionar = in.nextInt();
        p.atualizarEstoque(adicionar);
        System.out.println("Informe o número que foi vendido do estoque:");
        venda = in.nextInt();
        p.venderProduto(venda);
        System.out.println("Informacoes atualizadas: " + p);
    }
}
