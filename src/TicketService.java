import methods.Methods;
import ticket.Ticket;

import java.util.ArrayList;

class TicketService {

    public static void main(String[] args) {

        Ticket ticket1 = new Ticket("1231", "Alpha", 111, "14.02.2025 10:00", true, 'A', 23);
        Ticket ticket2 = new Ticket("1232", "Beta", 112, "14.02.2025 11:00", false, 'B', 24);
        Ticket ticket3 = new Ticket("1233", "Omega", 113, "14.02.2025 12:00", false, 'C', 25);
        Ticket ticket4 = new Ticket("1234", "Sigma", 114, "14.02.2025 13:00", false, 'A', 26);
        Ticket ticket5 = new Ticket("1235", "Alpha", 115, "14.02.2025 14:00", true, 'B', 27);
        Ticket ticket6 = new Ticket("1236", "Beta", 116, "14.02.2025 15:00", false, 'C', 28);
        Ticket ticket7 = new Ticket("1237", "Omega", 117, "14.02.2025 16:00", true, 'A', 29);
        Ticket ticket8 = new Ticket("1238", "Sigma", 118, "14.02.2025 17:00", false, 'B', 30);
        Ticket ticket9 = new Ticket("1239", "Alpha", 119, "14.02.2025 18:00", false, 'C', 31);
        Ticket ticket10 = new Ticket("1240", "Beta", 120, "14.02.2025 19:00", true, 'A', 32);

        //check ticket storage
        System.out.println(Ticket.ticketStorage.get(0).getID());
        System.out.println(Ticket.ticketStorage.get(1).getID());

        //check that method to getting ticket by ID working
        Ticket x = Methods.getTicketByID(Ticket.ticketStorage, "1231");
        Ticket y = Methods.getTicketByID(Ticket.ticketStorage, "1232");

        //check that method to getting ticket by sector working
        ArrayList<Ticket> z = Methods.getTicketBySector('A');
    }
}