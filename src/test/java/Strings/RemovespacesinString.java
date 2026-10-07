package Strings;

public class RemovespacesinString {

	public static void main(String[] args) {
		 String str = "Hello Java World";
		 
		 
		 String result = "";
		 for(int i=0;i<str.length();i++) {
			 
			 if(str.charAt(i)!=' ') {
				 result=result+str.charAt(i);
			 }
		 }
		 
		 System.err.println(result);
		 
		 
		 
		 
		 // using methods
		 
		 //String resul = str.replace(" ", "");
		 String resul = str.replaceAll("[^a-zA-Z0-9]", "");
	        System.out.println(resul);

	}

}
