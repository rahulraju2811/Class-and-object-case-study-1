package project3;
import java.util.*;
import java.io.IOException;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String passengerName;
		String emailID;
		int mobileNo;
		String dateOfTravel;
		int numOfPassengers;
        float price;
        boolean isAC;
        boolean isSleeper;
        boolean isWiFi;
        int numOfChildren = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the passengerName:\n ");
        passengerName = s.next();
        System.out.println("Enter the emailID:\n ");
        emailID = s.next();
        System.out.println("Enter the mobileNo:\n ");
        mobileNo = s.nextInt();
        System.out.println("Enter the dateOfTravel:\n");
        dateOfTravel = s.next();
        System.out.println("Enter the numOfPassengers:\n ");
        numOfPassengers = s.nextInt();
        System.out.println("Enter the price:\n");
        price = s.nextFloat();
        System.out.println("Enter the bus isAC:\n");
        isAC = s.nextBoolean();
        System.out.println("Enter the bus isSleeper:\n");
        isSleeper = s.nextBoolean();
        System.out.println("Enter the bus haswifi:\n");
        isWiFi = s.nextBoolean();
        System.out.println("Enter the numbe of childrens:\n");
        BusTicketBooking btb = new BusTicketBooking(numOfPassengers, price, isWiFi, isSleeper, isAC, numOfChildren);
        btb.bookTicket(numOfPassengers,price);
        btb.bookTicket(isAC,isSleeper);
        btb.bookTicket(isAC,isSleeper,isWiFi);
        
	}

}
