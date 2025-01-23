import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }
}

public class CompanyManagementSystem {
    public static void main(String[] args) {
        Company company = new Company("Tech Corp");

        Department itDept = new Department("IT");
        itDept.addEmployee(new Employee("John"));
        itDept.addEmployee(new Employee("Jane"));

        company.addDepartment(itDept);
    }
}