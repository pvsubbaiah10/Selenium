package javacodings;

public class sumofdigits {

	public static void main(String[] args) {

      int n =12345;
      
      int sum =0;
      
      while(n>0) {
    	  
    	  int d =n%10;
    	  
    	  sum=sum+d;
    	  n/=10;
    	  
    	  
      }

       System.out.println(sum);
      
	}

}
