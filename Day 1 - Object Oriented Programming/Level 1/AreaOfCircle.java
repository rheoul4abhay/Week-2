import java.util.Scanner;

class Circle{
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getArea(double radius){
		return (Math.PI * Math.pow(radius, 2));
	}
	
	public double getCircumference(double radius){
		return (2*Math.PI*radius);
	}
	
	public void displayResult(){
		double area = getArea(radius);
		System.out.print("Area  of circle is : " + String.valueOf(area));
		double circumference = getCircumference(radius);
		System.out.print("\nCircumference of circle is : " + String.valueOf(circumference));
	}
}

class AreaOfCircle{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		double radius = scanner.nextDouble();

		Circle circle = new Circle(radius);
		circle.displayResult();
	}
}