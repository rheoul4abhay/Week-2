class BankAccount{
	public int accountNumber;
	protected String accountHolder;
	private double balance;
	
	BankAccount(int accountNumber, String accountHolder, double balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void displayAccountDetails(){
		System.out.print("\nAccount number: " + accountNumber);
		System.out.print("\nAccount Holder name : " + accountHolder);
		System.out.print("\nAccount balance : $" + getBalance());
	}
}

class SavingsAccount extends BankAccount{
	public static double interestRate = 4.0;

	SavingsAccount(int accountNumber, String accountHolder, double balance){
		super(accountNumber, accountHolder, balance);
	}
	
	public static void setInterestRate(double newInterest){
		interestRate = newInterest;
	}
	
	public double getInterestRate(){
		return interestRate;
	}
	
	public void displaySavingsAccountDetails(){
		System.out.print("\nAccount number: " + accountNumber);
		System.out.print("\nAccount Holder name : " + accountHolder);
		System.out.print("\nAccount balance : $" + getBalance());
		System.out.print("\nInterest Rate: " + getInterestRate());
	}
}

public class BankAccountManager{
	
	public static void main(String[] args){
		BankAccount account1 = new BankAccount(12345, "Abhay", 1000.0);
		account1.displayAccountDetails();
		account1.setBalance(2000.0);
		System.out.println();
		account1.displayAccountDetails();
		
		System.out.println();
		SavingsAccount sAccount1 = new SavingsAccount(101010, "Ganesh", 5000.0);
		sAccount1.displaySavingsAccountDetails();
		System.out.println();
		
		SavingsAccount.setInterestRate(10.0);
		sAccount1.displaySavingsAccountDetails();
	}
	
}