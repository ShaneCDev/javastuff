package Lab3;

import java.util.Scanner;


public class Lab3Q2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sentence or your name: ");
		String x = in.next();
		
			for(int i = x.length() - 1; i>= 0; i--){
					
				System.out.print(x.charAt(i));
			}
			
		
		
		
		

	}

}
