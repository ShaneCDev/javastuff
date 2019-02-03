package Lab6;

public class Lab6CQ1
{

	public static void main(String[] args)
	{
		Thermometer thermA = new Thermometer();
		Thermometer thermB = new Thermometer(10.0);
		double tempB = thermB.getCelsius();
		
		System.out.println("The temp of therm A is " + thermA.getCelsius());
		thermA.setCelsius(20.0);
		System.out.println("The temp of therm A is " + thermA.getCelsius());
		System.out.println("The temp of therm B is " + tempB);
		
	}

}
