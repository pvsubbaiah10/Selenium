package javacodings;

public class Fibonacci {
	// Fibonacci is a sequence where every number is the sum of the previous two
	// numbers, starting from 0 and 1.
	static int c = 0;
	// recursion

	static int fib(int n) {

		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	// recursion range

	static void fibrange(int a, int b, int s, int e) {

		if (a > e)
			return;

		if (a >= s) {
			c++;
			System.out.println(a);

		}

		fibrange(b, a + b, s, e);

	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(fib(i) + " ");

		}

		/*
		 * int s = 10; int e = 100; fibrange(0, 1, s, e);
		 * System.out.println("Total count = " + c);
		 */

		// range check

		/*
		 * int n=6;
		 * 
		 * int a=0 , b=1;
		 * 
		 * int c=0;
		 * 
		 * while(a<=n) {
		 * 
		 * System.out.println(a);
		 * 
		 * int next =a+b;
		 * 
		 * a=b; b=next; c++; } System.out.println("total =" + c);
		 */

		// range b/w two numbers

		/*
		 * int s=10; int e=100;
		 * 
		 * int a=0 , b=1;
		 * 
		 * int c=0;
		 * 
		 * while(a<=e) { if(a>=s) { System.out.println(a); c++; }
		 * 
		 * 
		 * int next =a+b; a=b; b=next;
		 * 
		 * } System.out.println("total = " + c);
		 */
	}

}
