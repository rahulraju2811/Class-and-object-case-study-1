public class Dinosaur {
	public String species;
	protected String consumptiontype;

	public Dinosaur(String species, String consumptiontype) {
	super();
	this.species = species;
	this.consumptiontype = consumptiontype;
	}


	public String getSpecies() {
	return species;
	}


	public void setSpecies(String species) {
	this.species = species;
	}


	public String getConsumptiontype() {
	return consumptiontype;
	}


	public void setConsumptiontype(String consumptiontype) {
	this.consumptiontype = consumptiontype;
	}


	public void displaydinodetails()
	{
	System.out.println("Dino Report");
	System.out.println("Base Dino Properties");
	System.out.println(species+" is a "+consumptiontype);

	}
}
