package Lab6;

public class Lab6CQ4
{

	public static void main(String[] args)
	{

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer();
		Thermometer thermC = new Thermometer();
		double tempB = thermB.getCelsius();
		
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		 
		 //Get Kelvin
		 	
		 System.out.println("Temp. of Thermometer B in Kelvin is " + tempB);
		 //Set Kelvin
		 thermB.setKelvin(tempB);	
		 ;
		 System.out.println("Temp. of Thermometer B is " + tempB);

		 /*Get Fahrenheit
		 tempC = thermC.getFarenheit(tempC);	//Should be 50F if set to 10C
		 System.out.println("Temp. of Thermometer C in Fahrenheit is " + tempC);
		 //Set Fahrenheit
		 thermC.setFarenheit(50);	//37.77 in Celsius
		 tempC = thermC.getCelsius();
		 System.out.println("Temp. of Thermometer C is " + tempC);
		 
		 
		 thermA.display();
		 thermB.display();
		 thermC.display();
	*/
	}

}
