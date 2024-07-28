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
    public static Ticket getTicketByID(ArrayList<Ticket> ticketStorage, int ID) {
        if (String.valueOf(ID).length() <= 4) {
            boolean isTicketFound = false;
            Ticket result = null;

            for (Ticket ticket : ticketStorage) {
                if (ticket.getID() == ID) {
                    result = ticket;
                    isTicketFound = true;
                    break;
                }
            }

            if (isTicketFound) {
                System.out.println("Ticket with next ID is retrieved: " + result.getID());
            } else {
                System.out.println("Ticket not found");
            }

            return result;
        } else {
            throw new IllegalArgumentException("Cannot be more than 4 characters.");
        }
    }

    // 3)  Method to get ticket object by sector
    public static ArrayList<Ticket> getTicketBySector(char sector) {
        ArrayList<Ticket> result = new ArrayList<>();

        for (int i = 0; i < Ticket.ticketStorage.size(); i++) {
            if (Ticket.ticketStorage.get(i).getStadiumSector() == sector) {
                result.add(Ticket.ticketStorage.get(i));
            }
        }

        if (!result.isEmpty()) {
            for (Ticket ticket : result) {
                System.out.println("Ticket ID: " + ticket.getID() + " => " + ticket.getStadiumSector());
            }
            return result;
        } else {
            throw new IllegalArgumentException("No ticket found");
        }
    }
}