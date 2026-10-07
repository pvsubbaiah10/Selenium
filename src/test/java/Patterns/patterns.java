package Patterns;

public class patterns {

	public static void main(String[] args) {
		
//		for(int s=1;s<=4;s++) {
//			
//			for(int k=5-s;k>0;k--) {
//				System.out.print(" ");
//			}
//			
//			for(int d=1;d<=s;d++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//     	}
		
		
		for(int s=5;s>=1;s--) { 
			for(int k=5-s;k>0;k--) {
				System.out.print(" ");
			}
			
			for(int d=1;d<=s;d++) {
				System.out.print("* ");
			}
			System.out.println();
     	}

		System.out.println();
		
		
		
		for(int i =1;i<=5;i++) {
			for(int k=5-i;k>0;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i =5;i>=1;i--) {
			for(int k=5-i;k>0;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		
	int n=5;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n;j++){
		        if(i==1||i==n||j==1||j==n) 
		        	System.out.print("* ");
		        else 
		        	System.out.print("  ");
		    }
		    System.out.println();
		}
		
		
}
	
	}
