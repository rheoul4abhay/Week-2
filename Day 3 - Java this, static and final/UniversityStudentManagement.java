package Day3.level1;

class Student {
  static String universityName = "ABC University";
  static int totalStudents = 0;

  final int rollNumber;
  String name;
  String grade;

  Student(String name, int rollNumber, String grade) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.grade = grade;
    totalStudents++;
  }

  static void displayTotalStudents() {
    System.out.println("Total students enrolled: " + totalStudents);
  }

  void displayStudentInfo() {
    if (this instanceof Student) {
      System.out.println("Name: " + name);
      System.out.println("Roll Number: " + rollNumber);
      System.out.println("Grade: " + grade);
    }
  }
}

public class UniversityStudentManagement {

  public static void main(String[] args) {

    Student s1 = new Student("Alice", 101, "A");
    Student s2 = new Student("Bob", 102, "B");

    s1.displayStudentInfo();
    s2.displayStudentInfo();

    Student.displayTotalStudents();

  }

}
