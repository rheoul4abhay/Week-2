import java.util.Scanner;

class Course{
	//Class variable i.e shared by all the instances
	private static String instituteName = "Oxford University";
	
	//Instance variables
	public String courseName;
	private int duration;
	private double fee;
	
	Course(String courseName, int duration, double fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	public void displayCourseDetails(){
		System.out.print("\nCourse name : " + courseName);
		System.out.print("\nCourse duration : " + duration + " years");
		System.out.print("\nCourse fee : $" + fee);
		System.out.print("\nInstitute name : " + instituteName);
	}
	
	public static void updateInstituteName(String newName){
		instituteName = newName;
	}
}

public class OnlineCourseManagement{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter course name: ");
		String name = scanner.nextLine();
		System.out.print("Enter duration(in years): ");
		int duration = scanner.nextInt();
		System.out.print("Enter fee: $");
		double fee = scanner.nextDouble();

		Course course1 = new Course(name, duration, fee);
		course1.displayCourseDetails();
		System.out.println();
		Course.updateInstituteName("Stanford University");
		course1.displayCourseDetails();
		scanner.close();
	}
	
}
