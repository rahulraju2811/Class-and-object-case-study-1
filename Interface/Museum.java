package interface;;
import java.util.*;
public class Museum extends Expo implements iTrade {

	public float buyPainting()
	{
		float ans=0;
		 for(int i=0;i<3;i++)
		 {
		    	System.out.printf("\n%s",this.listOfPaintings[i].typeOfPainting);
		    	
		 }
		System.out.println("Which painiting you want to buy?");
		int ch;
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		if(ch==1)
		{
			ans=(float)(this.listOfPaintings[0].value*1.5);
		}
		else if(ch==2)
		{
			ans=(float)(this.listOfPaintings[1].value*3.75);
		}
		else if(ch==3)
		{
			ans=(float)(this.listOfPaintings[1].value*1.25);
		}
		return ans;
		
		
	}
	Museum()
	{
		super();
	}
	public float sellPainting(Painting paintingToSell)
	{
		float price=0;
		if(paintingToSell.typeOfPainting.equals(listOfPaintings[0].typeOfPainting))
		{
			price=(float)(this.listOfPaintings[0].value*1);
		}
		else if(paintingToSell.typeOfPainting.equals(listOfPaintings[1].typeOfPainting))
		{
			price=(float)(this.listOfPaintings[1].value*2.35);
		}
		else if(paintingToSell.typeOfPainting.equals(listOfPaintings[2].typeOfPainting))
		{
			price=(float)(this.listOfPaintings[1].value*0.75);
		}
		return price;
	
	}
	
}
