package Door;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
System.out.println("1. Star Door \n 2. Gas Door \n 3. Liquid Door");
		
		System.out.println("Enter choice: ");
		int n = in.nextInt();
		switch(n)
		{
		case 1 : 
		System.out.println("Enter name: ");
		String doorName = in.next();
		System.out.println("Enter Value");
		int numberOfStars = in.nextInt();
		StarDoor s = new StarDoor(doorName,numberOfStars);
		s.display();
		break;
		
		case 2 :
			System.out.println("Enter Name:");
			String doorName1 = in.next();
			System.out.println("Enter Gas : ");
			String nameOfGas = in.next();
			GasDoor g = new GasDoor(doorName1,nameOfGas);
			g.display1();
			break;
		case 3 :
			System.out.println("Enter Name:");
			String doorName2 = in.next();
			System.out.println("Enter Value : ");
			float flowQuotient= in.nextFloat();
			LiquidDoor l = new LiquidDoor(doorName2,flowQuotient);
			l.display2();
			break;
		default :
			System.out.println("Invalid Input");
		}
		
	}

}
