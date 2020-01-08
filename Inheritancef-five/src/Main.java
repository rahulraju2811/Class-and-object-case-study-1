
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("1.BusBooking(welocme)\n 2.TrainBooking(wlcome)\n 3.FlightBooking(welcome)\n");
    

    	System.out.println("Enter the source");
    	String source = s.next();
    	System.out.println("Enter the distination");
    	String destination = s.next();
    	System.out.println("Enter the dateOfTravel");
    	String dateOfTravel = s.next();
    	System.out.println("Enter the numberOfPassengers ");
    	int numberOfPassengers =s.nextInt();
    	System.out.println("Enter the choice");
    	int n = s.nextInt();
    	/*TicketBooking tbb= new TicketBooking(source,destination,dateOfTravel,numberOfPassengers);
    	tbb.calculateBill(numberOfPassengers);  */     
    	
    	
       switch(n)
        {
    	
    case 1:
    	System.out.println("Enter is AC");
    	boolean isAC = s.nextBoolean();
    	System.out.println("Enter is Sleeper");
    	boolean isSleeper = s.nextBoolean();
    	System.out.println("Enter has Wifi");
    	boolean hasWifi = s.nextBoolean();
    	BusBooking bb = new BusBooking(source, destination, dateOfTravel, numberOfPassengers, isAC,isSleeper,hasWifi);
    	bb.displaycalculateBill();
    	break;
    	
    case 2:
    	System.out.println("Enter the type of coach");
    	String coach = s.next();
    	System.out.println("enter mealsOpted");
    	int mealsOpted = s.nextInt();
    	TrainBooking tb = new TrainBooking(source,destination, dateOfTravel, numberOfPassengers, coach, mealsOpted);
    	tb.calculateBill();
    	
    	break;
    	
    case 3:
    	System.out.println("Enter class");
    	String classs = s.next();
    	System.out.println("enter luggageWeight");
    	float luggageWeight = s.nextFloat();
       FlightBooking fb = new FlightBooking(source,destination, dateOfTravel, numberOfPassengers,classs,luggageWeight);
       fb.calculateBill(luggageWeight);
       break;
    }
	}

}