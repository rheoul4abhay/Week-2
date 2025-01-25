package main.MultiLevelInheritance.EducationalCourseHierarchy;

public class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, double courseDuration, String platform, boolean isRecorded, double fee, double discount){
        super(courseName, courseDuration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void displayInfo(){
        System.out.println("\nCourse name -> " + courseName);
        System.out.println("Course Duration(Months) -> " + courseDuration);
        System.out.println("Platform -> " + platform);
        System.out.println("Is Recorded -> " + (isRecorded ? "Yes" : "No"));
        System.out.println("Course Fee -> $" + fee);
        System.out.println("Course Discount(%) -> " + discount);
    }
}
