package inheritance;

public class Userclass {//parent class
	private String firstname;
	private String lastname;
	private String email;
	private String mob;
	private int age;
	public Userclass(String firstname, String lastname, String email, String mob, int age) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mob = mob;
		this.age = age;
	}
	public void display()
	{
		System.out.println("Firstname\t"+this.firstname);
		System.out.println("Lastname\t"+this.lastname);
		System.out.println("Email\t"+this.email);
	    System.out.println("Mobile\t"+this.mob);
	    System.out.println("Age\t"+this.age);
	    
		
	}
	
	
	

}
