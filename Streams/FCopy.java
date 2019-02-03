package Streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FCopy
{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		Scanner input2 = null;

		do
		{
			System.out.println("Please enter a filename: ");

			String fileName = input.next();
			File file = new File(fileName);

			try
			{
				input2 = new Scanner(file);
			} catch (FileNotFoundException e)
			{
				System.out.println("File does not exist");
			}
			try
			{
				for (int i = 0; i < file.length(); i++)
				{
					System.out.println(input2.next());
				}
			} catch (NoSuchElementException e)
			{
				System.out.println("Contents of file printed");
			}
		}

		while (input2 == null);
	}

}
