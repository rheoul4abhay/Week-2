package BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable{

    private static final double interestRate = 0.0;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance){
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public double calculateInterest(){
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount){
        System.out.print("\nLoan Application for $" + amount + " sent successfully!");
    }

    @Override
    public boolean calculateLoanEligibility(){
        return getBalance() >= 10000.0;
    }
}
