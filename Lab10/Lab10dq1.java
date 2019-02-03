package Lab10;

public class Lab10dq1
{

	public static void main(String[] args)
	{
		Vet vet = new Vet("Shane");
		
		Animal Cat = new Cat("John", "Terrior", "Male", 5);
		
		vet.vaccinate(Cat);

	}

}
