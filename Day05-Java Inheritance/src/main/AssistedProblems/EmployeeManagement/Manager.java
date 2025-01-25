package main.AssistedProblems.EmployeeManagement;

public class Manager extends Employee{
    int teamSize;
    
    public Manager(String name, int ID, double salary, int teamSize){
        super(name, ID, salary);
        this.teamSize = teamSize;
    }
	
	@Override
    public void displayDetails(){
        System.out.println("\nManager details : ");
        System.out.println("name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Team size: " + teamSize);
        System.out.println("Salary: $" + salary);
    }
}
