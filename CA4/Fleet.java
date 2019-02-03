package CA4;

public class Fleet 
{
	public FreightBoat[] fBoat;
	public PassengerBoat[] pBoat;
	//private String name;
	private String ownersName;
	private String comName;
	private int id;
	
	public Fleet(FreightBoat[] fBoat, PassengerBoat[] pBoat)
	{
		this.pBoat = pBoat;
		this.fBoat = fBoat;
	}	
	public Fleet(FreightBoat[] fBoat, PassengerBoat[] pBoat, String ownersName, String comName)
	{
		this.fBoat = fBoat;
		this.pBoat = pBoat;
		
		this.ownersName = ownersName;
		this.comName = comName;
	}
	public Fleet(PassengerBoat[] pBoat, String ownersName, String comName, int id)
	{
		this.pBoat = pBoat;
		this.id = id;
		this.comName = comName;
		this.ownersName = ownersName;
	}
	public Fleet(String ownersName, String comName, int id)
	{
		this.id = id;
		this.comName = comName;
		this.ownersName = ownersName;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getOwnersName()
	{
		return ownersName;
	}
	public void setOwnersName(String ownersName)
	{
		this.ownersName = ownersName;
	}
	public String getComName()
	{
		return comName;
	}
	public void setComName(String comName)
	{
		this.comName = comName;
	}
	public String toString()
	{
		/*for(FreightBoat x: fBoat)//these loops run through the array and print out all objects within said array
		{
			System.out.println(x);
		}*/
		
		/*for(PassengerBoat j: pBoat)
		{
		
			System.out.println(j);
		}*/
		return "Owners name: " + ownersName + "\n" + "Company name: " + comName + "\n" + "Fleet id: " + id;
	}
}

