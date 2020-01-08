
public class RegularCanvas extends Canvas  {

	public RegularCanvas(String typeOfPaint, int canvasSize) {
		super(typeOfPaint, canvasSize);
		
	}

	public void paint()
	{
		if(typeOfPaint.equals("water"))
		{
			System.out.println("Paint a flower of CanvasSize "+this.canvasSize);
		}
		else
		{
			System.out.println("Cannot paint.Type mismatch. Water Paints required for Regular Canvas");
		}
	}
}
