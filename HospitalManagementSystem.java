import java.util.Scanner;

public class HospitalManagementSystem {
    private Scanner scanner = new Scanner(System.in);
    private PatientRegistration patientRegistration = new PatientRegistration();
    private AppointmentScheduling appointmentScheduling = new AppointmentScheduling();
    private ElectronicHealthRecord ehr = new ElectronicHealthRecord();
    private Billing billing = new Billing();
    private InventoryManagement inventoryManagement = new InventoryManagement();
    private StaffManagement staffManagement = new StaffManagement();

    public void displayMenu() {
        System.out.println("\n--- Hospital Management System ---");
        System.out.println("1. Register Patient");
        System.out.println("2. Schedule Appointment");
        System.out.println("3. Manage Electronic Health Records (EHR)");
        System.out.println("4. Generate Billing and Invoice");
        System.out.println("5. Manage Inventory");
        System.out.println("6. Manage Staff");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    public void run() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1 -> patientRegistration.registerPatient(input("Name"), inputInt("Age"), input("Address"));
                case 2 -> appointmentScheduling.scheduleAppointment(input("Patient Name"), input("Doctor Name"), input("Date"), input("Time"));
                case 3 -> ehr.addRecord(inputInt("Patient ID"), input("Health Record"));
                case 4 -> billing.generateInvoice(inputInt("Patient ID"), inputDouble("Amount"));
                case 5 -> inventoryManagement.addSupply(input("Supply Name"), inputInt("Quantity"));
                case 6 -> staffManagement.addStaff(input("Staff Name"), input("Role"));
                case 7 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 7);
    }

    private String input(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    private int inputInt(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextInt();
    }

    private double inputDouble(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        new HospitalManagementSystem().run();
    }
}
