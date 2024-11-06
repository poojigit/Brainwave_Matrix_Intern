import java.util.ArrayList;

class InventoryManagement {
    private ArrayList<MedicalSupply> supplies = new ArrayList<>();

    public void addSupply(String name, int quantity) {
        MedicalSupply supply = new MedicalSupply(name, quantity);
        supplies.add(supply);
        System.out.println("Supply added: " + supply);
    }

    public void viewSupplies() {
        if (supplies.isEmpty()) {
            System.out.println("No supplies in inventory.");
        } else {
            for (MedicalSupply supply : supplies) {
                System.out.println(supply);
            }
        }
    }
}