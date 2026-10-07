package javacodings;

public class Primenumbers {

	public static void main(String[] args) {
		
		//A prime number is a number that is divisible by only two numbers: 1 or itself.
		

		// prime number check
		/*
		 * int num=5; int c=0; //boolean isPrime = true;
		 * 
		 * for (int i = 2; i <= Math.sqrt(num); i++) //for(int i=2; i<=num/2;i++) {
		 * 
		 * if(num%i==0) { c++; //isPrime = false; break;
		 * 
		 * }
		 * 
		 * if(c==0) { //if (isPrime) System.out.println(num + " is Prime"); }else {
		 * System.out.println(num + " is Not Prime"); }
		 * 
		 */
		
		
		// prime numbers print

		
		  int n = 200; int c = 0;
		  
		  for (int num = 100; num <= n; num++) {
		  
		   int count = 0;
		  
		   for (int i = 2; i <= Math.sqrt(num);i++) {
		  
		  if (num % i == 0) { 
			  
			  count++; 
			  break; 
		   }
		  

		  }
		   
			if (count == 0) {
				c++;
				System.out.println(num + " ");

		  }
		  }
		  System.out.println("prime count " + c);
		 

	}
}
