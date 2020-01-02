package kumar;
import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String species;
		String LocomotionType;
		boolean hasHeatResistance;
		species=s.nextLine();
		LocomotionType=s.nextLine();
		hasHeatResistance  =s.nextBoolean();
		LavaDino l=new LavaDino(species,LocomotionType,hasHeatResistance);
     	l.display(species,LocomotionType,hasHeatResistance);
     	
		

	}

}
