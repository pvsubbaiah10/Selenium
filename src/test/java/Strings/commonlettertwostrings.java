package Strings;

public class commonlettertwostrings {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "world";

		
		for(int i=0;i<s1.length();i++) {
			
			char ch=s1.charAt(i);
			
			  if (i > 0 && s1.substring(0, i).indexOf(ch) != -1) {
			        continue;
			    }
			
			for(int j=0;j<s2.length();j++) {
				
				if(ch==s2.charAt(j)) {
					System.out.println(ch);
					break;
					
				}
			}
		}
		

		
	}

}
