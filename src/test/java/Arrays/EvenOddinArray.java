package Arrays;

import java.util.ArrayList;
import java.util.List;

public class EvenOddinArray {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };

		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();

		for (int n : arr) {

			if (n % 2 == 0) {
				even.add(n);
			} else {
				odd.add(n);
			}
		}

		System.out.print("Even numbers =" + even);
		System.out.println();
		System.out.print("Odd numbers =" + odd);

	}

}
