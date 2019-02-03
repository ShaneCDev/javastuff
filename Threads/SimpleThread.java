package Threads;

public class SimpleThread extends Thread
{
	private static int num = 100;
	
	public SimpleThread()
	{
		this("" + num++);
	}
	public SimpleThread(String name)
	{
		super(name);
		System.out.println("Thread" + " " + getName() + " is alive");
	}
	public void run()
	{
		System.out.println("Thread" + " " + getName() + " is running");
	}
}
