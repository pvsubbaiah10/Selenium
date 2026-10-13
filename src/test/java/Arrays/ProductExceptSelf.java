package Arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 }; // 24 12 8 6

		// logic
		// 1 → 2 × 3 × 4 = 24
		// 2 → 1 × 3 × 4 = 12
		// 3 → 1 × 2 × 4 = 8
		// 4 → 1 × 2 × 3 = 6

		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			int product = 1;

			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					product = product * arr[j];
				}
			}

			result[i] = product;
		}

		for (int x : result) {
			System.out.print(x + " ");
		}

	}

}
