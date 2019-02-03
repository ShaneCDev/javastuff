package CA4;



public class PassengerBoat extends Boat
{
	int passCapacity;
	boolean carFerry;
	public PassengerBoat(int numOfStaff, int passCapacity, String name, boolean carFerry)
	{
		super(numOfStaff, name);
		this.passCapacity = passCapacity;
	}
	public PassengerBoat(int numOfStaff, int passCapacity, String name)
	{
		super(numOfStaff, name);
		this.passCapacity = passCapacity;
	}
	public boolean isCarCap()
	{
		return carFerry;
	}
	public void setCarCap(boolean carFerry)
	{
		this.carFerry = carFerry;
	}

	public int getPassCapacity()
	{
		return passCapacity;
	}
	public void setPassCapacity(int passCapacity)
	{
		this.passCapacity = passCapacity;
	}
	public String toString()
	{
		return super.toString() + "Passenger Capacity: " + passCapacity;
	}
	
}
