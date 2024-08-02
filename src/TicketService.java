import methods.Methods;
import methods.Shareable;
import ticket.Ticket;
import users.*;
import java.util.ArrayList;
import static methods.Shareable.*;
import static methods.Shareable.sharingPlatform.*;


class TicketService {

    public static void main(String[] args) {

        Ticket ticket_1 = new Ticket("Alpha", 111, "14.02.2025 10:00", true, 'A', 23f, 2500);
        Ticket ticket_2 = new Ticket("Beta", 112, "14.02.2025 11:00", false, 'B', 24f, 2600);
        Ticket ticket_3 = new Ticket("Omega", 113, "14.02.2025 12:00", false, 'C', 25f, 2700);
        Ticket ticket_4 = new Ticket("Sigma", 114, "14.02.2025 13:00", false, 'A', 26f, 2800);
        Ticket ticket_5 = new Ticket("Alpha", 115, "14.02.2025 14:00", true, 'B', 27f, 2900);

        //check ticket storage
        //System.out.println(Ticket.ticketStorage.get(0).getID());
        //System.out.println(Ticket.ticketStorage.get(1).getID());

        //check that method to getting ticket by ID working
        //Ticket x = Methods.getTicketByID(Ticket.ticketStorage, 1);
        //Ticket y = Methods.getTicketByID(Ticket.ticketStorage, 2);

        //check that method to getting ticket by sector working
        //ArrayList<Ticket> z = Methods.getTicketBySector('A');

        //check client getTicket AND admin checkTicket
        Client asylbek = new Client("Asylbek");

        asylbek.buyTicket(ticket_1);
        asylbek.getTicket(ticket_1);
        asylbek.buyTicket(ticket_2);

        Admin admin = new Admin("John");
        admin.checkTicket(asylbek, ticket_1);

        admin.print();
        ticket_1.print();

//        check share method
        asylbek.share(Whatsapp);
        asylbek.share(Gmail);

        // equals and hashCode check
        Ticket z = ticket_1;
        System.out.println(z == ticket_1);
        System.out.println(z.equals(ticket_1));
        System.out.println(ticket_2.equals(ticket_1));
        System.out.println(z.hashCode());
        System.out.println(ticket_2.hashCode());
        System.out.println(z.toString());

        // check NullableWarning annotation
        Ticket tikcet_v = new Ticket("Alpha", 111, "14.02.2025 10:00", true, 'A', null, 2500);
        Methods.processorNullableWarnings(tikcet_v);
    }
}