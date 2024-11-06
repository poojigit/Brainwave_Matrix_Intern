class Appointment {
    private String patientName;
    private String doctorName;
    private String date;
    private String time;

    public Appointment(String patientName, String doctorName, String date, String time) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Appointment for " + patientName + " with Dr. " + doctorName + " on " + date + " at " + time;
    }
}