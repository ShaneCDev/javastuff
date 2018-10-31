package CA2;

public class Apartment
{
	private double propTax;
	
	public Apartment(double propTax)
	{
		this.propTax = propTax;
	}

	public double getPropTax()
	{
		return propTax;
	}

	public void setPropTax(double propTax)
	{
		this.propTax = propTax;
	}
	public String toString()
	{
		return "Property Tax: " + propTax;
	}
	
}
