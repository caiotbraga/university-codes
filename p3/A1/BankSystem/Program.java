package P3.A1;

import java.util.Scanner;

import P3.A1.BankSystem.Bank;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String accountNumber, accountName;

        Bank bank = new Bank(); 
        char type;
        double withdraw, deposit;
        int op;       

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
                    if (bank.getAccount(accountNumber) != null) {
                        System.out.println(bank.getAccount(accountNumber));
                    } else {
                        System.out.println("This account number doesn't exist!");
                    }
                    break;
                case 3:
                    System.out.print("Insert account number: ");
                    accountNumber = in.next();
                    System.out.print("Insert how much do you want withdraw: ");
                    withdraw = in.nextDouble();
                    if(bank.getAccount(accountNumber) != null){
                        bank.getAccount(accountNumber).withdraw(withdraw);
                        System.out.println("New account balance: " + bank.getAccount(accountNumber).getBalance());
                    }
                    else {
                        System.out.println("This account number doesn't exist!");
                    }
                    break;
                case 4:
                    System.out.print("Insert account number: ");
                    accountNumber = in.next();
                    System.out.print("Insert how much do you want deposit: ");
                    deposit = in.nextDouble();
                    if(bank.getAccount(accountNumber) != null){
                        bank.getAccount(accountNumber).deposit(deposit);;
                        System.out.println("New account balance: " + bank.getAccount(accountNumber).getBalance());
                    }
                    else {
                        System.out.println("This account number doesn't exist!");
                    }
                    break;
                case 5:
                    System.out.print("Insert account number: ");
                    accountNumber = in.next();
                    System.out.print("Insert the account number that do you want transfer money: ");
                    String accountNumber2 = in.next();
                    System.out.println("Insert how much do you want transfer: ");
                    double amount = in.nextDouble();
                    while(accountNumber.compareTo(accountNumber2) == 0){
                        System.out.println("You can't transfer money to yourself");
                    }
                    bank.transferMoney(accountNumber, accountNumber2, amount);
            }
        } while (op != 6);
    }
}
