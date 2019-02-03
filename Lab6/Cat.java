package Lab6;

public class Cat
{
	public String name;
	public String colour;
	public int lives;
	
	public Cat(String catsName, String catsColour, int numLives)
	{
		name = catsName;
		colour = catsColour;
		lives = numLives;
	}
	public void prrr()
	{
		System.out.println(name + " is prrrrring");
	}
	public void eat()
	{
		System.out.println(name + " is eating....");
	}
	public void sleep()
	{
		System.out.println(name + " is sleeping....");
	}
	
	
}
