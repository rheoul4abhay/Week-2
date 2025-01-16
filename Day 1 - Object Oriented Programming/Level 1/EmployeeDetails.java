import java.util.Scanner;

class Employee{
	private String name;
	private int id;
	private double salary;
	
	//Constructor
	public Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayDetails(){
		System.out.print("\nEmployee name : " + String.valueOf(name));
		System.out.print("\nEmployee ID : " + String.valueOf(id));
		System.out.print("\nEmployee Salary : " + String.valueOf(salary));
	}
	
}

public class EmployeeDetails{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter employee name -> ");
		String name = scanner.nextLine();
		
		System.out.print("Enter employee id -> ");
		int id = scanner.nextInt();
		
		System.out.print("Enter salary -> ");
		double salary = scanner.nextDouble();
		
		Employee employee = new Employee(name, id, salary);
		System.out.print("Employee Details : \n");
		employee.displayDetails();
		scanner.close();
	}
}