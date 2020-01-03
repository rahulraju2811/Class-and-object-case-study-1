package Shapes;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//String planetName = in.nextLine();
		
		/*if(planetName.equalsIgnoreCase("CubicalPlanet")) {
			float side = in.nextFloat();
			CubicalPlanet c = new CubicalPlanet(planetName,side);
			c.display();
		}*/
		System.out.println("1. Cubical Planet \n 2. Cuboidal Planet \n 3. Sperical Planet \n 4. Conical Planet");
		
		System.out.println("Enter choice: ");
		int n = in.nextInt();
		switch(n)
		{
		case 1 : 
			
				System.out.println("Enter name: ");
				String planetName = in.next();
				System.out.println("Enter Side");
				float side = in.nextFloat();
				CubicalPlanet c = new CubicalPlanet(planetName,side);
				c.display();
				break;
				
		case 2:
			System.out.println("Enter name: ");
			String planetName1 = in.next();
			System.out.println("Enter Lenght:");
			float length = in.nextFloat();
			System.out.println("Enter Breadth:");
			float breadth = in.nextFloat();
			System.out.println("Enter Height:");
			float height = in.nextFloat();
			CuboidPlanet cp = new CuboidPlanet(planetName1,length,breadth,height);
			cp.display1();
			break;
			
		case 3 : 
			System.out.println("Enter name: ");
			String planetName2 = in.next();
			System.out.println("Enter Radius");
			float radius = in.nextFloat();
			SphericalPlanet s = new SphericalPlanet(planetName2,radius);
			s.display2();
			break;
		case 4 : 
			System.out.println("Enter name: ");
			String planetName3 = in.next();
			System.out.println("Enter Radius");
			float radius1 = in.nextFloat();
			System.out.println("Enter Height:");
			float height1 = in.nextFloat();
			ConePlanet cone = new ConePlanet(planetName3,radius1,height1);
			cone.display3();
			break;
			
		default : System.out.println("Invalid Choice");
		break;
		
		}

	}

}
