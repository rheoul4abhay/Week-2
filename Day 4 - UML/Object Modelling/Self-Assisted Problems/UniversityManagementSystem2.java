import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public void assignCourse(Course course) {
        System.out.println(name + " is assigned to teach " + course.getName());
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        System.out.println(name + " enrolled in " + course.getName());
    }
}

public class UniversityManagementSystem2 {
    public static void main(String[] args) {
        Course course = new Course("Data Structures");
        Professor professor = new Professor("Dr. Brown");
        Student student = new Student("Alice");

        professor.assignCourse(course);
        student.enrollCourse(course);
    }
}
