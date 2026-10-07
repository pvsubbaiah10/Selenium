package Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };

		Set<Integer> set = new LinkedHashSet<>();

		for (int n : arr) {
			set.add(n);
		}

		System.out.println(set);

		// without methods

		Arrays.sort(arr);
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			

			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[arr.length - 1];
		 for (int k = 0; k < j; k++) {
	            System.out.print(arr[k] + " ");
	        }
	}

}
