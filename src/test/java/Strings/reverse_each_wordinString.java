package Strings;

public class reverse_each_wordinString {

	public static void main(String[] args) {
		
		String w = "Java is good programming langauges";
		
		
		// using StringBuilder 
		
		String[] word=w.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for(String words : word) {
			
			StringBuilder rev = new StringBuilder(words);
			rev.reverse();
			result.append(rev);
			result.append(" ");
		}
         System.out.println(result);
         
       
	}

}
