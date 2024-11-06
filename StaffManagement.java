import java.util.ArrayList;

class StaffManagement {
    private ArrayList<Staff> staffMembers = new ArrayList<>();

    public void addStaff(String name, String role) {
        Staff staff = new Staff(name, role);
        staffMembers.add(staff);
        System.out.println("Staff member added: " + staff);
    }

    public void viewStaff() {
        if (staffMembers.isEmpty()) {
            System.out.println("No staff members.");
        } else {
            for (Staff staff : staffMembers) {
                System.out.println(staff);
            }
        }
    }
}