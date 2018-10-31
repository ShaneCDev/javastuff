package CA2;

public class Penthouse extends Luxury
{
	private int numRooms;
	private int numOfPeople;
	private String apartmentType;
	private boolean swimmingPool;
	
	public Penthouse(double propTax, double luxTax, int numRooms, int numOfPeople, String apartmentType, boolean swimmingPool)
	{
		super(propTax, luxTax);
		this.numOfPeople = numOfPeople;
		this.numRooms = numRooms;
		this.apartmentType = apartmentType;
		this.swimmingPool = swimmingPool;
	}
	
	public boolean isSwimmingPool()
	{
		return swimmingPool;
	}
	public void setSwimmingPool(boolean swimmingPool)
	{
		this.swimmingPool = swimmingPool;
	}
	public String getApartmentType()
	{
		return apartmentType;
	}
	public void setApartmentType(String apartmentType)
	{
		this.apartmentType = apartmentType;
	}
	public int getNumRooms()
	{
		return numRooms;
	}
	public void setNumRooms(int numRooms)
	{
		this.numRooms = numRooms;
	}
	public int getNumOfPeople()
	{
		return numOfPeople;
	}
	public void setNumOfPeople(int numOfPeople)
	{
		this.numOfPeople = numOfPeople;
	}
	public String toString()
	{
		String temp;
		if(isSwimmingPool() == true)
		{
			temp = "Yes, there is a swimming pool";
			return "Apartment Type: " + apartmentType + "\n" + super.toString() + "\n" + 
					"Number of people living here: " + numOfPeople + "\n" + "Number of rooms: " + numRooms + "\n" + temp + "\n";
		}
		return "Apartment Type: " + apartmentType + "\n" + super.toString() + "\n" + "Number of people living here: " + numOfPeople +
				"\n" + "Number of rooms: " + numRooms + "\n" + "There is no pool" + "\n";
	}
	
}
