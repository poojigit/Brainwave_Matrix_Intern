import java.util.ArrayList;

class PatientRegistration {
    private ArrayList<Patient> patients = new ArrayList<>();

    public void registerPatient(String name, int age, String address) {
        Patient newPatient = new Patient(name, age, address);
        patients.add(newPatient);
        System.out.println("Patient registered: " + newPatient);
    }

    public void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients registered.");
        } else {
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }
    }
}