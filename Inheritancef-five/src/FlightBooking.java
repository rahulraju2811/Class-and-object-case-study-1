
public class FlightBooking extends TicketBooking {
	private String Class;
	private float luggageWeight;
	public FlightBooking(String source, String destination, String dateOfTravel, int numberOfPassengers,String Class,float luggageWeight) {
		super(source, destination,dateOfTravel,numberOfPassengers);
		this.Class =Class;
		this.luggageWeight = luggageWeight;
	}
	public void calculateBill(float price)
	{
		super.calculateBill(price);
		price=price*luggageWeight;
		System.out.println(price);
		return;
	}
	

}