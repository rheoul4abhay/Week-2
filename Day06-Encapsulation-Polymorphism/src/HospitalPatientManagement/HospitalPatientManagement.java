package HospitalPatientManagement;

import java.util.ArrayList;

public class HospitalPatientManagement {
    public static void main(String[] args){
        ArrayList<Patient> patients = new ArrayList<>();

        Patient inPatient = new InPatient("@123456789", "Nirmal Kumar", 29, 20.0, 6, "Pneumonia");
        Patient outPatient = new OutPatient("@987654321", "John Wick", 45, 40.0, "Flu");

        //Add medical Records
        if(inPatient instanceof MedicalRecord){
            MedicalRecord inPatientRecord = (MedicalRecord) inPatient;
            inPatientRecord.addRecord("Day 1: Fever, antibiotics prescribed.");
            inPatientRecord.addRecord("Day 3: Fever reduced, continue medication.");
        }

        if(outPatient instanceof MedicalRecord){
            MedicalRecord outPatientRecord = (MedicalRecord) outPatient;
            outPatientRecord.addRecord("Consultation completed, flu medication prescribed.");
        }

        //Display patient details and billing
        patients.add(inPatient);
        patients.add(outPatient);
        for(Patient patient: patients){
            patient.getPatientDetails();
            System.out.print("\nTotal Bill: $" + patient.calculateBill());

            //view medical records
            if(patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                System.out.print(record.viewRecords());
            }
            System.out.println();
        }
    }
}
