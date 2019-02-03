package Streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FCopy2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Scanner input2 = null;
		FileWriter writer = null;
		do
		{
			System.out.println("Please enter a filename: ");
			String fileName = input.next();
			File file = new File(fileName);

			try
			{
				input2 = new Scanner(file);

				writer = new FileWriter("helloworld_copy");
			} catch (NoSuchElementException e)
			{
				System.out.println("Contents of file printed");
			} catch (FileNotFoundException e)
			{
				System.out.println("File does not exist");
			} catch (IOException e)
			{

			}
			try
			{
				for(int i = 0; i < file.length(); i ++)
				{
				writer.write(input2.nextLine());
				writer.flush();
				}
			} catch (IOException e)
			{
			
			}
		} while (input2 == null);
		

	}
}
