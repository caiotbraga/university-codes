package p2.POO.empresa;

public class funcionario {
    private String matricula;
    private String nome;
    private String cargo;
    private Double salario;
    private int anoContratacao;

    public funcionario(String mat) {
        this.matricula = mat;
    }

    public funcionario(String mat, String nom, String car, Double sal, int anC) {
        this.matricula = mat;
        this.nome = nom;
        this.cargo = car;
        this.salario = sal;
        this.anoContratacao = anC;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public Double getSalario() {
        return this.salario;
    }

    public int getAnoContratacao() {
        return this.anoContratacao;
    }

    public void aplicarAumento(Double percentual) {
        this.salario = (this.salario * percentual / 100) + this.salario;
    }

    public String toString() {
        return "matricula:" + this.matricula + "| nome:" + this.nome + "| cargo:" + this.cargo
                + "| salario:" + this.salario + "| ano de contratacao:" + anoContratacao;

    }
}
