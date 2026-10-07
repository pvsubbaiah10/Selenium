package Strings;

public class Stringpalindrome {

	public static void main(String[] args) {
		
	String a = "madam";
		
		String r="";
		
		for(int i=a.length()-1;i>=0;i--) {
			r=r+a.charAt(i);
		}
		
		
		if(r.equals(a)) {
			System.out.println("p");
		}else {
			System.out.println("np");
		}
		
	}

}
