package p2.POO.precobom;

public class produto {
    private String codigo;
    private String descricao;
    private String fornecedor;
    private Double preco;
    private int estoque;

    public produto(String codigo) {
        this.codigo = codigo;
    }

    public produto(String codigo, String descricao, String fornecedor, Double preco, int estoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public Double getPreco() {
        return this.preco;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void aplicarDesconto(Double percentual) {
        this.preco = this.preco - (this.preco * percentual / 100);
    }

    public void aplicarAumento(Double aumento) {
        this.preco = (this.preco + aumento);
    }

    public void atualizarEstoque(int adicionado) {
        this.estoque = this.estoque + adicionado;
    }

    public void venderProduto(int vendido) {
        this.estoque = this.estoque - vendido;
    }

    public String toString() {
        return "codigo:" + this.codigo + "| descricao:" + this.descricao + "| fornecedor:" + this.fornecedor
                + "| preco:" + this.preco + "| estoque:" + estoque;
    }
}
