package project5;

public class PremiumUser extends User {
	private int discount;
	private int coupon;
	private boolean isNextBookingFree;
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	public boolean isNextBookingFree() {
		return isNextBookingFree;
	}
	public void setNextBookingFree(boolean isNextBookingFree) {
		this.isNextBookingFree = isNextBookingFree;
	}
	@Override
	public float bookRoom(Booking details) {
		// TODO Auto-generated method stub
		Booking[] book=new Booking[100];
		float cash=0;
		for(int i=0;i<book.length;i++) {
			book[i].setBookingID(details.getBookingID());
			book[i].setBookingDate(details.getBookingDate());
			if(this.coupon==1) {
			book[i].setbCashPaid(details.getbCashPaid()-this.coupon);
			if(i==4)
			book[i].setbCashPaid(0);
	           }
			cash=book[i].getbCashPaid();
		}
		return cash;
		
	}
	@Override
	public float cancelBooking(String bDate) {
		// TODO Auto-generated method stub
		Booking[] bk=this.getBookingList();
		float cash=0;
		for(int i=0;i<bk.length;i++) {
			if(bDate.equalsIgnoreCase(bk[i].getBookingDate())) {
				System.out.println("Booking Cancelled");
			cash=(float) (0.5*bk[i].getbCashPaid());
			this.coupon=(int) cash;
			setNextBookingFree(true);
		}
		
		}
		return cash;

	}
	public void applyDiscount(float amount) {
		this.setbCash(this.getbCash()+amount);
		}
	public float bookRoom1(Booking r) {
		// TODO Auto-generated method stub
		return 0;
	}
		
	
	
	
	
	
}
