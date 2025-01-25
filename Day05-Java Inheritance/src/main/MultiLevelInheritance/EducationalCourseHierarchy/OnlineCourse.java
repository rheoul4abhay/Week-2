package main.MultiLevelInheritance.EducationalCourseHierarchy;

public class OnlineCourse extends Course{

    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, double courseDuration, String platform, boolean isRecorded){
        super(courseName, courseDuration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public void displayInfo(){
        System.out.println("\nCourse name -> " + courseName);
        System.out.println("Course Duration(Months) -> " + courseDuration);
        System.out.println("Platform -> " + platform);
        System.out.println("Is Recorded -> " + (isRecorded ? "Yes" : "No"));
    }
}
