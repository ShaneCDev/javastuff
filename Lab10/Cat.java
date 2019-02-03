package Lab10;

public class Cat extends Animal
{
	private String name;
	public Cat(String name, String type, String gender, int age)
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
	public void makeSound()
	{
		System.out.println("prrrrrr");
	}
	@Override
	public void sleep()
	{
		System.out.println(name + " is sleeping.");
	}
	@Override
	public void eat()
	{
		System.out.println(name + " is eating.");
	}
	public void scratch()
	{
		System.out.println(name + " is scratching.");
	}
	@Override
	public String toString()
	{
		return "Name: " + name + "\n" + super.toString();
	}
}
