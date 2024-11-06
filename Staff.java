class Staff {
    private String name;
    private String role;

    public Staff(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Staff Name: " + name + ", Role: " + role;
    }
}