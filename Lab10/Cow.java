package Lab10;

public class Cow extends Animal
{
	private String name; 
	public Cow(String name, String type, String gender, int age)
	{
		super(type, gender, age);
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
	@Override
	public void eat()
	{
		System.out.println(name + " is eating.");
	}
	@Override
	public void sleep()
	{
		System.out.println(name + " is sleeping.");
	}
	@Override
	public String toString()
	{
		return "Name: " + name + "\n" + super.toString();
	}
}
