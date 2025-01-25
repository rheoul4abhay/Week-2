package main.AssistedProblems.EmployeeManagement;


public class Employee{
    String name;
    int ID;
    double salary;

    public Employee(String name, int ID, double salary){
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("\nEmployee details : ");
        System.out.println("name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Salary: $" + salary);
    }
}