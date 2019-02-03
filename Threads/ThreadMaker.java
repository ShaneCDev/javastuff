package Threads;

public class ThreadMaker
{

	public static void main(String[] args)
	{
		System.out.println("Hello World");
		
		SimpleThread tm = new SimpleThread();
		System.out.println(tm.getState());
		tm.start();
		System.out.println(tm.getState());
		System.out.println("Goodbye");
		
		for(int i = 0; i < 100; i++)
		{
			System.out.println(tm.getState());
		}
	}

}
