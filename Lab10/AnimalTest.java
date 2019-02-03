package Lab10;

public class AnimalTest
{

	public static void main(String[] args)
	{
		Animal dog = new Dog("Fluffy", "Poodle", "Male", 4);
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();

		System.out.println();

		Animal cat = new Cat("Timmy", "Tom", "Female", 2);
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();

		System.out.println();

		Animal myAnimal = dog;
		if (myAnimal instanceof Dog)
		{
			Dog fluffy = (Dog) myAnimal;
			fluffy.wagTail();
		}
		Animal myCat = cat;
		if (myCat instanceof Cat)
		{
			Cat timmy = (Cat) myCat;
			timmy.scratch();
		}
		System.out.println();
		

	}

}
