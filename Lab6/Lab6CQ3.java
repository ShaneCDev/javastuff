package Lab6;

public class Lab6CQ3
{
	public static void main(String[] args)
	{

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer();
		double tempB;
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
			
		
		 //Get Fahrenheit
		 tempB = thermB.getFarenheit(50);	//Should be 50F if set to 10C
		 System.out.println("Temp. of Thermometer B in Fahrenheit is " + tempB);
		 //Set Fahrenheit
		 thermB.setFarenheit(50);	//37.77 in Celsius
		 tempB = thermB.getCelsius();
		 System.out.println("Temp. of Thermometer B is " + tempB);


	}
}
