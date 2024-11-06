import java.util.ArrayList;

class AppointmentScheduling {
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void scheduleAppointment(String patientName, String doctorName, String date, String time) {
        Appointment appointment = new Appointment(patientName, doctorName, date, time);
        appointments.add(appointment);
        System.out.println("Appointment scheduled: " + appointment);
    }

    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
            }
        }
    }
}