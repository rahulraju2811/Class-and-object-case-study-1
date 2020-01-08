
public class OilCanvas extends Canvas  {
	
		public OilCanvas(String typeOfPaint, int canvasSize) {
		super(typeOfPaint, canvasSize);
		// TODO Auto-generated constructor stub
	}

		public void paint()
		{
			if(this.typeOfPaint.equals("oil" ))
			{
				System.out.println("Paint a windmill of CanvasSize "+this.canvasSize);
			}
			else
			{
				System.out.println("Cannot paint.Type mismatch. OilPaints required for Oil Canvas");
			}
		}
	}