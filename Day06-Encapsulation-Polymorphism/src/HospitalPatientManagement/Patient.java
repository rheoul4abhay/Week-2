package HospitalPatientManagement;

public abstract class Patient {

    private String patientID;
    private String patientName;
    private int patientAge;

    public Patient(String patientID, String patientName, int patientAge){
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientAge = patientAge;
    }

    //getters
    public String getPatientID(){
        return patientID;
    }

    public String getPatientName(){
        return patientName;
    }

    public int getPatientAge(){
        return patientAge;
    }

    public void getPatientDetails(){
        System.out.print("\n------Displaying patient details------");
        System.out.print("\nPatient ID: " + getPatientID());
        System.out.print("\nPatient Name: " + getPatientName());
        System.out.print("\nPatient Age: " + getPatientAge());
    }

    abstract double calculateBill();
}
