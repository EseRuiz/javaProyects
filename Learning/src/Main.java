import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AppointmentScheduler hour = new AppointmentScheduler();
        boolean after = hour.isAfternoonAppointment(LocalDateTime.of(2019, 03, 29, 8, 0, 0));
        System.out.println(after);
        String cita = hour.getDescription(LocalDateTime.of(2019, 03, 29, 15, 0, 0));
        System.out.println("cita = " + cita);
    }
}