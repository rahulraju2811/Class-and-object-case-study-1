package project5;

public class Booking {
	private String bookingID;
	private String bookingDate;
	private float bCashPaid;
	public Booking() {
		super();
		
	}
	public Booking(String bookingID, String bookingDate, float bCashPaid) {
		super();
		this.bookingID = bookingID;
		this.bookingDate = bookingDate;
		this.bCashPaid = bCashPaid;
	}
	
	public String getBookingID() {
		return bookingID;
	}
	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public float getbCashPaid() {
		return bCashPaid;
	}
	public void setbCashPaid(float bCashPaid) {
		this.bCashPaid = bCashPaid;
	}
	
	
}


