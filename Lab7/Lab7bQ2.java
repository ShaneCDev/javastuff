package Lab7;

public class Lab7bQ2
{

	public static void main(String[] args)
	{
		HotelRoom roomA =  new HotelRoom(200, "Double", 80);
		
		
		roomA.setVacancyCheck(1);
		
		
		System.out.println(roomA.toString() + " Room Occupied: " + roomA.isOccupied());
		
		
	}

}
