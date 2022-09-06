package BankSystem;
import java.util.ArrayList;

import BankSystem.Enums.AccountType;

public class Bank {
    private ArrayList<Account> accounts;
 
    public Bank() {
        this.accounts = new ArrayList();
    }
 
    public ArrayList<Account> getAccountList(){
        return accounts;
    }
 
    public boolean ExistingAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().compareTo(accountNumber) == 0) {
                return true;
            }
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
        System.out.println("-------------------------------------");
        System.out.println("1: Create new account");
        System.out.println("2: Check account balance");
        System.out.println("3: Withdraw money");
        System.out.println("4: Deposit money");
        System.out.println("5: Exit program");
        System.out.println("Insert the option:");
        System.out.println("-------------------------------------");
    }
    
}
