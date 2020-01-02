package inheritance;

public class Studentclass extends Userclass{ //child class
	//private String firstname;
//	private String lastname;
	private int roll;
	private float cgpa;
	
	
	
	public Studentclass(String firstname, String lastname, String email, String mob, int age, int roll,float cgpa) {
		super(firstname,lastname,email,mob,age);
		this.roll=roll;
		this.cgpa=cgpa;
		
	}
	public void display()
	{
		super.display();
		System.out.println("Roll"+this.roll);
		System.out.println("cgpa"+this.cgpa);
	}
	
	

}
