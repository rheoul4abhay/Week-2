package HospitalPatientManagement;

public class InPatient extends Patient implements MedicalRecord{

    private double roomCharge;
    private int daysAdmitted;
    private String diagnosis;
    private StringBuilder medicalHistory;

    InPatient(String patientID, String patientName, int patientAge, double roomCharge, int daysAdmitted, String diagnosis){
        super(patientID, patientName, patientAge);
        this.roomCharge = roomCharge;
        this.daysAdmitted = daysAdmitted;
        this.diagnosis = diagnosis;
        this.medicalHistory = new StringBuilder();
    }

    @Override
    public void addRecord(String record){
        medicalHistory.append(record).append("\n");
    }

    @Override
    public String viewRecords(){
        return "\nDiagnosis: " + diagnosis + "\nMedical History:\n" + medicalHistory;
    }

    @Override
    public double calculateBill(){
        return roomCharge * daysAdmitted;
    }
}
