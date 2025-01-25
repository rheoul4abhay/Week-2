package main.HierarchicalInheritance.BankAccountTypes;

import java.util.ArrayList;

public class BankAccountTypes {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount(0, 0.0));
        accounts.add(new SavingsAccount(123, 100.0, 10.0));
        accounts.add(new CheckingAccount(12345, 500.0, 1000));
        accounts.add(new FixedDepositAccount(98765, 1500, 5.0));

        for(BankAccount account : accounts){
            account.displayAccountTypes();
        }
    }
}
