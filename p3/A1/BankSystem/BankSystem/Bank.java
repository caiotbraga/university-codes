package P3.A1.BankSystem;

import java.util.ArrayList;
import java.util.Scanner;

import P3.A1.Enums.AccountType;



public class Bank {
 
    private ArrayList<Account> accounts;
 
    public Bank() {
        this.accounts = new ArrayList();
    }

    public void transferMoney(String accountN1, String accountN2, double amount){
        getAccount(accountN1).withdraw(amount);
        getAccount(accountN2).deposit(amount);
    }

    public Account getAccount(String accountNumber){
        for (Account account : accounts) {
            if (account.getAccountNumber().compareTo(accountNumber) == 0) {
                return account;
            }
        }
        return null;
    }

    public void makeWithdraw(double amount, String accountNumber){
        Account acc = getAccount(accountNumber);
        if(acc != null){
            acc.withdraw(amount);
        }
    }

    public void makeDeposit(double amount, String accountNumber){
        Account acc = getAccount(accountNumber);
        if(acc != null){
            acc.deposit(amount);
        }
    }
    public boolean ExistingAccount(String accountNumber) {
        if(getAccount(accountNumber) != null){
            return true;
        }
        return false;
    }
 
    public void createCheckingAccount(String accountNumber, String userName) {
        if (!ExistingAccount(accountNumber)) {
            accounts.add(new Account(accountNumber, userName, AccountType.CHECKING));
        }
    }

    public void createSavingsAccount(String accountNumber, String userName) {
        if (!ExistingAccount(accountNumber)) {
            accounts.add(new Account(accountNumber, userName, AccountType.SAVINGS));
        }
    }
 
    public static void menu(){
        System.out.println("1: Create new account");
        System.out.println("2: Check account balance");
        System.out.println("3: Withdraw money");
        System.out.println("4: Deposit money");
        System.out.println("5: Transfer money to another account");
        System.out.println("6: Exit program");
        System.out.println("Insert the option:");
    }
}


