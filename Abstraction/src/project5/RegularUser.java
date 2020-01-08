package project5;

public class RegularUser extends User{
	public float bookRoom(Booking details) {
		Booking r=new Booking();
		r.setBookingID(details.getBookingID());
		r.setBookingDate(details.getBookingDate());
		r.setbCashPaid(details.getbCashPaid());
		return r.getbCashPaid();
	}

	
	public float cancelBooking(String bDate) {
		Booking[] t=this.getBookingList();
		float cash=0;
		for(int i=0;i<t.length;i++) {
			if(bDate.equalsIgnoreCase(t[i].getBookingDate())) {
				System.out.println("Booking Cancelled");
			cash= (float) (0.5*t[i].getbCashPaid());
		}
		
		}
		return cash;

}
}
