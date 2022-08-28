package P3.A1.BankSystem;

import P3.A1.Enums.AccountType;

public class Account {
    private String accountNumber;
    private Double balance;
    private String accountName;
    private AccountType accountType;
   
    public Account(String accountNumber, String accountName, AccountType type) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0.0;
        this.accountType = type;
    }
 
    public String getAccountNumber() {
        return accountNumber;
    }
   
    public Double getBalance() {
        return balance;
    }
   
    public void deposit(double value){

        balance += value;
    }
 
    public void withdraw(double value){
        if(balance >= value){
            balance -= value;
        }
        else{
            System.out.println("You can't cash out more than your balance!");
        }
    }
   
    public String toString() {
        return "Account name :" +accountName+
         "|| Account number :" +accountNumber+
         "|| Balance :" +balance;    
    }
}
