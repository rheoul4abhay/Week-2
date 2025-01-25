package main.HierarchicalInheritance.SchoolSystem;

public class Teacher extends Person{

    String subject;
    public Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    public void displayRole(){
        System.out.println("\nName -> " + name);
        System.out.println("Age -> " + age);
        System.out.println("Teaching Subject -> " + subject);
        System.out.println("Role -> Teacher");
    }
}
