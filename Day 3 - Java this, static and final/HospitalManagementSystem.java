package Day3.level1;

class Patient {
  static String hospitalName = "XYZ Hospital";
  static int totalPatients = 0;

  final String patientID;
  String name;
  int age;
  String ailment;

  Patient(String name, int age, String ailment, String patientID) {
    this.name = name;
    this.age = age;
    this.ailment = ailment;
    this.patientID = patientID;
    totalPatients++;
  }

  static void getTotalPatients() {
    System.out.println("Total patients admitted: " + totalPatients);
  }

  void displayPatientInfo() {
    if (this instanceof Patient) {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Ailment: " + ailment);
      System.out.println("Patient ID: " + patientID);
    }
  }
}

public class HospitalManagementSystem {

  public static void main(String[] args) {

    Patient p1 = new Patient("Mark", 30, "Flu", "P1001");
    Patient p2 = new Patient("Lucy", 45, "Diabetes", "P1002");

    p1.displayPatientInfo();
    p2.displayPatientInfo();

    Patient.getTotalPatients();

  }

}
