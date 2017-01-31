package edu.Lab_1;

public class RecursiveFib{
	//Recursive Algorithm for Fibonacci Sequence
	public double calculate(int n)
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		return calculate(n-1) + calculate(n-2);
	}
	
	//Standard Recursive Sum Calculation
	public double calculateSum(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		if (n == 2)
		{
			return 2;
		}
		return calculateSum(n - 1) + calculateSum(n-2) + 1;
	}
	
	//Modified Recursive Sum Calculation using the n+2 term for calculate() - 1.
	public double calculateSum2(int n)
	{
		return calculate(n + 2) - 1;
	}
}
