package Lab6;

public class Lizard
{
	public String name;
	public String colour;
	public String breed;
	
	public Lizard(String lizName, String lizColour, String lizBreed)
	{
		name = lizName;
		colour = lizColour;
		breed = lizBreed;
	}
	public void eat()	
	{
		System.out.println(name + " is eating...");
	}
	public void sleep()
	{
		System.out.println(name + " is sleeping...");
	}
	public void jump()
	{
		System.out.println(name + " jumped...");
	}
	
}
