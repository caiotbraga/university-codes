package p2.POO.usapessoa;

import java.util.Scanner;

public class usapessoa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        char genero;
        int idade;
        double peso;
        double altura;
        System.out.println("Informe o nome da pessoa:");
        nome = in.nextLine();
        System.out.println("Informe a idade:");
        idade = in.nextInt();
        System.out.println("Informe o genero:");
        genero = in.next().charAt(0);
        System.out.println("Informe o peso:");
        peso = in.nextDouble();
        System.out.println("Informe a altura:");
        altura = in.nextDouble();
        pessoa pessoa1 = new pessoa(nome, genero, idade, peso, altura);
        System.out.println("Pessoa 1: " + pessoa1);
        System.out.println("Informe a nova altura da pessoa 1:");
        altura = in.nextDouble();
        pessoa1.atualizarAltura(altura);
        System.out.println("Informe o novo peso da pessoa 1:");
        peso = in.nextDouble();
        pessoa1.atualizarPeso(peso);
        System.out.println("Informe a nova idade da pessoa 1:");
        idade = in.nextInt();
        pessoa1.atualizarIdade(idade);
        System.out.println("Pessoa 1: " + pessoa1);

        System.out.print("Informe o nome da pessoa: ");
        nome = in.next();
        System.out.println("Informe a idade: ");
        idade = in.nextInt();
        System.out.println("Informe o gênero: ");
        genero = in.next().charAt(0);
        System.out.print("Informe o peso: ");
        peso = in.nextDouble();
        System.out.print("Informe a altura: ");
        altura = in.nextDouble();
        pessoa pessoa2 = new pessoa(nome, genero, idade, peso, altura);
        System.out.println("Pessoa 2: " + pessoa2);
        System.out.print("Informe a nova altura da pessoa 2:");
        altura = in.nextDouble();
        pessoa2.atualizarAltura(altura);
        System.out.println("Informe o novo peso da pessoa 2:");
        peso = in.nextDouble();
        pessoa2.atualizarPeso(peso);
        System.out.println("Informe a nova idade da pessoa 2:");
        idade = in.nextInt();
        pessoa2.atualizarIdade(idade);
        System.out.println("Pessoa 2: " + pessoa2);
    }
}
