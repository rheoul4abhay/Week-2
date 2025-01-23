import java.util.ArrayList;

class Account{
	String accountNumber;
	String holderName;
	double accountBalance;
	
	Account(String accountNumber, String holderName,double accountBalance){
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.accountBalance = accountBalance;
	}
	
	public void depositMoney(double amount){
		if(amount > 0) {
			accountBalance += amount;
			System.out.println("Deposited " + amount + ". New Balance : " + accountBalance);
		} else {
			System.out.println("Amount must be positive. ");
		}
	}
	
	public void withdraw(double amount){
		if(amount > 0 && (amount <= accountBalance)) {
			accountBalance -= amount;
			System.out.println("Withdrew " + amount + ". New Balance : " + accountBalance);
		} else{
			System.out.println("Insufficient balance or invalid amount. ");
		}
	}
	
	public double viewBalance(){
		return accountBalance;
	}
	
}
class Customer{
	String name;
	ArrayList<Account> accounts;
	
	Customer(String name){
		this.name = name;
		accounts = new ArrayList<>();
	}
	
	public void openAccount(Bank bank, String accountNumber, double initialBalance){
		Account account = bank.openAccount(this, accountNumber, initialBalance);
		accounts.add(account);
	}
	
	double viewBalance(String accountNumber){
		for (Account account: accounts) {
			if(account.accountNumber.equals(accountNumber)){
				return account.viewBalance();
			}
		}
		return -1;
	}
}

class Bank{
	String bankName;
	ArrayList<Account> accounts;
	
	Bank(String bankName){
		this.bankName = bankName;
		accounts = new ArrayList<>();
	}
	
	public Account openAccount(Customer customer, String accountNumber, double initialBalance){
		Account account = new Account(accountNumber, customer.name, initialBalance);
		accounts.add(account);
		System.out.println("Account opened for " + customer.name + " with account number " + accountNumber + ".");
		return account;
	}
}

public class BankManagement{
	public static void main(String[] args){
		Bank bank = new Bank("HDFC Bank");
		Customer customer1 = new Customer("Abhay");
		
		customer1.openAccount(bank, "1234", 1000);
		customer1.openAccount(bank, "12345", 500);
		
		System.out.println("Balance for account 1234: " + customer1.viewBalance("1234"));
		System.out.println("Balance for account 12345: " + customer1.viewBalance("12345"));
		
		customer1.accounts.get(0).depositMoney(500);
		customer1.accounts.get(1).withdraw(200);
	}
}
