import java.util.Scanner;

class Student{
	private String name;
	private int roll;
	private double marks;
	
	public Student(String name, int roll, double marks){
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	public char getGrade(double marks){
		if(marks >= 95) return 'A';
		else if(marks >= 80 && marks < 95) return 'B';
		else if(marks >= 70 && marks < 80) return 'C';
		else if(marks >= 60 && marks < 70) return 'D';
		else if(marks >= 50 && marks < 60) return 'E';
		else return 'F';
	}
	
	public void displayDetails(){
		char grade = getGrade(marks);
		System.out.print("\nStudent name -> " + name);
		System.out.print("\nStudent roll number -> " + String.valueOf(roll));
		System.out.print("\nStudent marks -> " + String.valueOf(marks));
		System.out.print("\nStudent Grade -> " + String.valueOf(grade));
	}
}

public class StudentReport{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter student name -> ");
		String name = scanner.nextLine();
		
		System.out.print("Enter student roll number -> ");
		int roll = scanner.nextInt();
		
		System.out.print("Enter student marks -> ");
		double marks = scanner.nextDouble();
		
		Student student = new Student(name, roll, marks);
		student.displayDetails();
		
		scanner.close();
	}
}