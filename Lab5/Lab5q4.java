package Lab5;

public class Lab5q4
{

	public static void main(String[] args)
	{
		System.out.println(GBPtoEUR(50));
	}

	public static double GBPtoEUR(double x)
	{
		x = x*1.12;
		return x;

	}
}