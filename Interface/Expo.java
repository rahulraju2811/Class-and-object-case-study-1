package interface;;

public class Expo {

	Painting[] listOfPaintings;
	public Expo() {
		listOfPaintings=new Painting[3];
		listOfPaintings[0]=new Painting((float)100,"Water");
		listOfPaintings[1]=new Painting((float)200,"Oil");
		listOfPaintings[2]=new Painting((float)100,"Canvas");
		
		
	}
	void  displayPaintings()
	{
		int i=0;
	    System.out.println("Base prices of Paint:");
	    for(i=0;i<3;i++)
	    {
	    	System.out.printf("\n%s\t%f ",this.listOfPaintings[i].typeOfPainting,this.listOfPaintings[i].value);
	    	
	    }
	}
}
