package main.HierarchicalInheritance.SchoolSystem;

public class Person {
    
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayRole(){
        System.out.println("\nName -> " + name);
        System.out.println("Age -> " + age);
        System.out.println("Role -> Person");
    }
}
