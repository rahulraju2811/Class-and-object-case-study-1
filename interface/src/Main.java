
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String typeOfPaint;
		int canvasSize;
		Scanner s=new Scanner(System.in);
		typeOfPaint=s.nextLine();
		canvasSize=s.nextInt();
		if(typeOfPaint.equals("water"))
		{
		RegularCanvas rc = new RegularCanvas(typeOfPaint,canvasSize);
		rc.paint();
		}else if(typeOfPaint.equals("glass"))
		{
		GlassCanvas gc = new GlassCanvas(typeOfPaint,canvasSize);
		gc.paint();
		}
		else if(typeOfPaint.equals("oil")){
		OilCanvas oc=new OilCanvas (typeOfPaint,canvasSize);
		oc.paint();
		}
		else
		{
			System.out.print("Option not available");
		}
	}

}