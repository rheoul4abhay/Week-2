import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void viewCourses() {
        System.out.println(name + "'s Enrolled Courses:");
        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }
}

class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : students) {
            System.out.println(student.name);
        }
    }
}

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void admitStudent(Student student) {
        students.add(student);
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        school.admitStudent(alice);
        school.admitStudent(bob);

        Course math = new Course("Math");
        Course science = new Course("Science");

        alice.enroll(math);
        alice.enroll(science);
        bob.enroll(science);

        alice.viewCourses();
        science.showStudents();
    }
}
