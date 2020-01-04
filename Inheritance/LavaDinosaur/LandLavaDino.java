package LavaDinosaur;

public class LandLavaDino extends LavaDino{
	private int speed;
	private int feet;
	private String locomotionType;

	public LandLavaDino(String species,String locomotionType, int speed, int feet) {
	super(species);
	this.speed = speed;
	this.feet = feet;
	this.locomotionType=locomotionType;
	}

	public int getSpeed() {
	return speed;
	}
	public void setSpeed(int speed) {
	this.speed = speed;
	}
	public int getFeet() {
	return feet;
	}
	public void setFeet(int feet) {
	this.feet = feet;
	}
	public String getLocomotionType() {
	return locomotionType;
	}
	public void setLocomotionType(String locomotionType) {
	this.locomotionType = locomotionType;
	}

	public void displayDinoSpeed()
	{
	System.out.println("Dino Details");
	System.out.println("Species : "+this.species);
	int travel=speed*feet;
	System.out.println("Travels by "+this.locomotionType+" at a speed of "+travel+"km/h");

}
}
