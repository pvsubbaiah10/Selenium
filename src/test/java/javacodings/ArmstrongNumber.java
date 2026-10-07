package javacodings;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		// "An Armstrong number is a number where the sum of its digits raised to the power of the number of digits equals the original number."

		
		/*
		 * int n=153;
		 * 
		 * int temp =n;
		 * 
		 * int c=0;
		 * 
		 * // find digits in number
		 * 
		 * while(temp>0) {
		 * 
		 * temp=temp/10; c++; }
		 * 
		 * int sum=0;
		 * 
		 * temp =n;
		 * 
		 * 
		 * while(temp>0) {
		 * 
		 * int d=temp%10;
		 * 
		 * sum+=Math.pow(d,c); temp=temp/10;
		 * 
		 * }
		 * 
		 * System.out.println(sum == n ? "Armstrong" : "Not Armstrong");
		 */  
		  
		 

		// range

		
		  for (int i = 1; i <= 10000; i++) {
		  
		  int n = i;
		  
		  int temp = n;
		  
		  int c = 0;
		  
		  // find digits in number
		  
		  while (temp > 0) {
		  
		  temp = temp / 10; c++; }
		  
		  int sum = 0;
		  
		  temp = n;
		  
		  while (temp > 0) {
		  
		  int d = temp % 10;
		  
		  sum += Math.pow(d, c); temp = temp / 10;
		  
		  }
		  
		  if (sum == n) { System.out.println(n); }
		  
		  }
		 
	}

}
