package Lab3;

import java.util.Scanner;

public class Lab3Q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String x = in.next();
		
		System.out.println("For coded string press 1, 2 to decode, 3 to exit: ");
		String option = in.next();
				
		switch(option){
		case "1":
				for(int i = 0; i < x.length(); i++){
						char z = x.charAt(i);
						z += 1;
						System.out.print(z);
						}
				break;
		case "2":	
				for(int i = 0; i < x.length(); i++){
						char z = x.charAt(i);
						z -= 1;
						System.out.print(z);
					}
				break;
		case "3":		
				System.out.println("You chose to exit goodbye.");
				break;
		default:
			System.out.println("");
		
		}
			
				
		
		
		}
		
	
		
	
	
	}


