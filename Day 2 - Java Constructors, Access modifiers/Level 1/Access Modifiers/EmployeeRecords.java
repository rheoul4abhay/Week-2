class Employee{
	public int employeeID;
	protected String department;
	private double salary;
	
	Employee(int employeeID, String department, double salary){
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
	}
	
	Employee(int employeeID, String department){
		this.employeeID = employeeID;
		this.department = department;
	}
	
	public void setSalary(double newSalary){
		salary = newSalary;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void displayEmployeeDetails(){
		System.out.print("\nEmployee ID : " + employeeID);
		System.out.print("\nEmployee Department : " + department);
		System.out.print("\nEmployee salary : $" + getSalary());
	}
}

class Manager extends Employee{
	
	private double managerSalary;
	
	Manager(int employeeID, String department, double managerSalary){
		super(employeeID, department);
		this.managerSalary = managerSalary;
	}
	
	public void setSalary(double newSalary){
		managerSalary = newSalary;
	}
	
	public double getSalary(){
		return managerSalary;
	}
	
	public void displayManagerDetails(){
		System.out.print("\nManager ID : " + employeeID);
		System.out.print("\nManager Department : " + department);
		System.out.print("\nManager salary : $" + getSalary());
	}
}

public class EmployeeRecords{
	public static void main(String[] args){
		Employee e1 = new Employee(1234, "IT", 5000.00);
		e1.displayEmployeeDetails();
		e1.setSalary(6000.00);
		System.out.println();
		e1.displayEmployeeDetails();
		
		System.out.println();
		
		Manager m1 = new Manager(1010, "IT", 10000.00);
		m1.displayManagerDetails();
		m1.setSalary(12000.00);
		m1.displayManagerDetails();
	}
}