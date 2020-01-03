package Shapes;

public class ConePlanet extends Planet{
	private float radius;
	private float height;
	public ConePlanet(String planetName3, float radius,float height ) {
		super(planetName3);
		this.radius = radius;
		this.height = height;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void display3()
	{
		
		float pi = (float) 3.142;
		float rad = (this.getRadius()*this.getRadius());
		float total = (pi*rad*this.getHeight())/3;
		System.out.printf("%ekm3",total);
	}
}
