package main.AssistedProblems.EmployeeManagement;


public class Intern extends Employee{
    String projectAssigned;
    
    public Intern(String name, int ID, double salary, String project){
        super(name, ID, salary);
        this.projectAssigned = project;
    }

	@Override
    public void displayDetails(){
        System.out.println("\nIntern details : ");
        System.out.println("name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Project: "+ projectAssigned);
        System.out.println("Salary: $" + salary);
    }
}
