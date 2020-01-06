import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Dinosaur \n 2.Lava Dinosaur \n 3.Dragon Dianosaur");
		System.out.println("Enter type: ");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
				System.out.println("Enter species:");
				String species=sc.next();
				System.out.println("Enter Consumption:");
				String consumptiontype=sc.next();
				Dinosaur d=new Dinosaur(species,consumptiontype);
				d.displaydinodetails();
		break;
		case 2:
				System.out.println("Enter species:");
				String species1=sc.next();
				System.out.println("Enter Consumption:");
				String consumptiontype1=sc.next();
				System.out.println("Breathes fire?(y/n):");
				String breath=sc.next();
				System.out.println("Is heat Resistence?(y/n):");
				String heat=sc.next();
				LavaDino ld=new LavaDino(species1,consumptiontype1,breath,heat);
				ld.displaydinodetails();
		break;
		case 3:
				System.out.println("Enter species:");
				String species2=sc.next();
				System.out.println("Enter Consumption:");
				String consumptiontype2=sc.next();
				System.out.println("Breathes fire?(y/n):");
				String breath2=sc.next();
				System.out.println("Is heat Resistence?(y/n):");
				String heat2=sc.next();
				System.out.println("Enter no of wings:");
				int noOfWings=sc.nextInt();
				System.out.println("Enter no of Scales:");
				int noOfScales=sc.nextInt();
				DragonDino dd=new DragonDino(species2,consumptiontype2,breath2,heat2,noOfWings,noOfScales);
				dd.displaydinodetails();
		break;
		default :
				System.out.println("Invalid Input");

		}

	}

}
