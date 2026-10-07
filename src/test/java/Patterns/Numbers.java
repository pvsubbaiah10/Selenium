package Patterns;

public class Numbers {

	public static void main(String[] args) {

//		
//		1
//		12
//		123
//		1234
//		12345

//		for(int i=1;i<=5;i++) {
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}

//		1
//		22
//		333
//		4444

//		   for(int i =1;i<=4;i++) {
//			   
//			   for(int j=1;j<=i;j++) {
//				   System.out.print(i+" ");
//			   }
//			   System.out.println();
//		   }

//		   1
//		   2 3
//		   4 5 6
//		   7 8 9 10

//		int n = 1;
//		for (int i = 1; i <= 4; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print(n++ + " ");
//			}
//			System.out.println();
//		}

//		   1
//		   121
//		   12321
//		   1234321
		int k = 4;
		for (int i = 1; i <= k; i++) {

			// ascending
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			// descending
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}

			System.out.println();
		}

	}

}
