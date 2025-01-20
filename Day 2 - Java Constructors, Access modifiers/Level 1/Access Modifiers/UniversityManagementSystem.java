class Student{
	public int rollNumber;
	protected String name;
	private double CGPA;
	
	public Student(int rollNumber, String name, double CGPA){
		this.rollNumber = rollNumber;
		this.name = name;
		this.CGPA = CGPA;
	}
	
	public void setCGPA(double newCGPA){
		if(CGPA >= 0.0 && CGPA <= 10.0) {
			this.CGPA = newCGPA;
		}
		else {
			System.out.println("Invalid CGPA value. It must be between 0 to 10");
		}
	}
	
	public double getCGPA(){
		return CGPA;
	}
	
	public void displayStudentDetails(){
		System.out.print("\nRoll number : " + rollNumber);
		System.out.print("\nName : " + name);
		System.out.print("\nCGPA : " + getCGPA());
	}
}

class PostgraduateStudent extends Student{
	private String mastersDegreeName;
	
	PostgraduateStudent(int rollNumber, String name, double CGPA, String mastersDegreeName){
		super(rollNumber, name, CGPA);
		this.mastersDegreeName = mastersDegreeName;
	}
	
	public void displayPostgraduateDetails(){
		System.out.print("\nDisplaying post graduation details : ");
		System.out.print("\nRoll number : " + rollNumber);
		System.out.print("\nName : " + name);
		System.out.print("\nCGPA : " + getCGPA());
		System.out.print("\nMaster's Degree : " + mastersDegreeName);
	}
}

public class UniversityManagementSystem{
	
	public static void main(String[] args){
		Student s1 = new Student(6, "Abhay Shrivastava", 7.56);
		s1.displayStudentDetails();
		
		s1.setCGPA(7.24);
		//after updating cgpa
		s1.displayStudentDetails();
		
		PostgraduateStudent pg1 = new PostgraduateStudent(12, "Ram Kumar", 9.44, "MCA");
		pg1.displayPostgraduateDetails();
		
		pg1.setCGPA(6.69);
		pg1.displayPostgraduateDetails();
		
	}
}