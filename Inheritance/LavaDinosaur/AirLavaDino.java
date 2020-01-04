package LavaDinosaur;

public class AirLavaDino {
	private String species2;
	private String locomotionType2;
	private int speed2;
	private int numberOfWings;
	private float speedPerWing;
	private float ashResistance;

	public AirLavaDino(String species2, String locomotionType2, int speed2, int numberOfWings,
	float speedPerWing, float ashResistance) {
	super();
	this.species2 = species2;
	this.locomotionType2 = locomotionType2;
	this.speed2 = speed2;
	this.numberOfWings = numberOfWings;
	this.speedPerWing = speedPerWing;
	this.ashResistance = ashResistance;
	}
	public String getSpecies2() {
	return species2;
	}
	public void setSpecies2(String species2) {
	this.species2 = species2;
	}
	public String getLocomotionType2() {
	return locomotionType2;
	}
	public void setLocomotionType2(String locomotionType2) {
	this.locomotionType2 = locomotionType2;
	}
	public int getSpeed2() {
	return speed2;
	}
	public void setSpeed2(int speed2) {
	this.speed2 = speed2;
	}
	public int getNumberOfWings() {
	return numberOfWings;
	}
	public void setNumberOfWings(int numberOfWings) {
	this.numberOfWings = numberOfWings;
	}
	public float getSpeedPerWing() {
	return speedPerWing;
	}
	public void setSpeedPerWing(float speedPerWing) {
	this.speedPerWing = speedPerWing;
	}
	public float getAshResistance() {
	return ashResistance;
	}
	public void setAshResistance(float ashResistance) {
	this.ashResistance = ashResistance;
	}
	public void displayDinoSpeed()
	{
	float totspeed=(speed2+(numberOfWings*speedPerWing)-ashResistance);
	System.out.println("Dino Details");
	System.out.println("Species : "+this.species2);
	System.out.println("Travels by "+this.locomotionType2+" at a speed of "+totspeed+"km/h");
}
}