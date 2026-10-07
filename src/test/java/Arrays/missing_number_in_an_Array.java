package Arrays;

public class missing_number_in_an_Array {

	public static void main(String[] args) {
		
		// single number missing
		
		int[] a = { 1, 2, 3, 4, 6,7 };

		int n = a.length + 1;

		int expectedsum = n * (n + 1) / 2;
		int actualsum = 0;
		for (int num : a) {

			actualsum = actualsum + num;// 16
		}
		System.out.println(expectedsum - actualsum);
		
		
		// multiple numbers missing
		
		int[] a2 = {1, 2, 4, 5, 6, 8,10};

		int n1 = 10;

		for (int i = 1; i <= n1; i++) {

		    boolean found = false;

		    for (int num : a2) {
		        if (num == i) {
		            found = true;
		            break;
		        }
		    }

		    if (!found) {
		        System.out.println(i);
		    }
		}
		
	}

}
