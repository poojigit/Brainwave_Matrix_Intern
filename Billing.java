import java.util.HashMap;

class Billing {
    private HashMap<Integer, Double> invoices = new HashMap<>();

    public void generateInvoice(int patientId, double amount) {
        invoices.put(patientId, amount);
        System.out.println("Invoice generated for Patient ID: " + patientId + ", Amount: $" + amount);
    }

    public void viewInvoice(int patientId) {
        if (invoices.containsKey(patientId)) {
            System.out.println("Invoice for Patient ID " + patientId + ": $" + invoices.get(patientId));
        } else {
            System.out.println("No invoice found for Patient ID: " + patientId);
        }
    }
}