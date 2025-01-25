package main.MultiLevelInheritance.EducationalCourseHierarchy;

public class Course {
    String courseName;
    double courseDuration;

    public Course(String courseName, double courseDuration){
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }

    public void displayInfo(){
        System.out.println("\nCourse name -> " + courseName);
        System.out.println("Course Duration(Months) -> " + courseDuration);
    }
}
