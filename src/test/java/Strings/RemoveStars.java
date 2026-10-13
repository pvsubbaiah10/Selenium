package Strings;

public class RemoveStars {

	public static void main(String[] args) {
		String s = "leet**code";

		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			
			char c=s.charAt(i);
			if(c=='*') {
				sb.deleteCharAt(sb.length()-1);
			}else {
				sb.append(c);
			}
		}
		
		System.out.println(sb);
	}

}
