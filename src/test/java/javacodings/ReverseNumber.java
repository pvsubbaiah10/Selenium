package javacodings;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 12345;

		int r = 0;
		int digit;

		while (number > 0) {
			digit = number % 10;
			r = r * 10 + digit;
			number = number / 10;
		}

		System.out.println(r);
	}
}
