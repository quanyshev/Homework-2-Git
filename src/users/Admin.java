package users;
import ticket.Ticket;

public class Admin extends User {
    String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        String result;
        result = "Name: " + this.name + "\nAvailable methods: 'print()', 'checkTicket'";

        System.out.println(result);
    }

    public void checkTicket(Client client, Ticket ticket) {
        if (client.clientsTickets.isEmpty()) {
            System.out.println("No tickets found");
        } else {
            for (Ticket t : client.clientsTickets) {
                if (t == ticket) {
                    System.out.println("Approved, client has the ticket with ID: " + t.getID());
                } else {
                    System.out.println("Disapproved, ticket not found");
                }
            }
        }
    }


}
