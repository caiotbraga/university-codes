package p2.POO.empresa;

import java.util.Scanner;

public class empresa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        String matricula;
        String nome;
        String cargo;
        Double salario;
        int anoContratacao;
        double percentual;
        cadastro funcoesCadastro = new cadastro();
        do {
            menu();
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe a matricula:");
                    matricula = in.next();
                    System.out.println("Informe o nome:");
                    nome = in.next();
                    System.out.println("Informe o cargo:");
                    cargo = in.next();
                    System.out.println("Informe o salário:");
                    salario = in.nextDouble();
                    System.out.println("Informe o ano de contratacao:");
                    anoContratacao = in.nextInt();
                    funcionario funcionarios = new funcionario(matricula, nome, cargo, salario, anoContratacao);
                    funcoesCadastro.admissao(funcionarios);
                    break;
                case 2:
                    funcoesCadastro.exibirCadastro();
                    break;
                case 3:
                    System.out.println("Informe a matricula:");
                    matricula = in.next();
                    System.out.println("Informe o percentual de aumento:");
                    percentual = in.nextDouble();
                    funcoesCadastro.aumentarSalario(matricula, percentual);
                    break;
                case 4:
                    System.out.println("Informe a matricula:");
                    matricula = in.next();
                    funcoesCadastro.exibirUmFuncionario(matricula);
                    break;
                case 5:
                    System.out.println("Informe a matricula:");
                    matricula = in.next();
                    funcoesCadastro.demitirFuncionario(matricula);
                    break;
                default:
                    System.out.println("Fim do programa.");
            }
        } while (op != 0);
    }

    public static void menu() {
        System.out.println("1- Cadastrar um novo funcionario");
        System.out.println("2- Exibir as informações de todos funcionarios já cadastrados");
        System.out.println("3- Realizar o aumento do salário de um funcionario");
        System.out.println("4- Exibir os dados de um funcionario");
        System.out.println("5- Demitir um funcionario");
        System.out.println("0- Sair do programa");
    }
}
