package p2.POO.usapessoa;

public class pessoa {
    // declarar os atributos (variaveis de instancia)
    private String nome;
    private char genero;
    private int idade;
    private double peso;
    private double altura;
    private double pesoIdeal;

    // metodos de construtores - inicializar as variaveis de instancia
    public pessoa(String nome) {
        this.nome = nome;
    }

    public pessoa(String nome, char genero, int idade, double peso, double altura) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.pesoIdeal = peso / (altura * altura);
    }

    // metodos provedores de servico
    public void atualizarAltura(double novaAltura) {
        if (novaAltura < 0.5 || novaAltura > 2.0) {
            System.out.println("Altura inválida!");
        } else {
            this.altura = novaAltura;
            this.pesoIdeal = this.peso / (this.altura * this.altura);
        }
    }

    public void atualizarPeso(double novoPeso) {
        if (novoPeso < 3.0 || novoPeso > 200) {
            System.out.println("Peso inválido!");
        } else {
            this.peso = novoPeso;
            this.pesoIdeal = this.peso / (this.altura + this.altura);
        }
    }

    public void atualizarIdade(int novaIdade) {
        if (novaIdade < 0 || novaIdade > 100) {
            System.out.println("Idade inválida!");
        } else {
            this.idade = novaIdade;
        }
    }

    public String toString() {
        return this.nome + " " + this.genero + " " + this.idade + " " + this.peso + " " + this.altura + " "
                + this.pesoIdeal;
    }
}
