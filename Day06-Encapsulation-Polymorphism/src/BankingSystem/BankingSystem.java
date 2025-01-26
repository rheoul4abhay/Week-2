package BankingSystem;

import java.util.ArrayList;

public class BankingSystem {
    public static void main(String[] args){
        ArrayList<BankAccount> accounts = new ArrayList<>();

        SavingsAccount savingsAccount = new SavingsAccount("@123", "Will Smith", 6000.0);
        CurrentAccount currentAccount = new CurrentAccount("@456", "Ken Kaneki", 9000.0);

        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        for(BankAccount account : accounts){
            System.out.print("\nAccount Holder: " + account.getAccountHolderName());
            System.out.print("\nAccount Number: " + account.getAccountNumber());
            System.out.print("\nInitial Balance: " + account.getBalance());

            //Deposit and withdraw from account
            account.deposit(500.0);
            account.withdraw(1500.0);
            System.out.println();
            System.out.print("\nInterest: " + account.calculateInterest());

            //Check for loan eligibility and apply if eligible
            if(account instanceof Loanable){
                Loanable loanableAccount = (Loanable) account;
                if(loanableAccount.calculateLoanEligibility()){
                    loanableAccount.applyForLoan(20000.0);
                }
                else {
                    System.out.print("\nLoan eligibility not met!");
                }
            }
            System.out.println();
        }
    }
}
