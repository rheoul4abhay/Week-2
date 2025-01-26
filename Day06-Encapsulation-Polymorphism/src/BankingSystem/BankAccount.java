package BankingSystem;

public abstract class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    //getter methods
    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.print("\n$" + amount + " deposited in account successfully! New Balance: " + getBalance());
        }
        else{
            System.out.print("\nDeposit amount must be a positive number!");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && (amount <= balance)){
            balance -= amount;
            System.out.print("\n$" + amount + " withdrawn from account successfully! New Balance: " + getBalance());
        }
        else{
            System.out.print("\nEnter a valid amount to withdraw!");
        }
    }

    abstract double calculateInterest();
}
