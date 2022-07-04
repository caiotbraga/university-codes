package p2.POO.precobom;

import java.util.Scanner;

public class loja {
    Scanner in = new Scanner(System.in);
    private int cont = 0;
    private produto[] listaDeProduto;
    private produto produto;

    public loja(int tam) {
        this.listaDeProduto = new produto[tam];
    }

    public void exibirDados() {
        int i;
        if (this.cont == 0) {
            System.out.println("Cadastro vazio");
        } else {
            for (i = 0; i < this.cont; i++) {
                System.out.println(this.listaDeProduto[i]);
            }
        }
    }

    public void adcProduto(produto novoproduto) {
        if (this.cont == this.listaDeProduto.length) {
            System.out.println("Lista de produtos cheia!");
        } else {
            if (buscar(novoproduto.getCodigo()) == -1) {
                this.listaDeProduto[this.cont] = novoproduto;
                this.cont++;
                System.out.println("Produto adicionado");
            } else {
                System.out.println("Produto ja existente no cadastro!");
            }
        }
    }

    public int buscar(String cod) {
        int i;
        String codigo;
        if (this.cont == 0) {
            return -1;
        } else {
            for (i = 0; i < this.cont; i++) {
                codigo = this.listaDeProduto[i].getCodigo();
                if (codigo.compareTo(cod) == 0) {
                    return i;
                }
            }
            return -1;
        }
    }

    public void alterarPreco(String cod, Double alteracao, int tipo) {
        int pos;
        if (this.cont == 0) {
            System.out.println("Cadastro vazio!");
        } else {
            pos = buscar(cod);
            if (pos == -1) {
                System.out.println("Produto não cadastrado!");
            } else { // ACHOU
                if (tipo == 1) { // aumento
                    this.listaDeProduto[pos].aplicarAumento(alteracao);
                } else {
                    this.listaDeProduto[pos].aplicarDesconto(alteracao);
                }
            }
        }
    }

    public void adcEstoque(String cod, int qntd) {
        int i;
        String codigo;
        int estoque;
        for (i = 0; i < this.cont; i++) {
            codigo = this.listaDeProduto[i].getCodigo();
            if (codigo.compareTo(cod) == 0) {
                estoque = this.listaDeProduto[i].getEstoque();
                estoque = estoque + qntd;
                break;
            }
        }
    }

    public void venda(String cod, int qtd) {
        int i;
        String codigo;
        int estoque;
        for (i = 0; i < this.cont; i++) {
            estoque = this.listaDeProduto[i].getEstoque();
            if (estoque == 0) {
                System.out.println("Estoque vazio!");
            } else if (estoque < qtd) {
                System.out.println(
                        "Quantidade insuficiente no estoque! O estoque contem " + estoque + " unidades do produto.");
            } else {
                estoque = estoque - qtd;
                System.out.println("Venda de " + qtd + " quantidades do produto realizada!");
            }
        }
    }

}
