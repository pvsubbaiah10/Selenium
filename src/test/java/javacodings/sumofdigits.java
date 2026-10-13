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
       
       
       System.out.println();
       // using String
       
       String s="12345";
      
       char[] c=s.toCharArray();
       
       int su=0;
       
       for(int i=0;i<c.length;i++) {
    	   
    	  int num=Integer.parseInt(String.valueOf(c[i]));
    	  
    	  su=su+num;
       }
       
       System.out.println(su);
       
       
       // using another method
       
		/*
		 * String s = "12345"; 
		 * int sum = 0; 
		 * for (int i = 0; i < s.length(); i++) {
		 *  sum =sum + (s.charAt(i) - '0');
		 *   } 
		 *   
		 * System.out.println("Sum: " + sum);
		 */
	}

}
