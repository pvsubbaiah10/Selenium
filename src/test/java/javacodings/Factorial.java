package javacodings;

public class Factorial {

	// recursion

	static int fac(int n) {

		if (n == 0 || n == 1)
			return 1;
		return n * fac(n - 1);

	}

		public static void main(String[] args) {

		System.out.println(fac(5));
		
		  int n=5; int i=1;
		  
		  int f =1; 
		  while (i<=n) {
		  
		  f=f*i; 
		  i++;
		  }
		  System.out.println(f);
		  
		 
	}
}
