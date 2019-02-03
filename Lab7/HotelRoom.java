/*	Author: SC
 * 	Date: 10/11/2017
 * 	Purpose: Hotel Room management program
 */
package Lab7;

public class HotelRoom
{
	private int roomNumber;
	private String roomType;
	private int vacancyCheck;
	private int roomRate;
	
	public HotelRoom(int roomNumber, String roomType, int roomRate)//constructor
	{
		setRoomNumber(roomNumber);
		setRoomType(roomType);
		setRoomRate(roomRate);
	}
	public HotelRoom(int roomNumber, String roomType, int vacancyCheck, int roomRate)
	{
		setRoomNumber(roomNumber);
		setRoomType(roomType);
		setRoomRate(roomRate);
		setVacancyCheck(vacancyCheck);
	}
	public int getRoomRate()
	{
		return roomRate;
	}
	public void setRoomRate(int roomRate)
	{
		this.roomRate = roomRate;
	}
	public int getRoomNumber()
	{
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber)
	{
		this.roomNumber = roomNumber;
	}
	public String getRoomType()
	{
		return roomType;
	}
	public void setRoomType(String roomType)
	{
		this.roomType = roomType;
	}
	public boolean isOccupied()
	{
		if(vacancyCheck == 0)
		{
			return true;
		}
		return false;
	}
	public String toString()
	{
		return "Room Number: " + roomNumber + " " + " Room Type: " + roomType + " Rate: " + roomRate;
	}
	public int getVacancyCheck()
	{
		return vacancyCheck;
	}
	public void setVacancyCheck(int vacancyCheck)
	{
		this.vacancyCheck = vacancyCheck;
	}
}
