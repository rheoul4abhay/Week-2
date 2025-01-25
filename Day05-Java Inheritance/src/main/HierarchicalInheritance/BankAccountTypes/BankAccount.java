package main.HierarchicalInheritance.BankAccountTypes;

public class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountTypes(){
        System.out.println("\nAccount type ->Normal Bank Account");
        System.out.println("Account Number -> " + accountNumber);
        System.out.println("Account Balance -> $" + balance);
    }
}
