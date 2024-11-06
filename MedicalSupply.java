class MedicalSupply {
    private String name;
    private int quantity;

    public MedicalSupply(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Supply: " + name + ", Quantity: " + quantity;
    }
}