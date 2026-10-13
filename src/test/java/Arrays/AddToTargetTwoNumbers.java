package Arrays;

public class AddToTargetTwoNumbers {

	public static void main(String[] args) {

		int[] arr = { 2, 7, 11, 5, 4, 7 };

		int target = 9;

		int c = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					c++;
					System.out.println(i + " " + j);
				}
			}
		}
		System.out.println("Total == " + c);

		System.out.println();
		
		// continuous subarry sum = target.

		int[] arr1 = { 2, 4, 5, 6, 7 };
		int target1 = 15;

		for (int i = 0; i < arr1.length; i++) {

			int s = 0;

			for (int j = i; j < arr1.length; j++) {

				s = s + arr1[j];
				
				if (s == target1) {
					for (int k = i; k <= j; k++) {
						System.out.print(arr1[k]+" ");
					}
					
				}

			}
		}
		
		
		System.out.println();
		System.out.println("---------");
		
		// max sum and sub array
		
		int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = arr[0];
        int start = 0;
        int end = 0;

        for (int i = 0; i < a.length; i++) {

            int sum = 0;

            for (int j = i; j < a.length; j++) {

                sum = sum + a[j];

                if (sum > maxSum) {
                    maxSum = sum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.println("Maximum Sum: " + maxSum);
        System.out.print("Subarray: ");

        for (int i = start; i <= end; i++) {
            System.out.print(a[i] + " ");
        }
		

	}

}
