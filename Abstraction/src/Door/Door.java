package Door;

public abstract class Door {
	protected String doorName;
	public Door(String doorName) {
		super();
		this.doorName = doorName;
	}
	public String getDoorName() {
		return doorName;
	}
	public void setDoorName(String doorName) {
		this.doorName = doorName;
	}
	
	
}
