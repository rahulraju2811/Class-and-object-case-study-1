
public class BusBooking extends TicketBooking{
	private boolean isAC;
	private boolean isSleeper;
	private boolean hasWifi;
	
	
	
	public BusBooking(String source, String destination, String dateOfTravel, int numberOfPassengers, boolean isAC,
			boolean isSleeper, boolean hasWifi) {
		super(source, destination, dateOfTravel, numberOfPassengers);
		this.isAC = isAC;
		this.isSleeper = isSleeper;
		this.hasWifi = hasWifi;
	}
	public boolean isAC() {
		return isAC;
	}
	public void setAC(boolean isAC) {
		this.isAC = isAC;
	}
	public boolean isSleeper() {
		return isSleeper;
	}
	public void setSleeper(boolean isSleeper) {
		this.isSleeper = isSleeper;
	}
	public boolean isHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	
  public void displaycalculateBill() {
	boolean a=true;
	float totalamt = 0;
	if(Boolean.compare(hasWifi, a)==0)
	{
		if(Boolean.compare(isAC, a)==0)
		{
			if(Boolean.compare(isSleeper, a)==0)
			{
				totalamt= getNumberOfPassengers() * 100;
				System.out.println(totalamt);
			}
		}
	}
  }
}