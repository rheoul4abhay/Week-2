package EmployeeManagementSystem;

public class PartTimeEmployee extends Employee implements Department{

    double workingHours;
    double perHourPay;
    private String partTimeEmployeeDepartment;

    PartTimeEmployee(String name, String partTimeEmployeeID, double workingHours, double perHourPay){
        super(name, partTimeEmployeeID);
        this.workingHours = workingHours;
        this.perHourPay = perHourPay;
    }

    @Override
    public void calculateSalary(){
        setSalary((workingHours*perHourPay));
    }

    @Override
    public void assignDepartment(String department){
        partTimeEmployeeDepartment = department;
    }

    @Override
    public String getDepartmentDetails(){
        return partTimeEmployeeDepartment;
    }

    @Override
    public void displayDetails(){
        System.out.println("\nDisplaying Part Time Employee " + getName() + "'s details");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getEmployeeID());
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Monthly Working Hours: " + workingHours);
        System.out.println("Pay per Hour: $" + perHourPay);
        System.out.println("Salary: $" + getSalary());
    }

}
