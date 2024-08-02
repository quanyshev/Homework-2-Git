package users;
import methods.Shareable;
import ticket.Ticket;
import java.util.ArrayList;

public class Client extends User implements Shareable {
    private String name;
    private static int counter = 1;
    private final int id; {id = counter; counter++;};

    public Client( String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public void print() {
        String ticketStatus;
        ArrayList<Integer> ticketsAvailable = new ArrayList<>();

        if (clientsTickets.isEmpty()) {
            ticketStatus = "You don't have tickets bought.";
        } else {
            for (Ticket t : clientsTickets) {
                ticketsAvailable.add(t.getID());
            }
            ticketStatus = ticketsAvailable.toString();
        }

        String result = "Name: " + this.name + "\nID of Tickets available: " + ticketStatus;
        System.out.println(result);
    }

    ArrayList<Ticket> clientsTickets = new ArrayList<>();

    public void buyTicket(Ticket ticketName) {
        clientsTickets.add(ticketName);
        System.out.println("You successfully bought a new ticket!");
    }

    public Ticket getTicket(Ticket ticket) {
        Ticket result = null;
        if (clientsTickets.isEmpty()) {
            System.out.println("No tickets found");
        } else {
            for (Ticket t : clientsTickets) {
                if (t == ticket) {
                    System.out.println("Your ticket with ID " + "'" + t.getID() + "'" + " found!");
                    result = t;
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public void share(sharingPlatform platform) {
        System.out.println("Your ticket successfully sent via " + platform + " !");
    }
}

