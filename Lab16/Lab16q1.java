package Lab16;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Lab16q1
{
	
	public static void main(String[] args)
	{
		
		//FindPrimes printPrimes = new FindPrimes(0, 0);
		FindPrimes fPrimes = new FindPrimes(0, 500000);
		FindPrimes fPrimes2 = new FindPrimes(500000, 10000000);
		Thread findPrimes = new Thread(fPrimes, "prime");
		Thread findPrimes2 = new Thread(fPrimes2, "prime");

	/*	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(new FileOutputStream("primes.txt"));
		String lineFromConsole = in.readLine();
		*/	
		System.out.println("Thread " + findPrimes.getName() + " started.");	
		System.out.println("Thread " + findPrimes2.getName() + " started.");
		findPrimes.start();
		findPrimes2.start();
		//out.println(lineFromConsole);
		//out.close();
		
		
	}
	static class FindPrimes extends Thread
	{
		public long start;
		public long end;
		
		public FindPrimes(long s, long e)
		{
			start = s;
			end = e;
		}
	
		public boolean isPrime()
		{
			boolean prime = true;
		
			for(int i = 2; i <= start/2; i++)
			{
				if(start % i == 0)
				{
					return false;
				}
			}
			return true;
		}
		@Override
		public void run()
		{
			int stop = 0;
			do{
			for(long i = 0; i <= end; i++)
			{
				for(start = 2;start <=i ;start++)
				{
					if(i % start == 0) break;
				}
				if(start == i)
				{
					end++;
					stop++;
					System.out.println("Prime no: = " + i);
				}
			}
		
		}while(stop < 100000);
		
	}
 }
	
}
