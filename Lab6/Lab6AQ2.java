package Lab6;

public class Lab6AQ2
{

	public static void main(String[] args)
	{
		Dog myDog = new Dog("Fluffy", "Brown", "German Shepard");
		Dog myOtherDog = new Dog("Kit", "Black", "Labadour");
			
			System.out.println("My dogs name is " + myDog.name);
			System.out.println("My dogs colour is " + myDog.colour);
			System.out.println("My dogs breed is " + myDog.breed);
			System.out.println("My other dogs name is " + myOtherDog.name);
			System.out.println("My other dogs colour is " + myOtherDog.colour);
			System.out.println("My other dogs breed is " + myOtherDog.breed);
	}

}
