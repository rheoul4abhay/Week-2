package HospitalPatientManagement;

public class OutPatient extends Patient implements MedicalRecord{

    private double consultationFee;
    private String diagnosis;
    private StringBuilder medicalHistory;

    public OutPatient(String patientID, String patientName, int age, double consultationFee, String diagnosis){
        super(patientID, patientName, age);
        this.consultationFee = consultationFee;
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
        return consultationFee;
    }
}
