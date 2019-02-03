package Lab10;

import java.util.Scanner;

public class Lab10cQ1
{

	public static void main(String[] args)
	{
		Musician members[] = new Musician[10];
		Scanner in = new Scanner(System.in);
		RockBand myBand = new RockBand("The Beatles", "OVO", members);
		System.out.println("How many band members are there?");
		int bandMembers = in.nextInt();
		for(int x = 0; x < bandMembers; x++)
		{
			System.out.println("Enter band member's name: ");
			String memberName = in.next();
			System.out.println("What instrument do they play?");
			String instrument = in.next();
			members[x] = new Musician(memberName, instrument);
		}
		myBand.displayBandDetails();
	}

}
