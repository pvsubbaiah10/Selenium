package javacodings;

public class swaptwonumbers {

	public static void main(String[] args) {

		int a = 2, b = 3;

//		a=a+b; // 5
//		b=a-b; // 2
//		a=a-b; // 3
//		

		// using 3rd vaiable
		int t;
		t = a;
		a = b;
		b = t;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
