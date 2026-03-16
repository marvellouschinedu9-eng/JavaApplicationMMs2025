import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {

        // Get current date and time
        LocalDateTime now = LocalDateTime.now();

        // Create formatter pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Format date and time
        String formattedDate = now.format(formatter);

        // Display result
        System.out.println("Current Date and Time: " + formattedDate);
    }
}