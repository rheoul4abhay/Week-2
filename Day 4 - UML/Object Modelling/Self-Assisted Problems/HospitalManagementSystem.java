import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    public String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Doctor " + name + " consulted Patient " + patient.getName());
    }

    public void viewPatients() {
        System.out.println("Doctor " + name + "'s Patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void viewDoctors() {
        System.out.println(name + " has the following doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.name);
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor doctor1 = new Doctor("Dr. Watson");
        Doctor doctor2 = new Doctor("Dr. Brown");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        Patient patient1 = new Patient("John Doe");
        Patient patient2 = new Patient("Jane Roe");

        doctor1.consult(patient1);
        doctor1.consult(patient2);

        doctor2.consult(patient1);

        doctor1.viewPatients();
        doctor2.viewPatients();

        hospital.viewDoctors();
    }
}
