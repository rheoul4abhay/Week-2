package EmployeeManagementSystem;

public abstract class Employee {

    private String name;
    private final String employeeID;
    private double employeeSalary;

    public Employee(String name, String employeeID){
        this.name = name;
        this.employeeID = employeeID;
    }

    public String getName(){
        return name;
    }

    public String getEmployeeID(){
        return employeeID;
    }

    public double getSalary(){
        return employeeSalary;
    }

    public void setSalary(double salary){
        employeeSalary = salary;
    }

    abstract void calculateSalary();

    public void displayDetails(){
        System.out.println("Displaying Employee " + getName() + "'s details");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getEmployeeID());
        System.out.println("Salary: $" + getSalary());
    }
}
