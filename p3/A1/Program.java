package BankSystem;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String accountNumber, accountName;

        Bank bank = new Bank(); // Criando a variável do banco para referenciar as contas criadas
        char type;
        double withdraw, deposit;
        int op;
        // como é um metodo estático não precisa de um objeto referenciando?

        do {
            Bank.menu();
            op = in.nextInt();
            while (op != 1 && op != 2 && op != 3 && op != 4 && op != 5) {
                System.out.println("Invalid option! Please insert a valid one:");
                op = in.nextInt();
            }
            switch (op) {
                case 1:
                    System.out.println("What kind of account do you wanna create? Checking or Savings? (c/s)");
                    type = in.next().charAt(0);
                    while (type != 'c' && type != 's') {
                        System.out.println("That's not a valid account type!");
                        System.out.println("What kind of account do you wanna create? Checking or Savings? c/s");
                        type = in.next().charAt(0);
                    }
                    if (type == 'c') {
                        System.out.println("Insert account number:");
                        accountNumber = in.next();
                        while (bank.ExistingAccount(accountNumber)) {
                            System.out.println("This account already exist! Insert another account number: ");
                            accountNumber = in.next();
                        }
                        System.out.println("Insert account holder name:");
                        accountName = in.next();
                        bank.createCheckingAccount(accountNumber, accountName);
                    } else {
                        System.out.print("Insert account number: ");
                        accountNumber = in.next();
                        if (bank.ExistingAccount(accountNumber)) {
                            System.out.println("This account already exist! Insert another account number: ");
                            accountNumber = in.next();
                        }
                        System.out.print("Insert account holder name: ");
                        accountName = in.next();
                        bank.createSavingsAccount(accountNumber, accountName);
                    }
                    break;
                case 2:
                    System.out.print("Insert account number: ");
                    accountNumber = in.next();
                    if (bank.ExistingAccount(accountNumber)) {
                        for (Account acc : bank.getAccountList()) {
                            if (acc.getAccountNumber().compareTo(accountNumber) == 0) {
                                System.out.println(acc);
                            }
                        }
                    } else {
                        System.out.println("This account number doesn't exist!");
                    }
                    break;
                case 3:
                    System.out.print("Insert account number: ");
                    accountNumber = in.next();
                    System.out.print("Insert how much do you want withdraw: ");
                    withdraw = in.nextDouble();
                    if (bank.ExistingAccount(accountNumber)) {
                        for (Account acc : bank.getAccountList()) {
                            if (acc.getAccountNumber().compareTo(accountNumber) == 0) {
                                if (acc.getBalance() > withdraw) {
                                    acc.withdraw(withdraw);
                                    System.out.print("New account balance: " + acc.getBalance());
                                } else {
                                    System.out.println("You don't have enough money to withdraw!");
                                }
                            }
                        }
                    } else {
                        System.out.println("This account number doesn't exist!");
                    }
                    break;
                case 4:
                    System.out.print("Insert account number: ");
                    accountNumber = in.next();
                    System.out.print("Insert how much do you want deposit: ");
                    deposit = in.nextDouble();
                    if (bank.ExistingAccount(accountNumber)) {
                        for (Account acc : bank.getAccountList()) {
                            if (acc.getAccountNumber().compareTo(accountNumber) == 0) {
                                acc.deposit(deposit);
                                System.out.print("New account balance: " + acc.getBalance());
                            }
                        }
                    } else {
                        System.out.println("This account number doesn't exist!");
                    }
                    break;
            }
        } while (op != 5);
    }

}
