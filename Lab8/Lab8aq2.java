package Lab8;

import java.util.Scanner;

public class Lab8aq2
{

	public static void main(String[] args)
	{
		SavingsAccount accounts[] = new SavingsAccount[10];
		int startBalance;
		int annualInterestRate;
		int numberOfAccounts;
		//int months;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many accounts would you like to make? ");
		numberOfAccounts = input.nextInt();
		for(int i = 0; i < numberOfAccounts; i++)
		{
		System.out.println("Enter starting balance: ");
		startBalance = input.nextInt();
		System.out.println("Enter annual interest rate: ");
		annualInterestRate = input.nextInt();
		accounts[i] = new SavingsAccount(startBalance, annualInterestRate);
		accounts[i].calculateMonthlyInterest();
		accounts[i].display(startBalance, annualInterestRate);
		}
		input.close();
	}

}
