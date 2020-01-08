package project5;
public abstract class User {

	private String userName;
	private String emailID;
	private String mobileNo;
	private float bCash;
	private Booking[] bookingList;
	
	/*public User(String userName, String emailID, String mobileNo, float bCash, Booking[] bookingList) {
		super();
		this.userName = userName;
		this.emailID = emailID;
		this.mobileNo = mobileNo;
		this.bCash = bCash;
		this.bookingList = bookingList;
	}*/
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public float getbCash() {
		return bCash;
	}
	public void setbCash(float bCash) {
		this.bCash = bCash;
	}
	public Booking[] getBookingList() {
		return bookingList;
	}
	public void setBookingList(Booking[] bookingList) {
		this.bookingList = bookingList;
	}
	public void rechargeBCash(float amount) {
		this.setbCash(amount);
	}
	public void updateDetails(String details) {
		String[] str=details.split(" ");
		this.setUserName(str[0]);
		this.setEmailID(str[1]);
		this.setMobileNo(str[2]);
	}
	
	public abstract float bookRoom(Booking details);
	public abstract float cancelBooking(String bDate);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}