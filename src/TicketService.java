import ticket.Ticket;

class TicketService {

    static String getTicketBySector(char sector){
        Ticket ticket = null;
        for (int i = 0; i < Ticket.ticketList.size(); i++) {
            if(Ticket.ticketList.get(i).getStadiumSector() == sector){
                ticket = Ticket.ticketList.get(i);
            }
        }
        if(ticket != null)
            return ticket.getID();
        else
            return "no tickets found";
    }
    public static void main(String[] args) {


        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket("Alpha", 123, "14.02.2025 17:00");
        Ticket ticket3 = new Ticket("1234", "Beta", 321, "14.02.2025 17:00", true, 'C', 23.54F);
    }
}