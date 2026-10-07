package Strings;

public class StringOrNumberCheck {

	public static void main(String[] args) {
		String str = "1234a5";
		
		
		char[] s=str.toCharArray();
		
        boolean f=false;
        
        for(char c:s) {
        	if(Character.isLetter(c)) {
        		f=true;
        	}
        }
        
//        if(f==true) {
//        	System.out.println("letter");
//        }else {
//        	System.out.println("NOT");
//        }
		System.out.println(f);
	}

}
