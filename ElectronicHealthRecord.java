import java.util.HashMap;

class ElectronicHealthRecord {
    private HashMap<Integer, String> healthRecords = new HashMap<>();

    public void addRecord(int patientId, String record) {
        healthRecords.put(patientId, record);
        System.out.println("Record added for Patient ID: " + patientId);
    }

    public void viewRecord(int patientId) {
        if (healthRecords.containsKey(patientId)) {
            System.out.println("EHR for Patient ID " + patientId + ": " + healthRecords.get(patientId));
        } else {
            System.out.println("No records found for Patient ID: " + patientId);
        }
    }
}