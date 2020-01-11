package interface;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int ch;
		Scanner s=new Scanner(System.in);
		System.out.println("Choose the place to buy or sell Paintings :\n1.ArtExpo\n2.Museum\n3.BlackMarket");
		ch=s.nextInt();
		switch(ch)
		{
		   case 1:
			   int opt;
			   ArtExpo art=new ArtExpo();
			   art.displayPaintings();
			   System.out.println("Buy(1) or sell(0)");
			   opt=s.nextInt();
			   if(opt==1)
				   System.out.println("You can buy @ Rs: "+art.buyPainting());
				else
				{
					Painting p=new Painting();
					p.typeOfPainting=s.nextLine();
					System.out.println("You can sell @ Rs:"+art.sellPainting(p));
				}
			   break;
					   
		   case 2:
			   int opt1;
			   Museum m=new Museum();
			   m.displayPaintings();
			   System.out.println("Buy(1) or sell(0)");
			   opt1=s.nextInt();
			   if(opt1==1)
				   System.out.println("You can buy @ rs: "+m.buyPainting());
				else
				{
					Painting p=new Painting();
					p.typeOfPainting=s.nextLine();
					System.out.println("You can sell @ rs:"+m.sellPainting(p));
				}
			   break;	   
		   case 3:
			   int opt2;
			   BlackMarket b=new BlackMarket();
			   b.displayPaintings();
			   System.out.println("Buy(1) or sell(0)");
			   opt2=s.nextInt();
			   if(opt2==1)
				   System.out.println("You can buy @ rs: "+b.buyPainting());
				else
				{
					Painting p=new Painting();
					p.typeOfPainting=s.nextLine();
					System.out.println("You can sell @ rs:"+b.sellPainting(p));
				}
			   break;
		}
		
		
	}

}
