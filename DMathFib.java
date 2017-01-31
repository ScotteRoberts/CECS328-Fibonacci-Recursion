package edu.Lab_1;

import java.lang.Math;

public class DMathFib{
	
	//Fibonacci sum calculator using Grimaldi's Discrete Math formula.
	public double calculateSum(int n)
	{
		int k = 0;
		double sum = 0;
		while(k <= n)
		{
			sum += (1/Math.sqrt(5)) * Math.pow(((1 + Math.sqrt(5))/ 2), k) - (1/Math.sqrt(5)) * Math.pow(((1 - Math.sqrt(5))/ 2), k);
			k++;
		}
		return sum;
	}

}
