package main.HierarchicalInheritance.SchoolSystem;

import java.util.ArrayList;

public class SchoolSystem {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person(null, 0));
        people.add(new Student("Ram", 13, "B"));
        people.add(new Teacher("John", 26, "Mathematics"));
        people.add(new Staff("Mohit", 45, "Library"));

        for(Person person : people){
            person.displayRole();
        }
    }
}
