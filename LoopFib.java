package edu.Lab_1;

public class LoopFib{

	//Fibonacci Sum Calulator using loops.
	public double calculateSum(double n)
	{
		double sum = 0;
		int count = 1;
		while(count <= n)
		{
			sum += calculate(count);
			count++;
		}
		return sum;
	}
	
	//Fibonacci Sum Calulator Pt. 2 using loops.
	public double calculateSum2(double n)
	{
		return calculate(n+2) - 1;
	}
	
	//Fibonacci element calculator using loops.
	public double calculate(double n)
	{
		double fib = 0;
		if(n == 1 || n == 2)
		{
			return 1;
		}
		else
		{
			double a = 1, b = 1, index = 3;
			while(index <= n)
			{
				fib = a+b;
				b = a;
				a = fib;
				index++;
			}
		}
		return fib;
	}
}
