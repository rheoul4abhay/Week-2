package main.AssistedProblems.EmployeeManagement;


public class Developer extends Employee{
    String programmingLanguage;
    
    public Developer(String name, int ID, double salary, String language){
        super(name, ID, salary);
        this.programmingLanguage = language;
    }

	@Override
    public void displayDetails(){
        System.out.println("\nDeveloper details : ");
        System.out.println("name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Programming language: " + programmingLanguage);
        System.out.println("Salary: $" + salary);
    }
}