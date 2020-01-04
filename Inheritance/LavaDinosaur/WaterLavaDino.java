package LavaDinosaur;

public class WaterLavaDino extends LavaDino {
	private String locomotionType1;
	private int speed1;
	private int numberOfFins;
	private float numberOfTails,lavaMultiplier;
	private String species1;

	public WaterLavaDino(String species1, String locomotionType1, int speed1,
	int numberOfFins, float numberOfTails, float lavaMultiplier) {
	super(species1);
	this.locomotionType1 = locomotionType1;
	this.speed1 = speed1;
	this.numberOfFins = numberOfFins;
	this.numberOfTails = numberOfTails;
	this.lavaMultiplier = lavaMultiplier;
	this.species1=species;
	}
	public String getSpecies1() {
	return species1;
	}
	public void setSpecies1(String species1) {
	this.species1 = species1;
	}
	public String getLocomotionType1() {
	return locomotionType1;
	}
	public void setLocomotionType1(String locomotionType1) {
	this.locomotionType1 = locomotionType1;
	}
	public int getSpeed1() {
	return speed1;
	}
	public void setSpeed1(int speed1) {
	this.speed1 = speed1;
	}
	public int getNumberOfFins() {
	return numberOfFins;
	}
	public void setNumberOfFins(int numberOfFins) {
	this.numberOfFins = numberOfFins;
	}
	public float getNumberOfTails() {
	return numberOfTails;
	}
	public void setNumberOfTails(float numberOfTails) {
	this.numberOfTails = numberOfTails;
	}
	public float getLavaMultiplier() {
	return lavaMultiplier;
	}
	public void setLavaMultiplier(float lavaMultiplier) {
	this.lavaMultiplier = lavaMultiplier;
	}
	public void displayDinoSpeed()
	{

	float tot=(speed1+(numberOfFins+numberOfTails)*lavaMultiplier);
	System.out.println("Dino Details");
	System.out.println("Species : "+this.species1);
	System.out.println("Travels by "+this.locomotionType1+" at a speed of "+tot+"km/h");
	}

}
