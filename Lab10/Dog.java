package Lab10;

public class Dog extends Animal
{
	public String name;
	public Dog(String name, String type, String gender, int age)
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
		System.out.println("Woof woof.");
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
	public void wagTail()
	{
		System.out.println(name + " is wagging their tail.");
	}
	@Override
	public String toString()
	{
		return "Name: " + name + "\n" + super.toString();
	}
}
