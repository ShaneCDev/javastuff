package Lab6;

public class test
{

	public static void main(String[] args)
	{
		Thermometer thermA = new Thermometer(21.0);
		Thermometer thermB =  new Thermometer(10);
		double tempA = thermA.getCelsius();
		double tempB = thermB.getCelsius();
		System.out.println("Thermometer A: ");
		System.out.println("Temp in Celsius is: " + thermA.toString());
		tempA = thermA.getFarenheit(tempA);
		System.out.println("Temp in Fahrenheit is: " + tempA + "F");
		
		 
		 tempB = thermB.getKelvin(30.0);	//Should be 50F if set to 10C
		 System.out.println("Temp. of Thermometer B in Kelvin is " + tempB);
		 tempB = thermB.setKelvin(30);
		 System.out.println("Temp of Therm B in Kelvin is: " + tempB);
		 	
	}

}
