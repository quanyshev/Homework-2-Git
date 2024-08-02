package ticket;
import methods.Printable;
import methods.Methods;
import methods.NullableWarning;

import java.sql.Timestamp;
import java.util.ArrayList;

@NullableWarning
public class Ticket implements Printable {
    private static int counter = 1;
    private final int id; {id = counter; counter++;};
    private final String concertHall;
    private final int eventCode;
    private Timestamp time;
    private final boolean isPromo;
    private char stadiumSector;
    private final Float backpackWeight;
    private final double tikcetPrice;
    private final Timestamp creationTime = new Timestamp(System.currentTimeMillis());
    public static final ArrayList<Ticket> ticketStorage = new ArrayList<Ticket>();

    @Override
    public void print() {
        System.out.println("Ticket ID: " + this.id + "; " + "Event code: " + this.eventCode + "; " + "Time: " + this.time + "; " +
                "Sector: " + this.stadiumSector + "; " + "Allowed backpack weight: " + this.backpackWeight + "; "
                + "Price: " + this.tikcetPrice + "; " + "Creation time: " + this.creationTime);
    }
    @Override
    public boolean equals(Object ticket) {
        if (ticket == null || this.getClass() != ticket.getClass()) {
            return false;
        }
        if (this == ticket) {
            return true;
        }
        return this.getID() == ((Ticket) ticket).getID();
    }

    @Override
    public int hashCode() {
        return this.getID();
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nSector: " + stadiumSector + "\nPrice: " + tikcetPrice;
    }

    // ADDING GETTER AND SETTER FOR PRIVATE VARIABLES
    // Time getter and setter
    public Timestamp getTime() {
        return this.time;
    }
    public void setTime(String time) {
        this.time = Methods.parseTimestamp(time);
    }
    // StadiumSector getter and setter
    public char getStadiumSector() {
        return this.stadiumSector;
    }
    public void setStadiumSector(char stadiumSector) {
        if (stadiumSector >= 'A' && stadiumSector <= 'C') {
            this.stadiumSector = stadiumSector;
        } else {
            throw new IllegalArgumentException("Allowed characters: 'A', 'B', 'C'.");
        }
    }
    // ID getter
    public int getID() {
        return this.id;
    }
    // ConcertHall getter
    public String getConcertHall() {
        return this.concertHall;
    }
    // EventCode getter
    public int getEventCode() {
        return this.eventCode;
    }
    // isPromo getter
    public boolean getPromo() { return this.isPromo; }
    // BackpackWeight getter
    public float getBackpackWeight() {
        return this.backpackWeight;
    }
    // TicketPrice getter
    public double getTikcetPrice() {
        return this.tikcetPrice;
    }
    // creationTime getter
    public Timestamp getCreationTime() {
        return this.creationTime;
    }

    // Initializing the constructor

    public Ticket(String concertHall, int eventCode, String time, boolean isPromo, char stadiumSector, Float backpackWeight, double tikcetPrice) {
        this.time = Methods.parseTimestamp(time);
        this.isPromo = isPromo;
        this.backpackWeight = backpackWeight;
        this.tikcetPrice = tikcetPrice;

        // Adding constraints according to requirements, to make sure of validness of arguments
        if (concertHall.length() <= 10) {
            this.concertHall = concertHall;
        } else {
            throw new IllegalArgumentException("Cannot be more than 10 characters.");
        }

        if (eventCode >= 100 && eventCode <= 999) {
            this.eventCode = eventCode;
        } else {
            throw new IllegalArgumentException("Must be a 3 digit number.");
        }

        if (stadiumSector >= 'A' && stadiumSector <= 'C') {
            this.stadiumSector = stadiumSector;
        } else {
            throw new IllegalArgumentException("Allowed characters: 'A', 'B', 'C'.");
        }

        // Adding the created ticket to ArrayList storage
        ticketStorage.add(this);
    }
}