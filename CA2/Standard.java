package CA2;

public class Standard extends Classic
{
	private int numRooms;
	private int numOfPeople;
	private int uniqueNum;
	private String apartmentType;
	private boolean balcony;
	
	public Standard(double propTax, int numRooms, int numOfPeople, int uniqueNum, String apartmentType, boolean balcony)
	{
		super(propTax);
		this.numRooms = numRooms;
		this.numOfPeople = numOfPeople;
		this.uniqueNum = uniqueNum;
		this.apartmentType = apartmentType;
		this.balcony = balcony;
	}
	public boolean isBalcony()
	{
		return balcony;
	}
	public void setBalcony(boolean balcony)
	{
		this.balcony = balcony;
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
		if(isBalcony() == true)
		{
			temp = "Yes, there is a balcony";
			return "Apartment Type: " + apartmentType + "\n" + super.toString() + "\n" + "Unique Number: " + uniqueNum + 
					"\n" + "Number of people living here: " + numOfPeople + "\n" + "Number of rooms: " + numRooms + "\n" + temp + "\n";

		}
		return "Apartment Type: " + apartmentType + "\n" + super.toString() + "\n" + "Unique Number: " + uniqueNum
				+ "\n" + "Number of people living here: " + numOfPeople + "\n" + "Number of rooms: " + numRooms + "\n" + "There is no balcony" + "\n";
 	}
	
}
