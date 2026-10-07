package Strings;

public class StringsOPS {

	public static void main(String[] args) {
		
		// 1
		/*
		 * String s1 = "Hello"; String s2 = "Hello";
		 * 
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 */
		
		
		//2 
		
		/*
		 * String s1 = "Hello"; String s2 = new String("Hello");
		 * 
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 */
		
		//3
		
		/*
		 * String s1 = new String("Hello"); String s2 = new String("Hello");
		 * 
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 */

		// 4  Same reference
		
		/*
		 * String s1 = "Hello"; String s2 = s1;
		 * 
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 */
		
		// 5
		
		/*
		 * String s1 = "Hello"; String s2 = "hello";
		 * 
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 */
		
		//6  equalsIgnoreCase
		
		/*
		 * String s1 = "Hello"; String s2 = "hello";
		 * 
		 * System.out.println(s1.equals(s2));
		 * System.out.println(s1.equalsIgnoreCase(s2));
		 */
		
		
		//7 
		
		/*
		 * String s1 = "Hello"; String s2 = "Hel" + "lo";
		 * 
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 * 
		 */
		
		//8 Variable concatenation
		
		/*
		 * String s1 = "Hello";
		 * 
		 * String a = "Hel"; String b = "lo";
		 * 
		 * String s2 = a + b;
		 * 
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 */
		
		//9 .intern()
		
		/*
		 * String s1 = "Hello";
		 * 
		 * String s2 = new String("Hello");
		 * 
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 * 
		 * s2 = s2.intern();
		 * 
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 */
		//10 NULL
		
		/*
		 * String s1 = null; String s2 = null;
		 * 
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 */
		
		//11
		
		/*
		 * final String a = "Hel"; String s1 = "Hello"; String s2 = a + "lo";
		 * 
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 */
		
		
		//12  StringBuilder
		
		/*
		 * String s1 = "Hello";
		 * 
		 * StringBuilder sb = new StringBuilder("Hello"); String s2 = sb.toString();
		 * 
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 */
		
		
		// 13
		
		  
		  String s1 = new String("Hello");
		  String s2 = s1 ; 
		  
		  System.out.println(s1 == s2); 
		  System.out.println(s1.equals(s2));
		 
		
	}

}
