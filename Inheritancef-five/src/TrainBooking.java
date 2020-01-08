
public class TrainBooking extends TicketBooking {
	private String coach;
	private int mealsOpted;
	
	public TrainBooking(String source, String destination, String dateOfTravel, int numberOfPassengers, String coach,
			int mealsOpted) {
		super(source, destination, dateOfTravel, numberOfPassengers);
		this.coach = coach;
		this.mealsOpted = mealsOpted;
	}
	
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public int getMealsOpted() {
		return mealsOpted;
	}
	public void setMealsOpted(int mealsOpted) {
		this.mealsOpted = mealsOpted;
	}
	public void  calculateBill() {
		float price = 0;
		super.calculateBill(price);
		price=price+((float)mealsOpted*100);
		System.out.println(price);
		return;
	}

}