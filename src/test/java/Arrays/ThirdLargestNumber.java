package Arrays;

import java.util.Arrays;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		int[] arr = { 10, 25, 5, 40, 30 };

		int f = Integer.MIN_VALUE;
		int s = Integer.MIN_VALUE;
		int t = Integer.MIN_VALUE;

		for (int n : arr) {

			if (n > f) {
				t = s;
				s = f;
				f = n;
			} else if (n > s) {
				t = s;
				s = n;
			} else if (n > t) {
				t = n;
			}
		}

		System.out.println("3rd largest: " + t);

		System.out.println();

		// using sort

		Arrays.sort(arr);

		System.out.println("3rd largest: " + arr[arr.length - 3]);

		System.out.println();

		// using String

		String str = "10 25 5 40 30";

		String[] sa = str.split(" ");

		int[] a = new int[sa.length];

		for (int i = 0; i < sa.length; i++) {

			a[i] = Integer.parseInt(sa[i]);
		}

		Arrays.sort(a);

		System.out.println("3rd largest: " + a[a.length - 3]);

		System.out.println();

		// using String

		String st = "a5b2c9d7e3";

		String digits = "";

		for (int i = 0; i < st.length(); i++) {

			char ch = st.charAt(i);

			if (Character.isDigit(ch)) {
				digits = digits + ch;
			}
		}

		char[] c = digits.toCharArray();

		Arrays.sort(c);

		System.out.println("3rd largest: " + c[c.length - 3]);

	}

}
