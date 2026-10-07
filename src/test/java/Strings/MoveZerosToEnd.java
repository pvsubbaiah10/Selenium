package Strings;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		
		//MoveZerosToEnd
		
		String str = "32400121200";
		
        StringBuilder nonZero = new StringBuilder();
        int count = 0;
        
        for(char c:str.toCharArray()) {
        	if(c=='0') {
        		count++;
        	}else {
        		nonZero.append(c);
        	}
        }

        for(int i=0;i<count;i++) {
        	nonZero.append('0');
        }
        System.out.println(nonZero.toString());
        
        System.out.println();
        System.out.println("---------  MoveZerosToStart --------");
        
        // MoveZerosToStart
        
        StringBuilder zero = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        
        for(char c:str.toCharArray()) {
        	if(c=='0') {
        		zero.append(c);
        	}else {
        		digits.append(c);
        	}
        }
        
        System.out.println(zero.append(digits));
	}

}
