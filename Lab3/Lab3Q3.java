package Lab3;

import java.util.Scanner;

public class Lab3Q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String x = in.next();
		
		for(int i = 0; i < x.length(); i++){
			
			char z = x.charAt(i);
			z += 1;
			System.out.print(z);
			
		}
			in.close();
	}

}
