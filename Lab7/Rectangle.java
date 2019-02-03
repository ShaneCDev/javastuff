package Lab7;

public class Rectangle
{
	private double rectLength;
	private double rectWidth;
	private String str = "*";
	private String space = "";

	public Rectangle(double length, double width)
	{
		setLength(length);
		setWidth(width);
	}

	public void setLength(double length)
	{
		if (length <= 0)
		{
			length = 1.0;
		} else if (length >= 40.0)
		{
			length = 1.0;
		} else
		{
			rectLength = length;

		}
	}

	public double getLength()
	{
		return rectLength;
	}

	public void setWidth(double width)
	{
		if (width <= 0)
		{
			width = 1.0;
		} else if (width >= 40.0)
		{
			width = 1.0;
		} else
		{
			rectWidth = width;
		}
	}

	public double getWidth()
	{
		return rectWidth;
	}

	public double getArea()
	{
		return rectLength * rectWidth;
	}

	public double getPerimeter()
	{
		return (rectLength + rectWidth) * 2;
	}

	public String printRectangle()
	{

		for (int i = 1; i <= rectWidth; i++)
		{
			for (int j = 1; j <= rectLength; j++)
			{
				if (i == 1 || i == rectWidth || j == 1 || j == rectLength)
				{
					System.out.print(str);
				} else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		return space;

	}

	public String toString()
	{

		return "Width: " + Double.toString(getWidth()) + " Length: " + Double.toString(getLength()) + "\n" + "Area: "
				+ Double.toString(getArea()) + " Perimeter: " + Double.toString(getPerimeter());
	}
}