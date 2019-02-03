package Lab10;

public class Animal
{
	private String type;
	private String gender;
	private int age;
	
	public Animal(String type, String gender, int age)
	{
		this.type = type;
		this.gender = gender;
		this.age = age;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void eat()
	{
		System.out.println("Animal is eating.");
	}
	public void sleep()
	{
		System.out.println("Animal is sleeping.");
	}
	public void makeSound()
	{
		System.out.println("Generic sound.");
	}
	public String toString()
	{
		return "Type: " + type + "\n" + "Age: " + age + "\n" + "Gender: " + gender;
	}
}
