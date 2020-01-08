package polymorphism;

public class Cat {
	private float jumpHeight;
	private int distanceStrolled;
	private String soundsMade;
	public Cat(float jumpHeight, int distanceStrolled, String soundsMade) {
		super();
		this.jumpHeight = jumpHeight;
		this.distanceStrolled = distanceStrolled;
		this.soundsMade = soundsMade;
	}
	public float getJumpHeight() {
		return jumpHeight;
	}
	public void setJumpHeight(float jumpHeight) {
		this.jumpHeight = jumpHeight;
	}
	public int getDistanceStrolled() {
		return distanceStrolled;
	}
	public void setDistanceStrolled(int distanceStrolled) {
		this.distanceStrolled = distanceStrolled;
	}
	public String getSoundsMade() {
		return soundsMade;
	}
	public void setSoundsMade(String soundsMade) {
		this.soundsMade = soundsMade;
	}
public void display() {
	if(jumpHeight>=10.75)
	{
		System.out.println("Generates 7.5 joules");
	}
	else
	{
		System.out.println(jumpHeight);
	}
	if(distanceStrolled>=172)
	{
		System.out.println("Generates 12.35 joules");
	}
	else
	{
		System.out.println(distanceStrolled);
	}
	if(soundsMade=="meow")
	{
		System.out.println("Generates 15 joules");
	}
	else
	{
		System.out.println("soundsMade");
	}
}
}