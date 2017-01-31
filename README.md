# Fibonacci-Recursion
Investigating recursive methods
Project Goal:
	This assignment involves experimenting with various approaches to compute S (n), as well as, demonstrating various algebraic techniques for recursive definition.

Resources Used:
•	Eclipse Mars.1 (4.5.1)

Project Tasks:
1. Write a program to calculate S (n) by calculating the values of the Fibonacci sequence recursively. 

2. Write a non-recursive program to calculate S (n). This second program uses the recurrence definition to calculate and TABULATE the values of the Fibonacci sequence. Then, sum these values to find S (n). 

3. Discrete & Combinatorial Mathematics by Ralph Grimaldi outlines a method to obtain the solution g(n)=( 1 √5 )( 1+√5 2 ) n −( 1 √5 )( 1−√5 2 ) n . Algebraically verify that g (n) is a solution of Equ 1 by substituting g (n) in Equ 1. 

4. From task #3, there is now a third method to calculate S (n). Write a third iterative program by summing: S (n)=∑ k=0 n ( 1 √5 )( 1+√5 2 ) k −( 1 √5)( 1−√5 2 ) k .

 5. Use your preferred program to calculate these values of S for n = 10, 20, 30. Also, compute these values of f for n = 12, 22, 32. 

6. Task #7 suggests that S(n)=f (n+2)−1. Prove this identity (using induction). 

7. Finally, there is yet a fourth way to programmatically calculate S (n). 

8. Experiment with your programs to estimate the largest n that can be computed successfully by each program. 

9. Experiment & run the recursive program for several sufficiently large values of n. Execute the other three programs with the same values of n & compare the execution times of the 4 programs. 

10. Write your report and show a demo of your second program. The report should include a summary of your work, a summary & conclusion of your experiments and the results of the experiments, as well as the algebraic work and a printout of your program. What are the advantages or shortcomings of each computation?


Task 1: Write a program to calculate S (n) by calculating the values of the Fibonacci sequence recursively.

Source Code:
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

//Recursive Algorithm for Fibonacci Sequence
	public double calculate(int n)
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		return calculate(n-1) + calculate(n-2);
	}


Task 2: Write a non-recursive program to calculate S (n). This second program uses the recurrence definition to calculate and TABULATE the values of the Fibonacci sequence. Then, sum these values to find S (n).

Source Code:
//Fibonacci sum Calulator using loops.
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


Task 3: Discrete & Combinatorial Mathematics by Ralph Grimaldi outlines a method to obtain the solution g(n)=( 1 √5 )( 1+√5 2 ) n −( 1 √5 )( 1−√5 2 ) n . Algebraically verify that g (n) is a solution of Equ 1 by substituting g (n) in Equ 1.


Task 4: From task #3, there is now a third method to calculate S (n). Write a third iterative program by summing: S (n)=∑ k=0 n ( 1 √5 )( 1+√5 2 ) k −( 1 √5)( 1−√5 2 ) k .

Source Code:
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


Task 5: Use your preferred program to calculate these values of S for n = 10, 20, 30. Also, compute these values of f for n = 12, 22, 32.

Source Code:
System.out.println("\nLoop Fibonacci Sum for test values of 10, 20 and 30.");
System.out.println(obj2.calculateSum(10));
System.out.println(obj2.calculateSum(20));
System.out.println(obj2.calculateSum(30));
		
System.out.println("\nLoop Fibonacci for test values of 12, 22 and 32.");
System.out.println(obj2.calculate(12));
System.out.println(obj2.calculate(22));
System.out.println(obj2.calculate(32));

Sample Output:
Loop Fibonacci Sum for test values of 10, 20 and 30.
143.0
17710.0
2178308.0

Loop Fibonacci for test values of 12, 22 and 32.
144.0
17711.0
2178309.0
Task 6: Task #7 suggests that S(n)=f (n+2)−1. Prove this identity (using induction).


Task 7: Finally, there is yet a fourth way to programmatically calculate S (n).

Source Code:

//Fibonacci Sum Calculator Pt. 2
	public double calculateSum2(double n)
	{
		return calculate(n+2) - 1; // uses either the Recursive or Loop calculate() method on page 3 and 4 of the report, respectively.
	}
  

Task 8: Experiment with your programs to estimate the largest n that can be computed successfully by each program.

Task 9: Experiment & run the recursive program for several sufficiently large values of n. Execute the other three programs with the same values of n & compare the execution times of the 4 programs.

//Class Watch is a personally created class that uses System.currentTimeMillis() to calculate the execution time between .Start() and .Stop(). 

Source Code:

//Speed Tests
System.out.println("\nTesting Recursive solutions for value of 50");
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
Sample Output 2:

Testing Recursive solutions for value of 50:

Recursion Sum 1 is: 3.2951280098E10
Recursion Sum 1 took 47554 milliseconds.

Recursion Sum 2 is: 3.2951280098E10
Recursion Sum 2 took 148029 milliseconds.

Testing Loop solutions for value of 50:

Loop Sum 1 is: 3.2951280098E10
Loop Sum 1 took 0 milliseconds.

Loop Sum 2 is: 3.2951280098E10
Loop Sum 2 took 0 milliseconds.

Grimaldi Loop Sum is: 3.2951280098000053E10
Grimaldi Loop Sum took 0 milliseconds.

Testing Loop solutions for value of 1474 (max value for double):

Loop Sum 1 is: 1.3069892237633987E308
Loop Sum 1 took 4 milliseconds.

Loop Sum 2 is: 1.3069892237633987E308
Loop Sum 2 took 4 milliseconds.

Grimaldi Loop Sum is: 1.3069892237634638E308
Grimaldi Loop Sum took 5 milliseconds.


Task 8 Conclusion: The largest n that the recursive calculators can run is around 50. Anything past an n of 50 takes a painfully long time to calculate. However, the loop calculators can go as high as the max value of the data type. In this case, S(1475) will cause overflow and prints out infinity.

Task 9 Conclusion: Sample Output 2 has the number of milliseconds each method took to execute. The recursive method took upwards of 45000 milliseconds at S(50), where the loop method took a negligible amount of time at S(50).


Task 10: Write your report and show a demo of your second program. The report should include a summary of your work, a summary & conclusion of your experiments and the results of the experiments, as well as the algebraic work and a printout of your program. What are the advantages or shortcomings of each computation?

Conclusion:
	Before this project was assigned, the previous assumption was there were only two methods used to calculate the sum of the Fibonacci sequence: recursively or with a loop using (if) statements. Another mistaken assumption was the belief that either method was somewhat equally effective in execution time. Both assumptions were wrong. In fact, there are five different methods to calculate the sum of a Fibonacci sequence:
1.	Standard recursion using a base case.
2.	Recursion using f(n+2) – 1. // f(n) is finding a Fibonacci element, not sum.
3.	Looping using (if) statements.
4.	Looping using f(n+2) – 1.
5.	Looping using a Discrete Mathematics formula.
Each method is workable, but the looping methods are far more efficient, for a sufficiently large n, than the recursion methods in terms of execution time.
