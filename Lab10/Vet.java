package Lab10;

public class Vet
{
	private String name;
	private Animal patient;
	public Vet(String name)
	{
		this.name = name;
	}
	public void vaccinate(Animal patient)
	{
		if (patient instanceof Dog )
		{
			System.out.println(name + " is vaccinating.");
			System.out.println(((Dog) patient).getName() + " the dog.");
			patient.makeSound();
			((Dog) patient).wagTail();
			
		}
		else if(patient instanceof Cat)
		{
			System.out.println(name + " is vaccinating.");
			System.out.println(((Cat) patient).getName() + " the cat.");
			patient.makeSound();
			((Cat) patient).scratch();
		}
		
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
}
