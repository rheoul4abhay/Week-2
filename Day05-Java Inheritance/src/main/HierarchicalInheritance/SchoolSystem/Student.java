package main.HierarchicalInheritance.SchoolSystem;

public class Student extends Person{

    String grade;
    public Student(String name, int age, String grade){
        super(name, age);
        this.grade = grade;
    }

    public void displayRole(){
        System.out.println("\nName -> " + name);
        System.out.println("Age -> " + age);
        System.out.println("Grade -> " + grade);
        System.out.println("Role -> Student");
    }
}
