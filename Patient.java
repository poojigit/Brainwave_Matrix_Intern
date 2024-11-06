class Patient {
    private static int idCounter = 1;
    private int id;
    private String name;
    private int age;
    private String address;

    public Patient(String name, int age, String address) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Patient ID: " + id + ", Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}