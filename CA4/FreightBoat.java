package CA4;

public class FreightBoat extends Boat
{
	int containerCapacity;
	public FreightBoat(int numOfStaff, int containerCapacity, String name)
	{
		super(numOfStaff, name);
		this.containerCapacity = containerCapacity; 
	}
	public int getContainerCapacity()
	{
		return containerCapacity;
	}
	public void setContainerCapacity(int containerCapacity)
	{
		this.containerCapacity = containerCapacity;
	}
	public String toString()
	{
		return super.toString() + "\n" + "Container Capacity: " + containerCapacity;
	}
}


