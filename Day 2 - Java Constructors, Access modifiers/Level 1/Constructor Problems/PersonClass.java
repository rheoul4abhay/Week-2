import java.util.Scanner;

class Person{
	String name;
	int age;
	
	Person(){
		this("Unknown", 0);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//copy constructor taking other objects as the parameter
	Person(Person person){
		this.name = person.name;
		this.age = person.age;
	}
	
	public void displayDetails(){
		System.out.print("\nName of person : " + name);
		System.out.print("\nAge of person : " + age);
	}
}

public class PersonClass{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter name : ");
		String name = scanner.nextLine();
		System.out.print("\nEnter age : ");
		int age = scanner.nextInt();
		
		Person abhay = new Person(name, age);
		abhay.displayDetails();
		
		Person rahul = new Person(abhay);
		rahul.displayDetails();
		
		scanner.close();	
	}
}