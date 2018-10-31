package CA1;

public class Address
{
	private String street;
	private String cityOrTown;
	private String county;
	
	public Address(String street, String cityOrTown, String county)//constructor
	{
		this.street = street;
		this.cityOrTown = cityOrTown;
		this.county = county;
	}
	public String getStreet()
	{
		return street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getCityOrTown()
	{
		return cityOrTown;
	}

	public void setCityOrTown(String cityOrTown)
	{
		this.cityOrTown = cityOrTown;
	}

	public String getCounty()
	{
		return county;
	}

	public void setCounty(String county)
	{
		this.county = county;
	}
	public String toString()
	{
		return street + "," + cityOrTown + "," + county;

	}



}
