package project5;
import java.util.Scanner;
public class Main {
	 static String bookingID;
	 static String bookingDate;
	 static float bCashPaid;
	 static String Date;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Enter  the User type");
			Scanner s=new Scanner(System.in);
			String type=s.next();
			if(type.equalsIgnoreCase("RegularUser")) {
				Booking r=new Booking();
				bookingID =s.next();
				bookingDate=s.next();
				bCashPaid=s.nextFloat();
				
				RegularUser regular=new RegularUser();
				System.out.println(regular.bookRoom(r));
				Date =s.next();
				regular.cancelBooking(Date);
			}
			else if(type.equalsIgnoreCase("premiumUser")) {
				Booking r=new Booking();
				bookingID =s.next();
				bookingDate=s.next();
				bCashPaid=s.nextFloat();
				PremiumUser premium=new PremiumUser();
				System.out.println(premium.bookRoom(r));
				//1
				Date=s.next();
				premium.cancelBooking(Date);
			}
			else {
				System.out.println("wrong");
			}

		}
}


