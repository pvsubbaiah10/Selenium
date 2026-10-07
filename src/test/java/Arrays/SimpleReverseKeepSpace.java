package Arrays;

public class SimpleReverseKeepSpace {
	public static void main(String[] args) {

		String str = "ab cd ef";
		
		
		char[] c =str.toCharArray();
		
		char[] res =new char[c.length];
		
		int j=c.length-1;
		
		
		for(int i=0;i<c.length;i++) {
			
			if(c[i]==' ') {
				res[i]=' ';
			}else {
				while(c[j]==' ') 
					j--;
							
				res[i]=c[j];
				   j--;
				
			}
			
			
		}
		System.out.println(res);
		
		
		
	}
}
