import ticket.Ticket;

class TicketService {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket("Alpha", 123, "14.02.2025 17:00");
        Ticket ticket3 = new Ticket("1234", "Beta", 321, "14.02.2025 17:00", true, 'C', 23.54F);
    }
}