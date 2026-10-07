package Arrays;

public class count_Odd_and_Even {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9};

		int even = 0;
		int odd = 0;

		for (int n : arr) {
			if (n % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		System.out.println(even);
		System.out.println(odd);
	}

}
