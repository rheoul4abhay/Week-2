package main.HierarchicalInheritance.SchoolSystem;

public class Staff extends Person {

    String department;
    public Staff(String name, int age, String department){
        super(name, age);
        this.department = department;
    }

    public void displayRole(){
        System.out.println("\nName -> " + name);
        System.out.println("Age -> " + age);
        System.out.println("Working Department -> " + department);
        System.out.println("Role -> Staff");
    }
}
