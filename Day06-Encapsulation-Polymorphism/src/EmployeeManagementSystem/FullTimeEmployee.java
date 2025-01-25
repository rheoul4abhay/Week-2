package EmployeeManagementSystem;

public class FullTimeEmployee extends Employee implements Department {

    private double fixedSalary;
    private String fullTimeEmployeedepartment;

    FullTimeEmployee(String name, String fullTimeEmployeeID, double fixedSalary){
        super(name, fullTimeEmployeeID);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public void calculateSalary(){
        setSalary(fixedSalary);
    }

    @Override
    public void assignDepartment(String department){
        fullTimeEmployeedepartment = department;
    }

    @Override
    public String getDepartmentDetails(){
        return fullTimeEmployeedepartment;
    }

    @Override
    public void displayDetails(){
        System.out.println("\nDisplaying Full Time Employee " + getName() + "'s details");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getEmployeeID());
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Fixed Salary: $" + getSalary());
    }


}
