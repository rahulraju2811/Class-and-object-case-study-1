
public class TicketBooking {
	private String source;
	private String destination;
	private String dateOfTravel;
	private int numberOfPassengers;
	public TicketBooking(String source, String destination, String dateOfTravel, int numberOfPassengers) {
		super();
		this.source = source;
		this.destination = destination;
		this.dateOfTravel = dateOfTravel;
		this.numberOfPassengers = numberOfPassengers;
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDateOfTravel() {
		return dateOfTravel;
	}
	public void setDateOfTravel(String dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
 public void calculateBill(float price) {
	 
	 float price1 = 0;
	System.out.println("Amount:"+price1);
 }

}
