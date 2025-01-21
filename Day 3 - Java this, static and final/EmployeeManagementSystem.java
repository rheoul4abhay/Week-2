class Employee{
	static String companyName = "Amazon";
	static int totalEmployee = 0;
	
	private String employeeName;
	final private int employeeID;
	private double salary;
	private String designation;
	
	Employee(String employeeName, int employeeID, double salary, String designation){
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.salary = salary;
		this.designation = designation;
		totalEmployee++;
	}
	
	public void displayEmployeeDetails(){
		System.out.print("\nEmployee Name : " + employeeName);
		System.out.print("\nEmployee ID : " + employeeID);
		System.out.print("\nEmployee Designation : " + designation);
		System.out.print("\nEmployee salary : " + getSalary());
	}
	
	public void setSalary(double newSalary){
		salary = newSalary;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public static void displayTotalEmployees(){
		System.out.print("\nTotal number of employees : " + totalEmployee);
	}
}

public class EmployeeManagementSystem{
	public static void main(String[] args){
		Employee abhay = new Employee("Abhay", 123, 1000, "IT Manager");
		boolean result = abhay instanceof Employee;
		abhay.setSalary(2000);
		abhay.displayEmployeeDetails();
		
		Employee ram = new Employee("Ram", 010, 500, "Accountant");

		Employee.displayTotalEmployees();
		System.out.print("\nIs instance of ? " + result);
	}
}