package javacodings;

public class StringandNumberReverseMethods {

	// ******* Number *******

	public static void main(String[] args) {
	int n = 12345;

	int d;
	int r=0;

	while(n>0)
	{
		d = n % 10;
		r = r * 10 + d;
		n = n / 10;

	}
	
	System.out.println("***********using int************");
	System.out.println(r);
	

	// ******* String *******
	
	String num= "123456";
	
	StringBuilder sb = new StringBuilder(num).reverse();
	System.out.println("***********using String with Stingbuilder************");
	System.out.println(sb);
	
	
	String rev ="";
	
	for(int i=num.length()-1;i>=0;i--) {
		rev=rev+num.charAt(i);
		
	}
	System.out.println("***********using String without methods************");
		System.out.println(rev);	
	

	String str = "Java is easy";
	

	// op1 == "avaJ si ysae"
	System.out.println("*********** op1 ************");
	
	
	String[] words =str.split(" ");
	
	for(String word :words) {
		String rev1="";
		
		for(int i=word.length()-1;i>=0;i--) {
			rev1=rev1+word.charAt(i);
		}
		System.out.print(rev1+" ");
		
	}
	
	System.out.println();

	// op2 == "ysae si avaJ"
	
	System.out.println("*********** op2 ************");
	
	 for(int i=str.length()-1;i>=0;i--) {
		 System.out.print(str.charAt(i));
	 }

	 System.out.println();
	 
	 
	// op3 == "easy is Java"
	 
	 System.out.println("*********** op3 ************");
	 
	 
	 String [] arr2 =str.split(" ");
	 
	 for(int i=arr2.length-1;i>=0;i--) {
		 
		 System.out.print(arr2[i]+" ");
	 }
	 
	 System.out.println();
	 

	 

	// **** Reverse String Without Changing Special Characters

	String str1 = "a,b$c%e"; // "c,b$a"
	
	
	char arr3[]=str1.toCharArray();
	
	int left =0;
	
	int right= arr3.length-1;
	
	while(left < right) {
		
		if(!Character.isLetter(arr3[left])){
			left++;
		}else if(!Character.isLetter(arr3[right])) {
			right--;
		}else {
			char temp =arr3[left];
			arr3[left] =arr3[right];
			arr3[right]=temp;
			
			left++;
			right--;
			
		}
	}
	
	System.out.println(new String(arr3));
	
	System.out.println();
	
	// Reverse Only Numbers / Digits
	

	String str2 = "abc12345xyz"; // "abc54321xyz"
	
	 char[] digit =str2.toCharArray();
	 
	 int l=0;
	 int ri=digit.length-1;
	 
	 while(l<ri) {
		 if(!Character.isDigit(digit[l])) {
			 l++;
		 }else if(!Character.isDigit(digit[ri])) {
			 ri--;
		 }else {
			 
			 char t=digit[l];
			 digit[l]=digit[ri];
			 digit[ri]=t;
			 l++;
			 ri--;
		 }
		 
	 }
	 
	 System.out.println(new String(digit));
	
	 System.out.println();

	// Reverse an Array Without Changing Original Array

	int arr[] = { 1, 2, 3, 4, 5 }; // Original: [1, 2, 3, 4, 5]
									// Reverse : [5, 4, 3, 2, 1]
	

	
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]);
	}
	
	
	 System.out.println();
	
      // Reverse an Array total CHANGING arr
	 
	 int AR[]= {1,2,3,4,5,6,7};
	 
	 int al=0;
	 int ar=AR.length-1;
	 
	 while(al<ar) {
		 
		 int at=AR[al];
		 AR[al]=AR[ar];
		 AR[ar]=at;
		 
		 al++;
		 ar--;
		 
	 }
	 
	 for(int ARR:AR) {
		 System.out.print(ARR);
	 }
	 
	 System.out.println();

	// Reverse Only First N Characters

	String str3 = "abcdef"; // "cbadef"
	
    char[] rs =str3.toCharArray();
    
    int N=3;
    
    int sl=0;
    int sr=N-1;
    
    while(sl<sr) {
    	
    	char sc =rs[sl];
    	rs[sl]=rs[sr];
    	rs[sr]=sc;
    	
    	sl++;
    	sr--;
    	
    }
	System.out.println(new String(rs));
	
	 System.out.println();
	 
	 System.out.println("*********** op4 ************");
	 
	// op4 ==  avaJ is easy
	 
	 String str5 = "Java is easy";
	 
	 char[] arr4=str5.toCharArray();
	 
	 int cl=0;
	 int cr=str5.indexOf(" ")-1;
	 
	 while(cl<cr) {
		 
		 char ct =arr4[cl];
		 arr4[cl]=arr4[cr];
		 arr4[cr]=ct;
		 
		 cl++;
		 cr--;
	 }
	 
	 System.out.println(new String(arr4));
	

}
}

