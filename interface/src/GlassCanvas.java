
public class GlassCanvas extends Canvas implements iPaint  {

	public GlassCanvas(String typeOfPaint, int canvasSize) {
		super(typeOfPaint, canvasSize);
		
	}

	public void paint()
	{
		if(typeOfPaint.equals("glass"))
		{
			System.out.println("Paint an hourglass of CanvasSize "+this.canvasSize);
		}
		else
		{
			System.out.println("Cannot paint.Type mismatch. Glass Paints required for Glass Canvas");
		}
	}
}