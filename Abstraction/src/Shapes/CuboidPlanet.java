package Shapes;

public class CuboidPlanet extends Planet {
private float length;
private float breadth;
private float height;

public CuboidPlanet(String planetName1, float length, float breadth, float height ) {
super(planetName1);
this.length = length;
this.breadth = breadth;
this.height = height;
}



public float getLength() {
	return length;
}



public void setLength(float length) {
	this.length = length;
}



public float getBreadth() {
	return breadth;
}



public void setBreadth(float breadth) {
	this.breadth = breadth;
}



public float getHeight() {
	return height;
}



public void setHeight(float height) {
	this.height = height;
}



public void display1()
{
	float total = this.getLength() * this.getBreadth() * this.getHeight();
	System.out.printf("%ekm3",total);
}
}
