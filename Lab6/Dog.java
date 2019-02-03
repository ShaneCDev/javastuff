// Author 	: SC
// Date 	: Oct 18/10/2017
// Purpose 	: Implements a Dog class.
package Lab6;

public class Dog
{//begin dog
	public String name;
	public String colour;//name is accessible to all methods in this class
	public String breed;
	
	public Dog(String dogsName, String dogsColour, String dogsBreed) //constructor method 1
	{
		name = dogsName;
		colour = dogsColour;
		breed = dogsBreed;
	}
	public void bark()
	{
		System.out.println(name + " says Woof Woof");
	}
	public void sleep()
	{
		System.out.println(name + " is sleeping... ");
	}
	public void eat()
	{
		System.out.println(name + " is eating...");
	}
	public String toString(){
		return name + " " + colour;
	}
}// end dog
