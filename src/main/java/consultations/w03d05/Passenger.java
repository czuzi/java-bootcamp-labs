package consultations.w03d05;

public class Passenger {

    private String name;
    private String ticketId;
    private int numberOfBaggage;

    public Passenger(String name, String ticketId, int numberOfBaggage) {
        this.name = name;
        this.ticketId = ticketId;
        this.numberOfBaggage = numberOfBaggage;
    }

    public String getName() {
        return name;
    }

    public String getTicketId() {
        return ticketId;
    }

    public int getNumberOfBaggage() {
        return numberOfBaggage;
    }
}
