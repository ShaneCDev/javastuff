package CA2;

public class Basement extends Classic
{
	private int numRooms;
	private int numOfPeople;
	private int uniqueNum;
	private String apartmentType;
	private boolean garden;
	
	public Basement(double propTax, int numRooms, int numOfPeople, int uniqueNum, String apartmentType, boolean garden)
	{
		super(propTax);
		this.numRooms = numRooms;
		this.numOfPeople = numOfPeople;
		this.uniqueNum = uniqueNum;
		this.apartmentType = apartmentType;
		this.garden = garden;
	}
	
	public boolean isGarden()
	{
		return garden;
	}
	public void setGarden(boolean garden)
	{
		this.garden = garden;
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
	public int getUniqueNum()
	{
		return uniqueNum;
	}
	public void setUniqueNum(int uniqueNum)
	{
		this.uniqueNum = uniqueNum;
	}
	public String toString()
	{
		String temp;
		if(isGarden() == true)
		{
			temp = "Yes, there is a garden.";
			return "Apartment Type: " + apartmentType + "\n" + super.toString() + "\n" + "Unique Number: " + uniqueNum 
					+ "\n" + "Number of people living here: " + numOfPeople + "\n" + "Number of rooms: " + numRooms + "\n" + temp + "\n";
		}
		return "Apartment Type: " + apartmentType + "\n" + super.toString() + "\n" + "Unique Number: " + uniqueNum 
				+ "\n" + "Number of people living here: " + numOfPeople + "\n" + "Number of rooms: " + numRooms + "\n";
	}
}
