package abstractioncase3;
import java.util.Scanner;
public class Main {
   	public static void main(String[] args) {
Scanner s=new Scanner(System.in);


String   starName;
String   constellationName;
int   decayIndex;
int   energyToEmit;
int   currentAge;
int   energyConsume;
		System.out.println("Enter Star Details\n");
		System.out.println("Enter Star name:");
		starName=s.next();
		System.out.println("Enter constellationName:");
		constellationName=s.next();
		System.out.println("Enter decayIndex:");
		decayIndex=s.nextInt();
		System.out.println("Enter energyToEmit:");
		energyToEmit=s.nextInt();
		
		System.out.println("Enter age:");
		currentAge=s.nextInt();
		System.out.println("Enter energyconsume:");
		energyConsume=s.nextInt();
int n;
System.out.print("1.Plasma Star\r" + "\r" + "2.Radium Star\r" + "\r" + "3.Dark Star"+"\n");
n=s.nextInt();
switch(n)
{
case 1:
	PlasmaStar pl=new PlasmaStar(starName,constellationName,decayIndex,energyToEmit,currentAge,energyConsume);
	pl.calculateEmissionRate();
	pl.display();
	break;
	
case 2:

	RadiumStar rs=new RadiumStar(starName,constellationName,decayIndex,energyToEmit,currentAge,energyConsume);
	rs.calculateEmissionRate();
	rs.display();
	break;

case 3:

	DarkStar ds=new DarkStar(starName,constellationName,decayIndex,energyToEmit,currentAge,energyConsume);
	ds.calculateEmissionRate();
	ds.display();
	break;

}

}
	}


