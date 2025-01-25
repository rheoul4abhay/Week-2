package main.MultiLevelInheritance.EducationalCourseHierarchy;

public class EducationalCourseHierarchy {
    public static void main(String[] args){
        Course course = new Course("Mathematics", 1.5);
        OnlineCourse onlineCourse = new OnlineCourse("Mathematics", 1.5, "YouTube", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Mathematics", 1.5, "YouTube", true, 1000.0, 5.0);

        course.displayInfo();
        onlineCourse.displayInfo();
        paidOnlineCourse.displayInfo();
    }
}
