package Lab10;

public class Circle extends Point
{
	private double radius;

	public Circle(double r)
	{
		setRadius(r);
	}
	public Circle(int x, int y, double r)
	{
		super(x, y);
		setRadius(r);
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double r)
	{
		radius = r;
	}

	public double area()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	public String toString()
	{
		return super.toString() + " Radius: " + radius;
	}
}
