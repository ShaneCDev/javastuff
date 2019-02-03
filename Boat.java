package CA4;

public class Boat
{
	private String name;
	private int numOfStaff;
	
	
	public Boat(int numOfStaff, String name)
	{
		this.numOfStaff = numOfStaff;
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	} 
	public int getNumOfStaff()
	{
		return numOfStaff;
	}
	public void setNumOfStaff(int numOfStaff)
	{
		this.numOfStaff = numOfStaff;
	}
	@Override
	public String toString()
	{
		return "Name of Boat: " + name + "\n" + "Number of Staff aboard: " + numOfStaff + "\n";
	}
	
}
