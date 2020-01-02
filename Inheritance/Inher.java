package inheritance;

import java.util.Scanner;

public class Inheritanceeg {

	public static void main(String[] args) {
		String firstname;
		String lastname;
		String email;
		String mob;
		int age;
		int roll;
		float cgpa;
		Scanner sc=new Scanner(System.in);
		firstname=sc.next();
		lastname=sc.next();
		email=sc.next();
		mob=sc.next();
	
		age=sc.nextInt();
		roll=sc.nextInt();
		cgpa=sc.nextFloat();
		Studentclass s=new Studentclass(firstname,lastname,email,mob,age,roll,cgpa);
		s.display();
		
		
		

	}

}
