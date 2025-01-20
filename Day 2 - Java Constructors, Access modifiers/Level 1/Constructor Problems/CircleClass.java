import java.util.Scanner;

class Circle {
	double radius;
	double area;
	
	Circle(){
		this(0.00);
		this.area = 0.00;
	}
	
	Circle(double radius){
		this.radius = radius;
		this.area = findArea(radius);
	}
	
	public double findArea(double radius){
		return (Math.PI)*(Math.pow(radius,2));
	}
	
	public void displayDetails(){
		System.out.print("\nRadius of circle : " + radius);
		System.out.print("\nArea of circle is " + area);
	}
}

public class CircleClass{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter radius of circle : ");
		double radius = scanner.nextDouble();
		
		System.out.println();
		Circle circle1 = new Circle();
		circle1.displayDetails();
		
		System.out.println();
		Circle circle2 = new Circle(radius);
		circle2.displayDetails();
		scanner.close();
	}
}