package CA2;

public class Multiplex extends Luxury
{
	private int numOfPeople;
	private int numRooms;
	private int uniqueNum;
	private String apartmentType;
	
	public Multiplex(double propTax, double luxTax, int numOfPeople, int numRooms, int uniqueNum, String apartmentType)
	{
		super(propTax, luxTax);
		this.numOfPeople = numOfPeople;
		this.numRooms = numRooms;
		this.uniqueNum = uniqueNum;
		this.apartmentType = apartmentType;
	}
	public String getApartmentType()
	{
		return apartmentType;
	}
	public void setApartmentType(String apartmentType)
	{
		this.apartmentType = apartmentType;
	}
	public int getNumOfPeople()
	{
		return numOfPeople;
	}
	public void setNumOfPeople(int numOfPeople)
	{
		this.numOfPeople = numOfPeople;
	}
	public int getNumRooms()
	{
		return numRooms;
	}
	public void setNumRooms(int numRooms)
	{
		this.numRooms = numRooms;
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
		return "Apartment Type: " + apartmentType + "\n" + super.toString() + "\n" + "Unique Number: " + uniqueNum + "\n" + "Number of people living here: " + numOfPeople + "\n" + "Number of rooms: " + numRooms + "\n";
	}
	
}						
