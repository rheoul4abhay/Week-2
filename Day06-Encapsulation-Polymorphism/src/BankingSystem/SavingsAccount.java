package BankingSystem;

public class SavingsAccount extends BankAccount implements Loanable {

    private static final double interestRate = 0.04;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance){
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public double calculateInterest(){
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount){
        System.out.print("\nLoan application for $" + amount + " sent successfully!");
    }

    @Override
    public boolean calculateLoanEligibility(){
        return getBalance() >= 5000.0;
    }
}
