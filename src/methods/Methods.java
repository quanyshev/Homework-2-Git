package methods;
import ticket.Ticket;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Methods {
    // Method to parse the string and convert it to Timestamp
    public static Timestamp parseTimestamp(String dateTimeString) {
        // Define the formatter with the pattern of the input string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        // Parse the string to LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, formatter);

        // Convert LocalDateTime to Timestamp
        return Timestamp.valueOf(localDateTime);
    }
    // 2) Method to get ticket object by ID
    public static Ticket getTicketByID(ArrayList<Ticket> ticketStorage, String ID) {
        Ticket result = null;

        for (Ticket ticket : ticketStorage) {
            if (ticket.getID() == ID) {
                result = ticket;
                break;
            }
        }
        System.out.println("Ticket with next ID is retrieved: " + result.getID());
        return result;
    }
}