package Lab10;

public class RockBand
{
	private String bandName;
	private String recordCompany;
	public Musician members[] = new Musician[10];
	
	public RockBand(String bandName, String recordCompany, Musician[] members)
	{
		this.bandName = bandName;
		this.recordCompany = recordCompany;
		this.members = members;
	}
	public String getBandName()
	{
		return bandName;
	}
	public void setBandName(String bandName)
	{
		this.bandName = bandName;
	}
	public String getRecordCompany()
	{
		return recordCompany;
	}
	public void setRecordCompany(String recordCompany)
	{
		this.recordCompany = recordCompany;
	}
	public Musician[] getMembers()
	{
		return members;
	}
	public void setMembers(Musician[] members)
	{
		this.members = members;
	}
	public void displayBandDetails()
	{
		Musician.class.toString();
	}
	
	
	
	
	
	
}