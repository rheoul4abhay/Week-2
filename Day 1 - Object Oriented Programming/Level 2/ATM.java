import java.util.Scanner;

class BankAccount{
	Scanner scanner = new Scanner(System.in);
	private String accountHolder;
	private int accountNumber;
	private double balance;
	
	public int welcomeUser(){
		System.out.print("\n-----------Welcome To Bank Of Geeks---------------\n");
		System.out.print("\nChoose one of the below services");
		System.out.print("\n1. Deposit");
		System.out.print("\n2. Withdraw");
		System.out.print("\n3. Check Balance");
		System.out.print("\n4. Show Account Details");
		System.out.print("\nEnter one of the 4 choices -> ");
		int input = scanner.nextInt();
		return input;
	}
	
	public BankAccount(String accountHolder, int accountNumber, double balance){
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void depositMoney(double amountToDeposit){
		System.out.print("\nDeposited amount -> " + String.valueOf(amountToDeposit));
		balance += amountToDeposit;
		System.out.print("\nNew balance -> " + String.valueOf(balance));
	}
	
	public void withdrawMoney(double amountToWithdraw){
		if(amountToWithdraw <= balance){
			System.out.print("\nWithdrawn amount -> " + String.valueOf(amountToWithdraw));
			balance -= amountToWithdraw;
			System.out.print("\nNew balance -> " + String.valueOf(balance));
		}
		else System.out.print("\nInsufficient Funds to withdraw.");
	}
	
	public void checkBalance(){
		System.out.print("\nAvailable balance -> " + String.valueOf(balance));
	}
	
	public void displayDetails(){
		System.out.print("\n--------Displaying details--------\n");
		System.out.print("\nAccount Holder -> " + accountHolder);
		System.out.print("\nAccount Number -> " + String.valueOf(accountNumber));
		System.out.print("\nAvailable Balance -> " + String.valueOf(balance));
	}
	
	public void methodHandler(int input){
		if(input == 1 || input == 2 || input == 3 || input == 4){
			switch(input){
			case 1:
				System.out.print("\nEnter amount to deposit -> ");
				double depositAmount = scanner.nextDouble();
				depositMoney(depositAmount);
				break;
				
			case 2:
				System.out.print("\nEnter amount to withdraw -> ");
				double withdrawAmount = scanner.nextDouble();
				withdrawMoney(withdrawAmount);
				break;
			
			case 3:
				checkBalance();
				break;
			
			case 4:
				displayDetails();
				break;
			}
		}
		else{
			System.out.print("\nEnter a valid operation number");
		}
	}
	
	public void bankHandler(){
		int input = welcomeUser();
		methodHandler(input);
	}
}

public class ATM{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter account holder name -> ");
		String accountHolder = scanner.nextLine();
		
		System.out.print("\nEnter account number -> ");
		int accountNumber = scanner.nextInt();
		
		System.out.print("\nEnter bank balance -> ");
		double balance = scanner.nextDouble();
		
		BankAccount bankAccount = new BankAccount(accountHolder, accountNumber, balance);
		bankAccount.bankHandler();
		scanner.close();
	}
}