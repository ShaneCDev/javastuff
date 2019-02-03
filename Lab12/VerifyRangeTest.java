package Lab12;

import java.util.Scanner;

public class VerifyRangeTest
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter any integer: ");
		int num = in.nextInt();
		
		if(num < 100)
		{
			System.out.println("Number in range!");
		}
		else if(num > 100)
		{
			
		}
	}

}
