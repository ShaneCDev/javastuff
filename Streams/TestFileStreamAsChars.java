package Streams;

import java.io.*;

public class TestFileStreamAsChars
{
	public static void main(String[] args) throws IOException
	{
		try (
				// Create an output stream to the file
				FileWriter output = new FileWriter("temp2.dat");)
		{
			// Output values to the file
			System.out.println("Writing.");
			for (int i = 1; i <= 10; i++)
				output.write("" + i);
		}

		try (
				// Create an input stream for the file
				FileReader input = new FileReader("temp2.dat");)
		{
			// Read values from the file
			System.out.println("Reading.");
			int value;
			while ((value = input.read()) != -1)
				System.out.print(value + " ");
		}
		System.out.println("Finished.");
	}
}
