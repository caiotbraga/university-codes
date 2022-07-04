package p2.POO.empresa;

public class cadastro {
    private funcionario[] cadastros;
    private int cont;

    public cadastro() {
        this.cadastros = new funcionario[1000];
    }

    public void admissao(funcionario novoFuncionario) {
        if (this.cont == cadastros.length) {
            System.out.println("Número de funcionarios admitidos ja atingiu o limite!");
        } else {
            if (buscar(novoFuncionario.getMatricula()) == -1) {
                this.cadastros[this.cont] = novoFuncionario;
                cont++;
                System.out.println("Funcionário admitido com sucesso!");
            } else {
                System.out.println("Funcionário ja encontra-se na empresa!");
            }
        }
    }

    public int buscar(String mat) {
        int i;
        String matricula;
        if (this.cont == 0) {
            return -1;
        } else {
            for (i = 0; i < this.cont; i++) {
                matricula = this.cadastros[i].getMatricula();
                if (matricula.compareTo(mat) == 0) {
                    return i;
                }
            }
            return -1;
        }
    }

    public void exibirCadastro() {
        int i;
        if (this.cont == 0) {
            System.out.println("Nao tem nenhum funcionario na empresa!");
        } else {
            for (i = 0; i < this.cont; i++) {
                System.out.println(this.cadastros[i]);
            }
        }
    }

    public void aumentarSalario(String matricula, Double percentual) {
        int i;
        int pos;
        String mat;
        pos = buscar(matricula);
        if (pos == -1) {
            System.out.println("Matricula inexistente!");
        } else {
            for (i = 0; i < this.cont; i++) {
                mat = this.cadastros[pos].getMatricula();
                if (mat.compareTo(matricula) == 0) {
                    this.cadastros[pos].aplicarAumento(percentual);
                }
            }
        }
    }

    public void exibirUmFuncionario(String matricula) {
        int pos;
        pos = buscar(matricula);
        if (pos == -1) {
            System.out.println("Matricula inexistente!");
        } else {
            System.out.println(this.cadastros[pos]);
        }
    }

    public void demitirFuncionario(String matricula) {
        int pos;
        pos = buscar(matricula);
        funcionario[] demitidos = new funcionario[this.cont];
        if (pos == -1) {
            System.out.println("Matricula inexistente!");
        } else {
            this.cadastros[pos] = demitidos[pos];
        }
    }

}
