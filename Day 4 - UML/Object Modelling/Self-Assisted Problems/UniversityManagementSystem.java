import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }
}

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        University university = new University("Tech University");
        Department csDept = new Department("Computer Science");
        Faculty drSmith = new Faculty("Dr. Smith");

        university.addDepartment(csDept);
        university.addFaculty(drSmith);
    }
}
