package Door;

public class StarDoor extends Door {
	private int numberOfStars;
	
	public StarDoor(String doorName,int numberOfStars) {
		super(doorName);
		this.numberOfStars = numberOfStars;
	}

	public int getNumberOfStars() {
		return numberOfStars;
	}

	public void setNumberOfStars(int numberOfStars) {
		this.numberOfStars = numberOfStars;
	}
	public void display() {
		int i,j;
		for(i=1;i<=numberOfStars;i++)
		{
			for(j=numberOfStars;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
		for(i=1;i<=numberOfStars;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
