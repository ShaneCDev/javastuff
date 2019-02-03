package Lab8;

public class SavingsAccount
{
	private static int accNumber = 0;
	private int numberOfAccounts;
	private int savingsBalance;
	private static int annualInterestRate;
	private int monthlyInterest;
	
	
	public SavingsAccount(int savingBalance, int annualInterestRate)
	{
		accNumber++;
		this.savingsBalance = savingBalance;
		this.annualInterestRate = annualInterestRate;
	}
	public int getAccNumber()
	{
		return accNumber;
	}
	public void setAccNumber(int accNumber)
	{
		SavingsAccount.accNumber = accNumber;
	}
	public int getSavingsBalance()
	{
		return savingsBalance;
	}
	public void setSavingsBalance(int savingsBalance)
	{
		this.savingsBalance = savingsBalance;
	}
	public static int getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public void setAnnualInterestRate(int annualInterestRate)
	{
		monthlyInterest = annualInterestRate / 12;
	}
	public int getNumberOfAccounts()
	{
		return numberOfAccounts;
	}
	public void setNumberOfAccounts(int numberOfAccounts)
	{
		this.numberOfAccounts = numberOfAccounts;
	}
	public int calculateMonthlyInterest()
	{
		monthlyInterest = savingsBalance * getMonthlyInterestRate();
		return savingsBalance = savingsBalance + savingsBalance * getMonthlyInterestRate();
	}
	public int getMonthlyInterest()
	{
		return monthlyInterest;
	}
	public void setMonthlyInterest(int monthlyInterest)
	{
		this.monthlyInterest = monthlyInterest;
	}
	public int getMonthlyInterestRate()
	{
		return annualInterestRate / 12;
	}
	public void display(int savingsBalance, int annualInterestRate)
	{
		savingsBalance = getSavingsBalance() * 100 / 100;
		annualInterestRate = getAnnualInterestRate() * 100 / 100;
		System.out.println("");
		System.out.println("The ending balance is: " + savingsBalance);
		System.out.println("Total interest earned: " + annualInterestRate);
	}

}