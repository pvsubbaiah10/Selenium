package javacodings;

public class Palindromenumber {

	public static void main(String[] args) {
		
		
		int n=323;
		
		int original =n;
		
		int rev=0;
		
		int d=0;
		
		while(n>0) {
			
			d=n%10;
			rev=rev*10+d;
			n/=10;
		}
     System.out.println(rev);
     
     if(rev == original) {
		 System.out.println("palindrome");
	 }else {
		 System.out.println("Not Palindrome");
	 }
	
	}

	
}
