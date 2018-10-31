package CA2;

public class Luxury extends Apartment
{
	private double luxTax;

	public Luxury(double propTax, double luxTax)
	{
		super(propTax);
		this.luxTax = luxTax;
	}
	public double getLuxTax()
	{
		return luxTax;
	}
	public void setLuxTax(double luxTax)
	{
		this.luxTax = luxTax;
	}
	public String toString()
	{
		return super.toString() + "\n" + "Luxury Tax: " + luxTax;
	}
	
}
