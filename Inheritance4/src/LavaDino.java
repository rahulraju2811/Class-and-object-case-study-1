
public class LavaDino extends Dinosaur {
	protected String breath;
	protected String heat;

	public LavaDino(String species, String consumptiontype, String breath, String heat) {
	super(species, consumptiontype);
	this.breath = breath;
	this.heat = heat;
	}


	public String getBreath() {
	return breath;
	}


	public void setBreath(String breath) {
	this.breath = breath;
	}


	public String getHeat() {
	return heat;
	}
	
	public void setHeat(String heat) {
		this.heat = heat;
		}


		public void displaydinodetails()
		{
		System.out.println("Dino Report");
		System.out.println("Base Dino Properties : ");
		System.out.println(species+" is a "+consumptiontype);
		 
		}

}
