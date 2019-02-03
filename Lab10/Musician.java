package Lab10;

public class Musician extends Person
{
	private String instrument;
	public Musician(String name, String instrument)
	{
		super(name);
		this.instrument = instrument;
	}
	
	public String getInstrument()
	{
		return instrument;
	}
	public void setInstrument(String instrument)
	{
		this.instrument = instrument;
	}
	public String toString()
	{
		return "Name: " + Person.class.getName() + "\n" + "Instrument: " + instrument;
	}
}
