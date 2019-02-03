/*	Author: SC
 * 	Date: 9/11/17
 *  Tracks time for one minute then stops
 */
package Lab8;

import java.util.Calendar;

public class Lab8aq1
{

	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		//long startTime = System.currentTimeMillis();
		//long currentTime = System.currentTimeMillis();
		//long start = System.currentTimeMillis();
		long wait = System.currentTimeMillis() + 60000;

		/*while (System.currentTimeMillis() < wait)
		{
			for (int x = 0; x < currentTime; x++)
			{
				while (currentTime - startTime < 1000)
				{
					currentTime = System.currentTimeMillis();
				}
				t.tick();
				startTime = currentTime;
				System.out.println(t.toString());
			}
		}*/
		while(System.currentTimeMillis() < wait)//makes it run for a minute
		{
			long oneSec = System.currentTimeMillis() + 1000;
			while(System.currentTimeMillis() < oneSec); //stops for one second
			t.tick(); //ticks
			System.out.println(t.toString());
		}
	}

}
