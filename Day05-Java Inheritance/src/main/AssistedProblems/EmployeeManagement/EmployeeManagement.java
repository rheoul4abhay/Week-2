package main.AssistedProblems.EmployeeManagement;

public class EmployeeManagement {
    public static void main(String[] args){
        Employee employee = new Employee(null, 0, 0);
        Manager manager = new Manager("Mark", 1, 1000, 5);
        Intern intern = new Intern("Joe", 2, 500, "Bank Management");
        Developer developer = new Developer("Kylie", 3, 750, "Java");

        employee.displayDetails();
        manager.displayDetails();
        intern.displayDetails();
        developer.displayDetails();
    }
}
