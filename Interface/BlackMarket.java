package interface
import java.util.*;
public class BlackMarket extends Expo implements iTrade{

	public float buyPainting()
	{
		float ans=0;
		 for(int i=0;i<3;i++)
		 {
		    	System.out.printf("\n%s",this.listOfPaintings[i].typeOfPainting);
		    	
		 }
		System.out.println("\nWhich painiting you want to buy?");
		int ch;
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		if(ch==1)
		{
			ans=(float)(this.listOfPaintings[0].value*0.5);
		}
		else if(ch==2)
		{
			ans=(float)(this.listOfPaintings[1].value*1.75);
		}
		else if(ch==3)
		{
			ans=(float)(this.listOfPaintings[1].value*2.75);
		}
		return ans;
		
		
	}
	 BlackMarket()
	{
		super();
	}
	public float sellPainting(Painting paintingToSell)
	{
		float price=0;
		if(paintingToSell.typeOfPainting.equals(listOfPaintings[0].typeOfPainting))
		{
			price=(float)(this.listOfPaintings[0].value*0.25);
		}
		else if(paintingToSell.typeOfPainting.equals(listOfPaintings[1].typeOfPainting))
		{
			price=(float)(this.listOfPaintings[1].value*1.35);
		}
		else if(paintingToSell.typeOfPainting.equals(listOfPaintings[2].typeOfPainting))
		{
			price=(float)(this.listOfPaintings[1].value*2.25);
		}
		return price;
	
	}
	
}
