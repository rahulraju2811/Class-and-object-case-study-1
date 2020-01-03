package Shapes;

public abstract class Planet {
	protected String planetName;
	public Planet(String planetName) {
		super();
		this.planetName = planetName;
	}
	public String getPlanetName() {
		return planetName;
	}
	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}
	
}

