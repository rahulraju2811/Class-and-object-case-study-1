public class DragonDino extends LavaDino {
	protected int noOfWings;
	protected int noOfScales;

	public DragonDino(String species, String consumptiontype, String breath, String heat, int noOfWings,
	int noOfScales) {
	super(species, consumptiontype, breath, heat);
	this.noOfWings = noOfWings;
	this.noOfScales = noOfScales;
	}
	
	public int getNoOfWings() {
		return noOfWings;
	}

	public void setNoOfWings(int noOfWings) {
		this.noOfWings = noOfWings;
	}

	public int getNoOfScales() {
		return noOfScales;
	}

	public void setNoOfScales(int noOfScales) {
		this.noOfScales = noOfScales;
	}

	public void displaydinodetails()
	{
		System.out.println("Dino Report");
		System.out.println("Dragon Dino Properties : ");
		System.out.println("Files with "+ noOfWings + " wings");
		System.out.println("Has "+ noOfScales + " Scales");
		System.out.println("Inherited Dino Properties");
		System.out.println(species+ " breathes fire");
		System.out.println("It is Resistent to heat");
		System.out.println("Inherited base Dino Properties");
		System.out.println(species+ " is a herbivore");
	 
}
}
