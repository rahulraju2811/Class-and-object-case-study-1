package LavaDinosaur;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Land Dino \n2.Aqua Dino \n3.Aerial Dino");
		System.out.println("Enter choice: ");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter Species:");
			String species=sc.next();
			System.out.println("Enter Type:");
			String locomotionType=sc.next();
			System.out.println("Enter Speed:");
			int speed=sc.nextInt();
			System.out.println("Enter Number of feet:");
			int feet=sc.nextInt();
			LandLavaDino lld=new LandLavaDino(species,locomotionType,speed,feet);
			lld.displayDinoSpeed();
		break;
		case 2:
			System.out.println("Enter Species:");
			String species1=sc.next();
			System.out.println("Enter Type:");
			String locomotionType1=sc.next();
			System.out.println("Enter Speed:");
			int speed1=sc.nextInt();
			System.out.println("Enter no.of fins:");
			int numberOfFins=sc.nextInt();
			System.out.println("Enter no.of tails:");
			float numberOfTails=sc.nextFloat();
			System.out.println("Enter lava multiplier:");
			float lavaMultiplier=sc.nextFloat();
			WaterLavaDino wld=new WaterLavaDino(species1,locomotionType1,speed1,numberOfFins,numberOfTails,lavaMultiplier);
			wld.displayDinoSpeed();
		break;
		case 3:
				System.out.println("Enter Species:");
				String species2=sc.next();
				System.out.println("Enter Type:");
				String locomotionType2=sc.next();
				System.out.println("Enter Speed:");
				int speed2=sc.nextInt();
				System.out.println("Enter no.of wings:");
				int numberOfWings=sc.nextInt();
				System.out.println("Enter speed/wings:");
				float speedPerWing=sc.nextFloat();
				System.out.println("Enter ash resistance:");
				float ashResistance=sc.nextFloat();
				AirLavaDino ald=new AirLavaDino(species2,locomotionType2,speed2,numberOfWings,speedPerWing,ashResistance);
				ald.displayDinoSpeed();
		break;
		}
	}

}
