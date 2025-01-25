package EmployeeManagementSystem;

import java.util.ArrayList;

public class EmployeeManagement {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee abhay = new FullTimeEmployee("Abhay", "@123", 1000.0);
        PartTimeEmployee rohan = new PartTimeEmployee("Rohan", "@789", 100.0, 8.5 );

        abhay.assignDepartment("Machine Learning");
        rohan.assignDepartment("Graphics Designing");

        employees.add(abhay);
        employees.add(rohan);


        for(Employee employee: employees){
            employee.calculateSalary();
            employee.displayDetails();
        }
    }
}
