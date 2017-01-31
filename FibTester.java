package edu.Lab_1;

public class FibTester {

	public static void main(String[] args) {
		StopWatch watch = new StopWatch();
		RecursiveFib obj = new RecursiveFib();
		System.out.println("Recursive Fibonachi Test");
		System.out.println(obj.calculateSum(1));
		System.out.println(obj.calculateSum(2));
		System.out.println(obj.calculateSum(5));
		
		LoopFib obj2 = new LoopFib();
		System.out.println("\nLoop Fibonachi Test");
		System.out.println(obj2.calculateSum(1));
		System.out.println(obj2.calculateSum(2));
		System.out.println(obj2.calculateSum(5));
		
		DMathFib obj3 = new DMathFib();
		System.out.println("\nGrimaldi Loop Fibonachi Test");
		System.out.println(obj3.calculateSum(1));
		System.out.println(obj3.calculateSum(2));
		System.out.println(obj3.calculateSum(5));
		
		System.out.println("\nLoop Fibonacci Sum for test values of 10, 20 and 30.");
		System.out.println(obj2.calculateSum(10));
		System.out.println(obj2.calculateSum(20));
		System.out.println(obj2.calculateSum(30));
		
		System.out.println("\nLoop Fibonacci for test values of 12, 22 and 32.");
		System.out.println(obj2.calculate(12));
		System.out.println(obj2.calculate(22));
		System.out.println(obj2.calculate(32));
		
		System.out.println("\nRecursive Fibonachi Test Part 2"); //These are incorrect
		System.out.println(obj.calculateSum2(1));
		System.out.println(obj.calculateSum2(2));
		System.out.println(obj.calculateSum2(5));
		
		//Speed Tests
		System.out.println("\nTesting Recusive solutions for value of 50");
		watch.Start();
		
		System.out.println("\nRecursion Sum 1 is: " + obj.calculateSum(50)); //Recursion Sum
		long recursion1Time = watch.getElapsedTime(); //Time variable
		System.out.println("Recursion Sum 1 took " + recursion1Time + " milliseconds.");
		System.out.println("\nRecursion Sum 2 is: " +obj.calculateSum2(50)); //Recursion Sum using f(n+2) - 1;
		long recursion2Time = watch.getElapsedTime(); //Time2 variable
		System.out.println("Recursion Sum 2 took " + recursion2Time + " milliseconds.");
		
		watch.Stop();
		watch.reset();
		
		
		System.out.println("\nTesting Loop solutions for value of 50");
		watch.Start();
		
		System.out.println("\nLoop Sum 1 is: "+obj2.calculateSum(50)); //Loop Sum
		long loop1Time = watch.getElapsedTime(); // Loop time variable
		System.out.println("Loop Sum 1 took " + loop1Time + " milliseconds.");
		System.out.println("\nLoop Sum 2 is: "+obj2.calculateSum2(50)); //Loop Sum using f(n+2) - 1;
		long loop2Time = watch.getElapsedTime(); //Loop time 2 variable
		System.out.println("Loop Sum 2 took " + loop2Time + " milliseconds.");
		System.out.println("\nGrimaldi Loop Sum is: "+ obj3.calculateSum(50)); // Grimaldi Loop
		long grimaldiLoopTime = watch.getElapsedTime(); //Loop time 3 variable
		System.out.println("Grimaldi Loop Sum took " + grimaldiLoopTime + " milliseconds.");
		
		watch.Stop();
		watch.reset();
		
		
		System.out.println("\nTesting Loop solutions for value of 1474 (max value for double)");
		watch.Start();
		
		System.out.println("\nLoop Sum 1 is: "+obj2.calculateSum(1474)); //Loop Sum
		loop1Time = watch.getElapsedTime();
		System.out.println("Loop Sum 1 took " + loop1Time + " milliseconds.");
		
		System.out.println("\nLoop Sum 2 is: "+obj2.calculateSum2(1474)); //Loop Sum using f(n+2) - 1;
		loop2Time = watch.getElapsedTime();
		System.out.println("Loop Sum 2 took " + loop2Time + " milliseconds.");
		
		System.out.println("\nGrimaldi Loop Sum is: "+ obj3.calculateSum(1474)); // Grimaldi Loop
		grimaldiLoopTime = watch.getElapsedTime();
		System.out.println("Grimaldi Loop Sum took " + grimaldiLoopTime + " milliseconds.");
		
		watch.Stop();
		watch.reset();
	}

}
