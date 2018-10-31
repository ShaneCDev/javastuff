package CA2;

public class ApartmentBlock
{
	public Luxury[] luxApartments;
	public Classic[] standardApartments;
	public ApartmentBlock(Luxury[] luxApartments, Classic[] standardApartments)
	{
		this.luxApartments = luxApartments;
		this.standardApartments = standardApartments;
	}
	public String toString()
	{
		for(Luxury x: luxApartments)//these loops run through the array and print out all objects within said array
		{
			System.out.println(x);
		}
		for(Classic j: standardApartments)
		{
			System.out.println(j);
		}
		return " ";
	}
}
