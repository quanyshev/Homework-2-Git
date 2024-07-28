import methods.Methods;
import ticket.Ticket;

import java.util.ArrayList;

class TicketService {

    public static void main(String[] args) {

        Ticket ticket1 = new Ticket("Alpha", 111, "14.02.2025 10:00", true, 'A', 23, 2500);
        Ticket ticket2 = new Ticket("Beta", 112, "14.02.2025 11:00", false, 'B', 24, 2600);
        Ticket ticket3 = new Ticket("Omega", 113, "14.02.2025 12:00", false, 'C', 25, 2700);
        Ticket ticket4 = new Ticket("Sigma", 114, "14.02.2025 13:00", false, 'A', 26, 2800);
        Ticket ticket5 = new Ticket("Alpha", 115, "14.02.2025 14:00", true, 'B', 27, 2900);
        Ticket ticket6 = new Ticket("Beta", 116, "14.02.2025 15:00", false, 'C', 28, 3000);
        Ticket ticket7 = new Ticket("Omega", 117, "14.02.2025 16:00", true, 'A', 29, 3100);
        Ticket ticket8 = new Ticket("Sigma", 118, "14.02.2025 17:00", false, 'B', 30, 3200);
        Ticket ticket9 = new Ticket("Alpha", 119, "14.02.2025 18:00", false, 'C', 31, 3300);
        Ticket ticket10 = new Ticket("Beta", 120, "14.02.2025 19:00", true, 'A', 32, 3400);

        //check ticket storage
        System.out.println(Ticket.ticketStorage.get(0).getID());
        System.out.println(Ticket.ticketStorage.get(1).getID());

        //check that method to getting ticket by ID working
        Ticket x = Methods.getTicketByID(Ticket.ticketStorage, 1);
        Ticket y = Methods.getTicketByID(Ticket.ticketStorage, 2);

        //check that method to getting ticket by sector working
        ArrayList<Ticket> z = Methods.getTicketBySector('A');
    }
}