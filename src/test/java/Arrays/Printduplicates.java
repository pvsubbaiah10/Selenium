package Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class Printduplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 3, 5, 5, 5 };

		/*
		 * Set<Integer> set = new LinkedHashSet<>(); 
		 * Set<Integer> duplicates = new LinkedHashSet<>();
		 * 
		 * 
		 * for(int n:arr) {
		 *  if(!set.add(n)) {
		 *   duplicates.add(n);
		 *    }
		 *     }
		 * 
		 * System.out.println(duplicates);
		 * 
		 */

		for (int i = 0; i < arr.length; i++) {

			int j;
			for (j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					break;
			}

			if (j < i)
				continue;

			for ( j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i]);
					break;
				}
			}
		}

	}

}
