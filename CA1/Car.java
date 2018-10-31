package CA1;

public class Car
{
	private String makeOfCar;
	private String colourOfCar;
	private int assetNumber = 100;
	private static int numOfCars = 0;
	
	public Car(String makeOfCar, String colourOfCar)
	{
		assetNumber = numOfCars + 100;
		numOfCars++;
		this.makeOfCar = makeOfCar;
		this.colourOfCar = colourOfCar;
		
	}
	public String getMakeOfCar()
	{
		return makeOfCar;
	}
	public void setMakeOfCar(String makeOfCar)
	{
		this.makeOfCar = makeOfCar;
	}
	public String getColourOfCar()
	{
		return colourOfCar;
	}
	public void setColourOfCar(String yearOfCar)
	{
		this.colourOfCar = yearOfCar;
	}
	public  int getAssetNumber()
	{
		return assetNumber;
	}
	public  void setAssetNumber(int assetNumber)
	{
		this.assetNumber = assetNumber;
	}
	public static int getNumOfCars()
	{
		return numOfCars;
	}
	public static void setNumOfCars(int numOfCars)
	{
		Car.numOfCars = numOfCars;
	}
	public String toString()
	{
		return makeOfCar + " Colour: " + colourOfCar;
	}
	
}
