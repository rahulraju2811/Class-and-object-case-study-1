package kuamr;

public class Dinosaur {
	private String species;
	private String LocomotionType;
	//private boolean hasHeatResistance;
	
public Dinosaur(String species, String locomotionType) {
		super();
		this.species = species;
		this.LocomotionType = locomotionType;
		
	}

public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getLocomotionType() {
		return LocomotionType;
	}

	public void setLocomotionType(String locomotionType) {
		LocomotionType = locomotionType;
	}

public void display(String species,String locomotionType,boolean hasHeatResistance)
{
	
	
	System.out.println("Species\t"+this.species);
	System.out.println("LocomotionType\t"+this.LocomotionType);
}
}
