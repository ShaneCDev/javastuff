package CA2;

public class BlockManager
{
	public static void main(String[] args)
	{
		Penthouse pentHouse = new Penthouse(100.0, 50.0, 7, 4, "Penthouse", true);
		Multiplex multPlex = new Multiplex(100.0, 50.0, 12, 7, 11598, "Multiplex");
		Standard standard1 = new Standard(100.0, 3, 1, 1557482, "Standard", true);
		Standard standard2 = new Standard(100.0, 2, 1, 11524, "Standard", false);
		Basement basement = new Basement(100.0, 3, 2, 1158, "Basement", true);
		Luxury[] luxApartments = new Luxury[2];
		Classic[] standardApartments = new Classic[3];
		luxApartments[0] = pentHouse;
		luxApartments[1] = multPlex;
		standardApartments[0] = standard1;
		standardApartments[1] = standard2;
		standardApartments[2] = basement;
		
		ApartmentBlock myBlock = new ApartmentBlock(luxApartments, standardApartments);//array are passed into the apartment block 
		System.out.println(myBlock); //both arrays are printed out in turn making an apartment block
	}
}
