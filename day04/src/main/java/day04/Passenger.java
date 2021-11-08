package day04;

public class Passenger {
    private String name;
    private String ticketID;
    private int packs;

    public Passenger(String name, String ticketID, int packs) {
        this.name = name;
        this.ticketID = ticketID;
        this.packs = packs;
    }

    public String getName() {
        return name;
    }

    public String getTicketID() {
        return ticketID;
    }

    public int getPacks() {
        return packs;
    }
}
