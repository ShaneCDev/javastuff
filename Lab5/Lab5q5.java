package Lab5;

public class Lab5q5
{

	public static void main(String[] args)
	{
		System.out.print(power(2, 5));
	}

	public static int power(int x, int n)
	{
		int z = 1;
		for (int i = 0; i < n; i++)
		{
			z *= x;
		}
		return z;
	}
}