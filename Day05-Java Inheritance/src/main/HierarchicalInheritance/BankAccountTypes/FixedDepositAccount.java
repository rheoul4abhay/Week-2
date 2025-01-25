package main.HierarchicalInheritance.BankAccountTypes;

public class FixedDepositAccount extends BankAccount{

    double fixedInterestRate;
    public FixedDepositAccount(int accountNumber, double balance, double fixedInterestRate){
        super(accountNumber, balance);
        this.fixedInterestRate = fixedInterestRate;
    }

    public void displayAccountTypes(){
        System.out.println("\nAccount type ->FD Account");
        System.out.println("Account Number -> " + accountNumber);
        System.out.println("Account Balance -> $" + balance);
        System.out.println("Fixed Deposit Interest -> " + fixedInterestRate);
    }
}
