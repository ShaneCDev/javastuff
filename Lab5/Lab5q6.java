package Lab5;

public class Lab5q6
{
	
	public static void main(String[] args)
	{
		search('s', "These are methods");
		
	}

	public static char search(char s, String x)
	{
		String x1 = "These are methods";
		char s1 = 's';
		int count =0;
		for (int i = 0;i <x1.length(); i++){
			if(x1.charAt(i)==s1)
				count++;
			//System.out.println("Num of times the char " + s1 + " " + "shows up is" + count);
		}
		System.out.println("Num of times the char " + s1 + " " + "shows up is " + count);
		return s1;
	}
}