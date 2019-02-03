package Lab6;

public class Lab6BQ3
{

	public static void main(String[] args)
	{
		Lizard myLizard = new Lizard("Jeff", "Green Scales", "Bearded Dragon");
			
			System.out.println("My lizards name is " + myLizard.name);
			System.out.println("My lizard has " + myLizard.colour);
			System.out.println("My lizard is a " + myLizard.breed);
			
			myLizard.eat();
			myLizard.sleep();
			myLizard.jump();

	}

}
